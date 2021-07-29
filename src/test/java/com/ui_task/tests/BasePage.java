package com.ui_task.tests;

import driverFactory.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    static WebDriver driver= WebDriverFactory.getDriver("chrome");
    public static boolean isClicked(WebElement element)
    {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 5);
            wait.until(ExpectedConditions.elementToBeClickable(element));
            element.click();
            return true;
        } catch(Exception e){
            return false;
        }
    }
}
