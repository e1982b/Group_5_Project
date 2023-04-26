package com.group_5.pages;

import com.group_5.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.html.HTMLInputElement;

public class Elementler extends TemelSayfa {


    @FindBy(xpath ="(//a[@class=\"mn-icon icon-hash\"])[4]")
    public WebElement cocukKitaplari;


    @FindBy(xpath ="(//a[@class=\"add-to-cart rippleButton\"])[1]")
    public WebElement firstBook;

    @FindBy(xpath ="(//a[@class=\"add-to-cart rippleButton\"])[2]")
    public WebElement secondBook;

    @FindBy(id="cart-items")
    public WebElement sepetim;

    @FindBy(id="js-cart")
    public WebElement sepeteGitBtn;

    @FindBy(id="cart-items-text")
    public WebElement ÜrünSayisi;

    @FindBy(xpath = "//*[@class='grand-total']/td[2]")
    public WebElement totalPrice;

    @FindBy(xpath="(//div[@class='ribbon-text'])[1]" )
    public  WebElement anaSayfa;

    @FindBy(xpath ="(//*[@class=' line-clamp-2'])[1]")
    public WebElement ürünSec;

    @FindBy(xpath ="//h1[@class='pr_header__heading']")
    public WebElement KörBaykus;

    @FindBy(xpath = "//a[@id='button-cart']")
    public WebElement sepeteEkle;

    @FindBy(xpath = "//span[@id='cart-items']")
    public WebElement Sepetim;

    @FindBy(xpath ="//a[@id='js-cart']")
    public WebElement sepeteGit;

    @FindBy(id ="cart-items")
    public WebElement quantity;











}
