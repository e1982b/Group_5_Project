package com.group_5.test.Yusuf;

import com.group_5.pages.LoginPage;
import com.group_5.pages.SeachPage;
import com.group_5.pages.UyeolPage;
import com.group_5.test.TestBase;
import com.group_5.utilities.BrowserUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class EgxistingTest extends TestBase {

    @Test
    public void UyeOl() throws InterruptedException {
        extentLogger = report.createTest("Kitap Yurdu Register Test");
        UyeolPage uyeolPage = new UyeolPage();
        SeachPage seach = new SeachPage();
        LoginPage loginPage = new LoginPage();
        extentLogger.info("Click Uyeol button");
        uyeolPage.UyeolBtn.click();
        extentLogger.info("Click understand button");
        extentLogger.info("Click understand button");
        seach.understandBtn.click();
        extentLogger.info("Hesap Olustur is visible");
        Assert.assertEquals(uyeolPage.HesapOlustur.getText(), "Hesap Oluştur");
        Thread.sleep(2000);
        loginPage.login1();
        extentLogger.info("KisiselVerilerCheckBox");
        uyeolPage.KisiselVerilerCheckBox.click();
        Thread.sleep(2000);
        extentLogger.info("elektronikiletiCheckBox");
        uyeolPage.elektronikiletiCheckBox.click();
        Thread.sleep(2000);
        extentLogger.info("UyeolBtn");
        uyeolPage.UyeolBtn.click();

    }
}