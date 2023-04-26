package com.group_5.test.Yahya;

import com.group_5.pages.CartPage;
import com.group_5.pages.Elementler;
import com.group_5.pages.SeachPage;
import com.group_5.pages.TemelSayfa;
import com.group_5.test.TestBase;
import com.group_5.utilities.BrowserUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddProductsInCart extends TestBase {

    @Test
    public void addProductInCart() throws InterruptedException {
        extentLogger = report.createTest("Kitap Yurdu Add Products in Cart");

        Elementler elementler = new Elementler();
        extentLogger.info("Click understand button");
        elementler.understandBtn.click();

        extentLogger.info("Hover the first product and click add to cart button");
        BrowserUtils.hover(elementler.cocukKitaplari);
        elementler.cocukKitaplari.click();

        BrowserUtils.hover(elementler.firstBook);
        elementler.firstBook.click();


        extentLogger.info("Hover the second product and click add to cart button");
        BrowserUtils.hover(elementler.secondBook);
        elementler.secondBook.click();
        extentLogger.info("Hover the cart and click 'Sepete Git' button");
        BrowserUtils.hover(elementler.sepetim);
        elementler.sepetim.click();

        Thread.sleep(3000);

        extentLogger.info("Hover the cart and click 'Sepete Git' button");
        BrowserUtils.hover(elementler.sepeteGitBtn);
        elementler.sepeteGitBtn.click();

        extentLogger.info("Verify their prices, quantity and total price");
        Assert.assertEquals(elementler.ÜrünSayisi.getText(), "2");
        Assert.assertEquals(elementler.totalPrice.getText(), "51,56");


    }
}
