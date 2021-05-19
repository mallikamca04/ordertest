package com.mallika.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ShippingPage {
    WebDriver driver;
    public ShippingPage(WebDriver driver){
        this.driver = driver;
    }

    // Locators
    By termsCheckbox = By.id("cgv");
    By checkoutButton = By.xpath("//button[@name='processCarrier']");

    public void clickCheckBox() {
        driver.findElement(termsCheckbox).click();
    }

    public void clickCheckoutButton() {
        driver.findElement(checkoutButton).click();
    }

}
