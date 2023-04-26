package com.group_5.pages;

import com.group_5.utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UyeolPage extends BasePage {


    @FindBy(xpath = "//a[text()='Üye Ol']")
    public WebElement UyeolBtn;

  @FindBy(xpath = "//h3[.='Hesap Oluştur']")
    public WebElement HesapOlustur;

    @FindBy(css = "#register-name")
    public WebElement AdBox;

    @FindBy(css = "#register-lastname")
    public WebElement SoyadBox;

    @FindBy(css = "#register-email")
    public WebElement EpostaBox;

    @FindBy(css = "#register-password")
    public WebElement SifreBox;

    @FindBy(css = "#register-password-confirm")
    public WebElement SifreTekrariBox;

    @FindBy(xpath = "//label[@for='agree']")
    public WebElement KisiselVerilerCheckBox;

    @FindBy(css = "[for='is_campaign_newsletter']")
    public WebElement elektronikiletiCheckBox;

    @FindBy(xpath = "//button[text()='Üye Ol']")
    public WebElement UyeOlBtn;

    @FindBy(xpath = "//h1[text()='Hesabınız Oluşturuldu!']")
    public WebElement HesabınızOluşturuldu;
    @FindBy(xpath = "//a[text()='Anasayfaya Git']")
    public WebElement AnasayfayaGitBtn;

    public void login() {

        AdBox.sendKeys(ConfigurationReader.get("usernameyusuf"));
        SoyadBox.sendKeys(ConfigurationReader.get("userlastnameYsf"));
        EpostaBox.sendKeys(ConfigurationReader.get("usernameEmailYsf"));
        SifreBox.sendKeys(ConfigurationReader.get("userpasswordYsf"));
        SifreTekrariBox.sendKeys(ConfigurationReader.get("userpassword2Ysf"));
    }


}
