package org.orders.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Locator for login.
    By logIn = By.xpath("//a[@class='login']");

    //method to click button.
    public void clickLogin() {
        driver.findElement(logIn).click();
    }

}
