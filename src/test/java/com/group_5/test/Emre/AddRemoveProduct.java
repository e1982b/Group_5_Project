package com.group_5.test.Emre;

import com.group_5.pages.CartPage;
import com.group_5.pages.SeachPage;
import com.group_5.test.TestBase;
import com.group_5.utilities.BrowserUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddRemoveProduct extends TestBase {
    @Test
    public void addRemoveProduct() throws InterruptedException {
        extentLogger = report.createTest("Kitap Yurdu Add&Remove Product Test");
        SeachPage seach = new SeachPage();
        CartPage cart = new CartPage();
        extentLogger.info("Click understand button");
        seach.understandBtn.click();
        extentLogger.info("Navigate to the 'Tüm Kitaplar' and click");
        BrowserUtils.hover(seach.tumKitaplarHover);
        seach.tumKitaplarBtn.click();
        extentLogger.info("Verify that 'Tüm Kitaplar' page loaded");
        Assert.assertEquals(seach.kitapMessage.getText(), "Kitap");
        extentLogger.info("Hover the first product and click add to cart button");
        BrowserUtils.hover(seach.firstProduct);
        seach.firstProductAddCartBtn.click();
        extentLogger.info("Hover the second product and click add to cart button");
        BrowserUtils.hover(seach.secondProduct);
        seach.secondProductAddCartBtn.click();
        extentLogger.info("Hover the cart and click 'Sepete Git' button");
        BrowserUtils.hover(seach.cart);
        seach.cart.click();
        seach.sepeteGitBtn.click();
        extentLogger.info("Verify both products are added to Cart");
        BrowserUtils.verifyElementDisplayed(cart.atomikAliskanliklar);
        Assert.assertEquals(cart.geceYarisiKutuphanesi.getText(), "Gece Yarısı Kütüphanesi");
        extentLogger.info("Verify total price");
        Assert.assertEquals(cart.totalPrice.getText(),"123,36");
        Thread.sleep(1500);
        extentLogger.info("Remove the products from cart");
        cart.removeProductBtn.click();
        Thread.sleep(1500);
        cart.removeProductBtn.click();
        extentLogger.info("Verify all products removed from the cart");
        Thread.sleep(1000);
        Assert.assertEquals(cart.cart.getText(),"0");
        extentLogger.pass("PASSED");


    }
}
