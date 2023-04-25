package com.group_5.test.Hamza;

import com.group_5.pages.AllCategoriesUndAuthorsPage;
import com.group_5.pages.SeachPage;
import com.group_5.test.TestBase;
import com.group_5.utilities.BrowserUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AuthorsPageUndShoppingCartTest extends TestBase {
    @Test
    public void AuthorsundShoppingCart() throws InterruptedException {
        extentLogger = report.createTest("Kitap Yurdu Authors (Yazarlar) page und ShoppingCart Test");
        SeachPage seach = new SeachPage();
        AllCategoriesUndAuthorsPage categorie = new AllCategoriesUndAuthorsPage();

        extentLogger.info("Click understand button");
        seach.understandBtn.click();

        extentLogger.info("Navigate to the Authors (Yazarlar) page and click");
        BrowserUtils.hover(seach.yazarlarBtn);
        seach.yazarlarBtn.click();

        extentLogger.info("Verify that 'the Authors (Yazarlar)' page loaded");
        Assert.assertEquals(categorie.tumYazarlar.getText(), "Tüm Yazarlar ve Kitapları");
        Thread.sleep(1500);

        extentLogger.info("Navigate to the 'Imam Gazali books' and click");
        BrowserUtils.hover(categorie.booksImamGazali);
        categorie.booksImamGazali.click();
        Thread.sleep(1500);

        extentLogger.info("Navigate to the 'Kalplerin Kesfi book' and click");
        BrowserUtils.hover(categorie.bookKalplerinKesfi);
        categorie.bookKalplerinKesfi.click();

        extentLogger.info("Click to the 'Sepete Ekle' button");
        BrowserUtils.hover(categorie.buttonCart);
        categorie.buttonCart.click();
        Thread.sleep(1500);

        extentLogger.info("Click to the 'Sepetim' button");
        BrowserUtils.hover(seach.cart);
        seach.cart.click();
        Thread.sleep(3000);
    }
}
