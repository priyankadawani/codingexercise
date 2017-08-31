package com.qa.uptake.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.uptake.pages.IndustriesPage;
import com.qa.uptake.pages.HomePage;
import com.qa.uptake.pages.ProductsPage;

public class NavigationTests extends BaseTest
{

    @Test
    public void verifyNavigation()
    {
        HomePage homePage = new HomePage();

        //Verify current page is Home page
        Assert.assertEquals(homePage.getHeaderText(), "Actionable Insights." + '\n'
                + "Faster, Better Results.","Header Text is incorrect.");
        Assert.assertEquals(homePage.isButtonDisplayed(), true);

        //Click on the Products link
        ProductsPage productPage = homePage.header.goToProductsPage();
        
        //Verify current page is Products Page
        Assert.assertEquals(productPage.header.isLinkActive("products"), true,"Link is not currently selected.");
        Assert.assertEquals(productPage.getHeaderText(), "Better Outcomes. Faster Results.","Header Text is incorrect.");
        Assert.assertEquals(productPage.isVideoDisplayed(), true);

        //Click on the Industries link
        IndustriesPage industriesPage = homePage.header.goToIndustriesPage();
        
        //Verify current page is Industries Page
        Assert.assertEquals(industriesPage.header.isLinkActive("industries"), true,"Links is not currently selected.");
        Assert.assertEquals(industriesPage.getHeaderText(), "Built to scale insights across global industries","Header Text is incorrect.");
        industriesPage.verifyAllLinksDisplayed();

    }
}
