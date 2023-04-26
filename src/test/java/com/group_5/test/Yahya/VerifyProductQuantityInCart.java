package com.group_5.test.Yahya;

import com.group_5.pages.AnyProductOnHomePage;
import com.group_5.pages.CartPage;
import com.group_5.test.TestBase;
import com.group_5.utilities.BrowserUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyProductQuantityInCart extends TestBase {
    @Test
    public void verifyProductQuantityInCart() {
        extentLogger = report.createTest("Kitap Yurdu Add Products in Cart");

        AnyProductOnHomePage anyProduct= new AnyProductOnHomePage();
        CartPage cartPage=new CartPage();

        extentLogger.info("Verify that home page is visible successfully");
        Assert.assertEquals(anyProduct.anaSayfa.getText(),"Haftanın Yayınevi");

        extentLogger.info("Click 'View Product' for any product on home page");
        BrowserUtils.hover(anyProduct.ürünSec);
        anyProduct.ürünSec.click();

        extentLogger.info("Click understand button");
        anyProduct.understandBtn.click();
        Assert.assertEquals(anyProduct.Roket1.getText(), "Roket 1");

        extentLogger.info("Increase quantity to 4");
        int x = 0;
        for (x = 1; x <= 4; x++) {
            BrowserUtils.hover(anyProduct.sepeteEkle);
            anyProduct.sepeteEkle.click();
        }
        extentLogger.info("Click 'Add to cart' button");
        BrowserUtils.hover(anyProduct.sepetim);
        anyProduct.sepetim.click();
        anyProduct.sepeteGit.click();
        Assert.assertEquals(cartPage.quantity.getText(),"4");




    }

}
