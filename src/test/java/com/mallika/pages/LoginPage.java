package com.mallika.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    // Locators for username and password and login
    By email = By.id("email");
    By password = By.id("passwd");
    By loginBtn = By.id("SubmitLogin");

    //method to enter username.
    public void enterUsername(String user) {
        driver.findElement(email).sendKeys(user);
    }

    //Method to enter password.
    public void enterPassword(String pswd){
        driver.findElement(password).sendKeys(pswd);
    }

    //Method to click login button
    public void clickLogin(){
        driver.findElement(loginBtn).click();
    }
}
