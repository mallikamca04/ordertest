package com.mallika.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProfilePage {
    WebDriver driver;
    public ProfilePage(WebDriver driver){
        this.driver = driver;
    }

    By accountLink = By.xpath("//a[@class='account']");
    By information = By.xpath("//a[@title='Information']");
    By firstName = By.id("firstname");
    By oldPasswd = By.id("old_passwd");
    By profileSave = By.name("submitIdentity");
    By profileUpdateSuccess = By.cssSelector("//p[@class='alert alert-success']");

    public void clickOnAccount() {
        driver.findElement(accountLink).click();
    }

    public void clickOnInformation() {
        driver.findElement(information);
    }

    public void updateFirstName(String updatedFirstName, String oldPwd) {
        driver.findElement(firstName).sendKeys(updatedFirstName);
        driver.findElement(oldPasswd).sendKeys(oldPwd);
        driver.findElement(profileUpdateSuccess);
    }

    public void clickOnSave() {
        driver.findElement(profileSave).click();
    }
}
