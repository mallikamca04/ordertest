package com.mallika.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrdersPage {
    WebDriver driver;
    public OrdersPage(WebDriver driver){
        this.driver = driver;
    }

    // Locators
    By orderRef = By.id("#order-list > tbody > tr.first_item > td.history_link.bold.footable-first-column > a");

    public boolean verifyOrder() {
        String text = driver.findElement(orderRef).getText();
        System.out.println(text);
        return true;
    }
}
