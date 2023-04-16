package com.group_5.test.Emre;

import com.group_5.pages.BasePage;
import com.group_5.pages.SeachPage;
import com.group_5.test.TestBase;
import com.group_5.utilities.BrowserUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchTest extends TestBase {

    @Test
    public void positiveSearchTest() {
        extentLogger = report.createTest("Kitap Yurdu Positive Search Test");
        SeachPage seach = new SeachPage();
        extentLogger.info("Click understand button");
        seach.understandBtn.click();
        extentLogger.info("Navigate to the 'Tüm Kitaplar' and click");
        BrowserUtils.hover(seach.tumKitaplarHover);
        seach.tumKitaplarBtn.click();
        extentLogger.info("Verify that 'Tüm Kitaplar' page loaded");
        Assert.assertEquals(seach.kitapMessage.getText(), "Kitap");
        extentLogger.info("Search 'Java' product in search input and click search button");
        seach.searchInput.sendKeys("Java");
        seach.searchBtn.click();
        extentLogger.info("Verify that searched product is displayed");
        Assert.assertTrue(seach.assertKitap.getText().contains("JAVA"));
        extentLogger.info("Verify that related searched products are displayed");
        Assert.assertEquals(seach.assertTumSonuclar.getText(), "Java için arama sonuçları");
        extentLogger.pass("PASSED");

    }

    @Test
    public void negativeSearchTest() {
        extentLogger = report.createTest("Kitap Yurdu Negative Search Test");
        SeachPage seach = new SeachPage();
        extentLogger.info("Click understand button");
        seach.understandBtn.click();
        extentLogger.info("Search 'casper nirvana' product in search input and click search button");
        seach.searchInput.sendKeys("casper nirvana");
        seach.searchBtn.click();
        extentLogger.info("Verify that searched product NOT found displayed");
        Assert.assertTrue(seach.productNotFoundMessage.isDisplayed());
        extentLogger.pass("PASSED");

    }
}
