package com.test.stepDefs;


import com.test.classes.MainMethods;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class StepDef {

    WebDriver driver;
    MainMethods mainMethods;


    @Before
    public void setup() {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        System.out.println("setupTest() method is running");
        mainMethods = new MainMethods(driver);

    }

    @After
    public void tearDown() {
        driver.quit();
    }



    @Given("^User writes URL to browser$")
        public void user_writes_url_to_browser(){
            mainMethods.navigateToUrl("https://shop.hmusic.hu");
    }


}