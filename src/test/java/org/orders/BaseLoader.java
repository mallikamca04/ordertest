package org.orders;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BaseLoader {

    private WebDriver driver;

    public WebDriver getDriver() {
        System.out.println("Get Driver");
        if (driver == null) {
            initialiseDriver();
        }
        return driver;
    }

    public void initialiseDriver(){
        System.setProperty("webdriver.chrome.driver","D:\\Mallika\\selenium_setup\\Driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
}
