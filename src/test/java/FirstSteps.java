//package com.firsttests.webdriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FirstSteps {
    @Test
    public void startWebDriver() {//TODO

        String s = System.setProperty("webdriver.chrome.driver", "C:\\Users\\Marharyta_Diachenko\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.lego.com/en-us");

        //Assert.assertTrue("title should contain word Lego", driver.getTitle().contains("Lego"));

        driver.close();

    }
}
