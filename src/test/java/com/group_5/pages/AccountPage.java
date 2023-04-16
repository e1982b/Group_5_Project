package com.group_5.pages;

import com.group_5.utilities.BrowserUtils;
import com.group_5.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AccountPage extends BasePage{
    LoginPage loginPage;

    @FindBy(xpath = "//b[text()='Adler Free']")
    public WebElement merhabaKullanici;

    @FindBy(xpath = "//a[@class='common-sprite']")
    public WebElement account;

    @FindBy(xpath = "//a[text()='Çıkış']")
    public WebElement cikis;


    public void verifyLogin(){
        Assert.assertEquals(merhabaKullanici.getText(),ConfigurationReader.get("userForAndLastName"));
    }

}
