package com.qa.uptake.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.qa.uptake.selenium.Browser;

public class ProductsPage
{
    
    private WebElement pageHeadingText = Browser.driver.findElement(By.xpath("//article[@id='products']//div[@class='hero__title']"));
    private WebElement video = Browser.driver.findElement(By.id("video"));

    public PageHeader  header          = new PageHeader();
   
    public String getHeaderText()
    {
        return pageHeadingText.getText();
    }
    public boolean isVideoDisplayed()
    {
        return video.isDisplayed();
    }


}
