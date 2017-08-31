package com.qa.uptake.pages;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.qa.uptake.selenium.Browser;

public class IndustriesPage
{
    private WebElement pageHeadingText = Browser.driver.findElement(By.xpath("//article[@id='industries']//div[@class='hero__title']"));
    List<WebElement> links = Browser.driver.findElements(By.xpath("//div[@class='industries-list']/a"));
    
    List<String> expectedList =   new ArrayList<String> (Arrays.asList("Agriculture","Aviation","Construction","Energy","Equipment Dealers","Rail","Retail","Mining"));
    List<String> actualList = new ArrayList<String>();
    
    public PageHeader header = new PageHeader();
    
    public String getHeaderText()
    {
        return pageHeadingText.getText();
    }
    
    public void verifyAllLinksDisplayed()
    {
        for (WebElement webLink : links)
        {
            String link = webLink.getText(); 
            actualList.add(link);
        }
        expectedList.removeAll(actualList);
        Assert.assertEquals(expectedList.isEmpty(), true,"Links are missing.");
    }
    
}
