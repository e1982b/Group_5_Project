package com.group_5.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SeachPage extends BasePage{
    @FindBy(xpath = "//h1[.='Kitap']")
    public WebElement kitapMessage;
    @FindBy(xpath = "//span[.='JAVA ile Programlam…']")
    public WebElement assertKitap;
    @FindBy(css = "[class='search-heading-title']")
    public WebElement assertTumSonuclar;
    @FindBy(css = "[class='product-not-found']")
    public WebElement productNotFoundMessage;
    @FindBy(id = "product-582550")
    public WebElement firstProduct;
    @FindBy(css = "[onclick='addToCart(582550);']>i")
    public WebElement firstProductAddCartBtn;
    @FindBy(id = "product-540793")
    public WebElement secondProduct;
    @FindBy(css = "[onclick='addToCart(540793);']>i")
    public WebElement secondProductAddCartBtn;


}
