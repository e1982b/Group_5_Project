package com.group_5.pages;

import com.group_5.test.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CocukKitaplari extends BasePage {




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
}
