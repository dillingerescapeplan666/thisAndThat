package com.test.classes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebElement;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;




public class MainMethods {

    WebDriver driver;

    public MainMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUrl(String url) {
        driver.get(url);
    }

    public void logMessage(String string){
        System.out.println(string);
    }


    public void waitSome(int seconds) {
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(seconds));
       WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".customer-panel")));

    }






}