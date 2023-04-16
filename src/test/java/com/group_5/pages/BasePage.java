package com.group_5.pages;

import com.group_5.utilities.BrowserUtils;
import com.group_5.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//*[.='Kabul Et']")
    public WebElement understandBtn;
    @FindBy(css = "[class='common-sprite button-search']")
    public WebElement searchBtn;
    @FindBy(id = "search-input")
    public WebElement searchInput;
    @FindBy(xpath = "//a[.='Sepete Git']")
    public WebElement sepeteGitBtn;
    @FindBy(id="cart-items")
    public WebElement cart;
    @FindBy(css = "[class='mn-icon icon-arrowRight']")
    public WebElement tumKitaplarBtn;
    @FindBy(xpath = "(//span[.='Tüm Kitaplar'])[1]")
    public WebElement tumKitaplarHover;
    @FindBy(xpath = "//a[.='Giriş Yap']")
    public WebElement girisYap;

    public void getLoginPage(){
        understandBtn.click();
        BrowserUtils.hover(girisYap);
        girisYap.click();
    }


    @FindBy(xpath = "//a[.='Giriş Yap']")
    public WebElement girisYap;

    public void getLoginPage(){
        understandBtn.click();
        BrowserUtils.hover(girisYap);
        girisYap.click();
    }



}
