package com.group_5.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AllCategoriesUndAuthorsPage extends BasePage{

    @FindBy(xpath = "//h1[.='Kitap Kategorileri']")
    public WebElement tumKategorilerPage;

    @FindBy(css = "[alt='Bilgisayar']")
    public WebElement bilgisayarBtn;

    @FindBy(xpath = "//h1[.='Bilgisayar']")
    public WebElement bilgisayarPage;

    @FindBy(xpath = "//h1[.='Tüm Yazarlar ve Kitapları']")
    public WebElement tumYazarlar;

    @FindBy(xpath = "//div[@class='list-item-name']")
    public WebElement booksImamGazali;

    @FindBy(xpath = "(//span[.='Kalplerin Keşfi / Muka…'])")
    public WebElement bookKalplerinKesfi;

    @FindBy(id="button-cart")
    public WebElement buttonCart;









}
