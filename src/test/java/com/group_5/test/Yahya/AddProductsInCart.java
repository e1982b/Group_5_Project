package com.group_5.test.Yahya;

import com.group_5.pages.CartPage;
import com.group_5.pages.CocukKitaplari;
import com.group_5.test.TestBase;
import com.group_5.utilities.BrowserUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddProductsInCart extends TestBase {

    @Test
    public void addProductInCart() throws InterruptedException {
        extentLogger = report.createTest("Kitap Yurdu Add Products in Cart");


        CocukKitaplari cocukKitaplari=new CocukKitaplari();
        CartPage cartPage=new CartPage();
        extentLogger.info("Click understand button");
        cocukKitaplari.understandBtn.click();

        extentLogger.info("Hover the first product and click add to cart button");
        BrowserUtils.hover(cocukKitaplari.cocukKitaplari);
        cocukKitaplari.cocukKitaplari.click();

        BrowserUtils.hover(cocukKitaplari.firstBook);
        cocukKitaplari.firstBook.click();


        extentLogger.info("Hover the second product and click add to cart button");
        BrowserUtils.hover(cocukKitaplari.secondBook);
        cocukKitaplari.secondBook.click();
        extentLogger.info("Hover the cart and click 'Sepete Git' button");
        BrowserUtils.hover(cocukKitaplari.sepetim);
        cocukKitaplari.sepetim.click();

        Thread.sleep(3000);

        extentLogger.info("Hover the cart and click 'Sepete Git' button");
        BrowserUtils.hover(cocukKitaplari.sepeteGitBtn);
        cocukKitaplari.sepeteGitBtn.click();

        extentLogger.info("Verify their prices, quantity and total price");
        Assert.assertEquals(cartPage.ÜrünSayisi.getText(), "2");
        Assert.assertEquals(cartPage.totalFiyat.getText(), "43,94");


    }
}
