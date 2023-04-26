package com.group_5.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AnyProductOnHomePage  extends BasePage {


    @FindBy(xpath="(//div[@class='ribbon-text'])[1]" )
    public WebElement anaSayfa;

    @FindBy(xpath ="(//*[@class=' line-clamp-2'])[1]")
    public WebElement ürünSec;

    @FindBy(xpath ="//h1[@class='pr_header__heading']")
    public WebElement Roket1;

    @FindBy(xpath = "//a[@id='button-cart']")
    public WebElement sepeteEkle;

    @FindBy(xpath = "//span[@id='cart-items']")
    public WebElement sepetim;

    @FindBy(xpath ="//a[@id='js-cart']")
    public WebElement sepeteGit;
}
