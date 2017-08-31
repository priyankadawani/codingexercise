package com.qa.uptake.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


import com.qa.uptake.selenium.Browser;

public class HomePage
{
    private WebElement pageHeadingText        = Browser.driver.findElement(By.xpath(".//div[@class='hero__title']"));
    private WebElement buttonLearnMore = Browser.driver.findElement(By.xpath("//div/button[contains(text(), 'Learn More')]"));

    public PageHeader  header          = new PageHeader();

    public String getHeaderText()
    {
        return pageHeadingText.getText();
    }

    public boolean isButtonDisplayed()
    {
        return buttonLearnMore.isDisplayed();
        
    }
}
