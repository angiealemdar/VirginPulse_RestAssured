package com.ui_task.tests;

import driverFactory.WebDriverFactory;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class TestClick extends BasePage{
  @Test
        public void isClickable(){
        driver.get("https://petstore.swagger.io/");
        driver.manage().window().maximize();
        WebElement element1= driver.findElement(By.cssSelector("h3#operations-tag-pet  .arrow"));
        //BasePage.isClicked(element1);
        Assert.assertTrue(BasePage.isClicked(element1)==true);


    }
}
