package com.group_5.test.Deneme;

import com.group_5.pages.AccountPage;
import com.group_5.pages.LoginPage;
import com.group_5.test.TestBase;
import com.group_5.utilities.BrowserUtils;
import org.testng.annotations.Test;

public class deneme extends TestBase {

    LoginPage loginPage;
    AccountPage accountPage;

    @Test
    public void test1() {
        System.out.println("Hallo World");
    }

    @Test
    public void k_Y_LoginWithCorrect_Mail_Pass() {
        loginPage = new LoginPage();
        accountPage = new AccountPage();
        extentLogger = report.createTest("Kitap Yurdu E2E Test");
        extentLogger.info("Login with correct Mail and Password");
        loginPage.login();
        extentLogger.info("Verify that login is successfull");
        accountPage.verifyLogin();
        extentLogger.info("PASSED");
    }

    @Test
    public void k_Y_NotLogin_Test(){
        loginPage = new LoginPage();
        accountPage = new AccountPage();
        extentLogger = report.createTest("Kitap Yurdu E2E Test");
        extentLogger.info("Login not with incorrect Mail and Password");
        loginPage.login("doorfree@gmail.com", "klmn.123");
        extentLogger.info("Verify that login is not successfull");
        loginPage.verifyNOTLogin();
        extentLogger.info("PASSED");
    }

    @Test
    public void ky_LogOutUserAndVerify(){
        loginPage = new LoginPage();
        accountPage = new AccountPage();
        extentLogger = report.createTest("Kitap Yurdu E2E Test");
        extentLogger.info("Login with correct Mail and Password");
        loginPage.login();
        extentLogger.info("Verify that login is successfull");
        accountPage.verifyLogin();
        extentLogger.info("Click Logout Button");
        BrowserUtils.hover(accountPage.account);
        accountPage.cikis.click();
        extentLogger.info("Verify navigate to Homepage");
        loginPage.girisYap.isDisplayed();
        extentLogger.info("PASSED");
    }



}
