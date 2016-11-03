package com.icon.selenium;


import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class BaseTestClass {

    private WebDriver webDriver;

    @Before
    public void setUp() throws Exception {
        //System.setProperty("webdriver.gecko.driver", "/apps/install/jenkins/jobs/Selenium-Auto/geckodriver");
        DesiredCapabilities capability = DesiredCapabilities.chrome();
        webDriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capability);
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }

    @After
    public void tearDown() throws Exception {
        webDriver.quit();

    }
}
