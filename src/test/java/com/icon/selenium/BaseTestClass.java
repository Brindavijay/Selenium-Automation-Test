package com.icon.selenium;


import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTestClass {

    private WebDriver webDriver;

    @Before
    public void setUp() throws Exception {
        webDriver = new FirefoxDriver();
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    @After
    public void tearDown() throws Exception {
        webDriver.quit();

    }
}
