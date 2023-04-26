package com.group_5.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {
    @FindBy(xpath = "//*[.='Atomik Alışkanlıklar']")
    public WebElement atomikAliskanliklar;
    @FindBy(xpath = "//*[.='Gece Yarısı Kütüphanesi']")
    public WebElement geceYarisiKutuphanesi;
    @FindBy(xpath = "//*[@class='grand-total']/td[2]")
    public WebElement totalPrice;
    @FindBy(css = "[class='fa fa-times red-icon']")
    public WebElement removeProductBtn;



    @FindBy(id="cart-items-text")
    public WebElement ÜrünSayisi;

    @FindBy(xpath = "//*[@class='grand-total']/td[2]")
    public WebElement totalFiyat;

    @FindBy(id ="cart-items")
    public WebElement quantity;
}
