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
       WebElement approveCookie = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#privacyModal > div.privacy-content > div.privacy-button-container > button.privacy-confirm-button.js--privacy-submit")));
       approveCookie.click();
       WebElement sneakerButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("body > div.container > div.parallax-wrapper > div > div:nth-child(1) > a > div.banner-header-wrapper > h2 > small > i")));
       sneakerButton.click();

    }






}