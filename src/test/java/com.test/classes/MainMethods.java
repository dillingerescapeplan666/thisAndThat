package com.test.classes;

import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Assertions.assertThat;




public class MainMethods {

    WebDriver driver;

    public MainMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToUrl(String url) {
        driver.get(url);
    }


    public void openPage(String url) {
        navigateToUrl("https://hammerworld.hu/");
    }






}