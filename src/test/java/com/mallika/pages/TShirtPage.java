package com.mallika.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TShirtPage {
    public static final String ITEM = "item";
    public static final String CART = "cart";
    public static final String CHECKOUT_1 = "checkout1";
    public static final String CHECKOUT_2 = "checkout2";
    public static final String CONFIRM_ADDRESS = "confirm_address";

    WebDriver driver;
    public TShirtPage(WebDriver driver) {
        this.driver = driver;
    }
    By item = By.cssSelector(".product_img_link>img");
    By addToCartButton = By.cssSelector("#add_to_cart > button > span");
    By itemAddedSuccessMsg = By.cssSelector("#layer_cart > div.clearfix > div.layer_cart_product.col-xs-12.col-md-6 > h2");
    By proceedToCheckout = By.xpath("//a[@title='Proceed to checkout']");
    By confirmCheckout = By.cssSelector("#center_column > p.cart_navigation.clearfix > a.button.btn.btn-default.standard-checkout.button-medium");
    By addressConfirm = By.xpath("//button[@name='processAddress']");

    public void clickOnItem(String type){
        if (ITEM.equalsIgnoreCase(type)) {
            driver.findElement(item).click();
        } else if (CART.equalsIgnoreCase(type)) {
            driver.findElement(addToCartButton).click();
        } else if (CHECKOUT_1.equalsIgnoreCase(type)) {
            driver.findElement(proceedToCheckout).click();
        } else if (CHECKOUT_2.equalsIgnoreCase(type)) {
            driver.findElement(confirmCheckout).click();
        } else if (CONFIRM_ADDRESS.equalsIgnoreCase(type)) {
            driver.findElement(addressConfirm).click();
        }
    }


    public String getMessage() {
        return driver.findElement(itemAddedSuccessMsg).getText();
    }
}
