package com.digitalbooking.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class BasePage {
    protected static WebDriver driver;

    public WebDriver chromeDriverConnection() {
        System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        return driver;
    }

    public void goToLink(String url) { driver.get(url); }

    public void write(String inputText, By locator) {
        driver.findElement(locator).clear();
        driver.findElement(locator).sendKeys(inputText);
    }
    public void click(By locator){
        driver.findElement(locator).click();
    }
    public void pressEnterKey(By locator){
        driver.findElement(locator).sendKeys(Keys.ENTER);
    }
    public String getText(By locator) {
        return driver.findElement(locator).getText();
    }
    public static void compareIfContains (String res, String comparison) {
        assertTrue(res.contains(comparison));
    }
}
