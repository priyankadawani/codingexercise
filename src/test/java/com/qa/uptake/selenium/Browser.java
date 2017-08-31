package com.qa.uptake.selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Browser
{
    public static WebDriver driver;

    public static void initWebdriver()
    {
        
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities(); 
        ChromeOptions options = new ChromeOptions();
        options.addArguments("test-type", "allow-file-access-from-files", "disable-infobars");
        desiredCapabilities =DesiredCapabilities.chrome();
        desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, options);
        System.setProperty("webdriver.chrome.driver", "target/test-classes/chromedriver.exe");
        driver= new ChromeDriver(desiredCapabilities);
    }

    public static void open()
    {
        driver.get("https://Uptake.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static void close()
    {
        driver.close();
    }
}
