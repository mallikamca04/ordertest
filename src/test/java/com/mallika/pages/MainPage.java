package com.mallika.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
    WebDriver driver;
    public MainPage(WebDriver driver) {
            this.driver = driver;
    }
    By tShirts = By.cssSelector("#block_top_menu > ul > li:nth-child(3) > a");

    public void clickTshirts(){
        driver.findElement(tShirts).click();
    }
}
