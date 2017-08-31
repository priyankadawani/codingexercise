package com.qa.uptake.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import com.qa.uptake.selenium.Browser;

public class PageHeader
{

    private WebElement productsPage = Browser.driver.findElement(By.xpath("//nav/a[contains(@href,'products')]"));
    private WebElement industriesPage = Browser.driver.findElement(By.xpath("//nav/a[contains(@href,'industries')]"));
    
    public ProductsPage goToProductsPage()
    {
        productsPage.click();
        ProductsPage productPage = new ProductsPage();
        return productPage;
    }
    
    public IndustriesPage goToIndustriesPage()
    {
        industriesPage.click();
        IndustriesPage industriesPage = new IndustriesPage();
        return industriesPage;
    }

    public boolean isLinkActive(String text)
    {
        String actual = Browser.driver.findElement(By.xpath("//nav/a[contains(@href,'" + text + "')]"))
                .getAttribute("Class");
        return actual.contains("menu__item--active");

    }

}
