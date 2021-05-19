package com.mallika.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage {
    WebDriver driver;
    public PaymentPage(WebDriver driver){
        this.driver = driver;
    }

    // locators
    By bankWireOption = By.xpath("//a[@class='bankwire']");
    By chequeOption = By.xpath("//a[@class='cheque']");
    By confirmOrder = By.xpath("//*[@id=\"cart_navigation\"]/button");
   // By orderNumberText = By.xpath("//*[@id=\"center_column\"]/div/text()[6]");
    By backToOrders = By.xpath("//a[@title='Back to orders']");

    public void clickPayOption(boolean isCheque) {
        if (isCheque) {
            driver.findElement(chequeOption).click();
        } else {
            driver.findElement(bankWireOption).click();
        }
    }

    public void clickConfirmOrderButton() {
        driver.findElement(confirmOrder).click();
    }

   /* public String getOrderRefNumber() {
        String text = driver.findElement(orderNumberText).getText();
        System.out.println(text);
        return text;
    } */

    public void clickBackToOrders() {
        driver.findElement(backToOrders).click();
    }
}
