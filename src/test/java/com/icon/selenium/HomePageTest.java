package com.icon.selenium;


import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebElement;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import static org.junit.Assert.*;

public class HomePageTest extends  BaseTestClass{


    private String TARGET_HOME_PAGE_TITLE = "Target : Expect More. Pay Less.";
    private String COPY_RIGHT_TEXT_TITLE = "2016";
    private String ITEM_TITLE = "Aveeno Baby Daily Moisture Lotion - 18 oz.";

    @Test
    public void testTargetHomePageLoadable() {
        getWebDriver().get("http://www.target.com");
        assertEquals(TARGET_HOME_PAGE_TITLE, getWebDriver().getTitle());
    }

    @Test
    public void testTargetHomePageFullyLoaded(){
        getWebDriver().get("http://www.target.com");
        WebElement element = getWebDriver().findElement(new ById("copyright-year"));
        String copyRightText = element.getText().trim();
        assertEquals(COPY_RIGHT_TEXT_TITLE, copyRightText);

    }

    @Test
    public void testItemDetailPage() throws Exception{

//        DefaultHttpClient httpClient = new DefaultHttpClient();
//        HttpGet getRequest = new HttpGet(
//                "ITEM_SERVICE_URL");
//        getRequest.addHeader("accept", "application/json");
//
//        HttpResponse response = httpClient.execute(getRequest);
//
//        BufferedReader br = new BufferedReader(
//                new InputStreamReader((response.getEntity().getContent())));
//
//        String output;
//        System.out.println("Output from Server .");
//        String title = "";
//        while ((output = br.readLine()) != null) {}
//        System.out.println(output);

        getWebDriver().get("http://www.target.com/p/aveeno-baby-daily-moisture-lotion-18-oz/-/A-12082571");
        WebElement webElement = getWebDriver().findElement(By.xpath("//*[@id=\"pdpMainContainer\"]/div[4]/div[2]/h2/span"));
        String itemDescription = webElement.getText();
        assertEquals(ITEM_TITLE, itemDescription);
    }
}
