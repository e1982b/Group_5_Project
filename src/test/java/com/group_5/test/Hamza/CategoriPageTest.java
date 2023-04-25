package com.group_5.test.Hamza;

import com.group_5.pages.AllCategoriesUndAuthorsPage;
import com.group_5.pages.SeachPage;
import com.group_5.test.TestBase;
import com.group_5.utilities.BrowserUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CategoriPageTest extends TestBase {
    @Test
    public void CategoriTest() throws InterruptedException {
        extentLogger = report.createTest("Kitap Yurdu all categories (Tüm kategoriler) page Test");
        SeachPage seach = new SeachPage();
        AllCategoriesUndAuthorsPage categorie = new AllCategoriesUndAuthorsPage();

        extentLogger.info("Click understand button");
        seach.understandBtn.click();

        extentLogger.info("Navigate to the 'all categories (Tüm kategoriler)' and click");
        BrowserUtils.hover(seach.tumKategorilerBtn);
        seach.tumKategorilerBtn.click();

        extentLogger.info("Verify that 'all categories (Tüm kategoriler)' page loaded");
        Assert.assertEquals(categorie.tumKategorilerPage.getText(), "Kitap Kategorileri");
        Thread.sleep(1500);

        extentLogger.info("Navigate to the 'Bilgisayar' and click");
        BrowserUtils.hover(categorie.bilgisayarBtn);
        categorie.bilgisayarBtn.click();

        extentLogger.info("Verify that 'Bilgisayar' page loaded");
        Assert.assertEquals(categorie.bilgisayarPage.getText(), "Bilgisayar");
        Thread.sleep(3000);
    }
}
