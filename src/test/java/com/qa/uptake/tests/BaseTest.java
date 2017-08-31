package com.qa.uptake.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.qa.uptake.selenium.Browser;

public class BaseTest
{
    @BeforeSuite
    public void setUp()
    {
        Browser.initWebdriver();
    }

    @BeforeMethod
    public void before()
    {
        Browser.open();
    }

    @AfterMethod
    public void after()
    {
        Browser.close();
    }

}
