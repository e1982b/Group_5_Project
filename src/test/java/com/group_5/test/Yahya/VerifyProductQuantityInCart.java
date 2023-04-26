package com.group_5.test.Yahya;

import com.group_5.pages.BasePage;
import com.group_5.pages.Elementler;
import com.group_5.test.TestBase;
import com.group_5.utilities.BrowserUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyProductQuantityInCart extends TestBase {
    @Test
    public void verifyProductQuantityInCart() {
        extentLogger = report.createTest("Kitap Yurdu Add Products in Cart");
        Elementler elementler = new Elementler();

        extentLogger.info("Verify that home page is visible successfully");
        Assert.assertEquals(elementler.anaSayfa.getText(),"Haftanın Yayınevi");

        extentLogger.info("Click 'View Product' for any product on home page");
        BrowserUtils.hover(elementler.ürünSec);
        elementler.ürünSec.click();

        extentLogger.info("Click understand button");
        elementler.understandBtn.click();
        Assert.assertEquals(elementler.KörBaykus.getText(), "Kör Baykuş");

        extentLogger.info("Increase quantity to 4");
        int x = 0;
        for (x = 1; x <= 4; x++) {
            BrowserUtils.hover(elementler.sepeteEkle);
            elementler.sepeteEkle.click();
        }
        extentLogger.info("Click 'Add to cart' button");
        BrowserUtils.hover(elementler.Sepetim);
        elementler.sepetim.click();
        elementler.sepeteGit.click();
        Assert.assertEquals(elementler.quantity.getText(),"4");




    }

}
