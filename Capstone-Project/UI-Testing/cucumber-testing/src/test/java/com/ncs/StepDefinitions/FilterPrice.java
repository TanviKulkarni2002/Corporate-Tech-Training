package com.ncs.StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import io.cucumber.java.en.Then;

public class FilterPrice {

    @Then("the user should see a filter option and set price range to view kurtis")
    public void the_user_should_see_a_filter_option_and_set_price_range_to_view_kurtis() throws InterruptedException {
    float lowerPrice = 2000f;
        lowerPrice=Math.round(lowerPrice * 100.00f)/100.00f; //for rounding off to 2 decimal places
        Thread.sleep(3000);
        WebElement priceFilterOption = CommonMethod.wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#narrow-by-list > div:nth-child(1) > div.filter-options-title")));
        priceFilterOption.click();

        // Thread.sleep(3000);
        WebElement lowerPriceRange = CommonMethod.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/main/div[7]/div[2]/div/div[2]/div/div[1]/div[2]/div/form/div/div[1]/input")));
        lowerPriceRange.clear(); // to erase the place holder value
        lowerPriceRange.sendKeys(String.valueOf(lowerPrice));

        float higherPrice = 5000f;
        // Thread.sleep(3000);
        higherPrice=Math.round(higherPrice * 100.00f)/100.00f; //for rounding off to 2 decimal places
        WebElement higherPriceRange = CommonMethod.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[4]/main/div[7]/div[2]/div/div[2]/div/div[1]/div[2]/div/form/div/div[2]/input")));
        higherPriceRange.clear(); // to erase the place holder value
        higherPriceRange.sendKeys(String.valueOf(higherPrice));

        Thread.sleep(3000);
        // Click on the apply button to view products of entered price range
        WebElement applyButton = CommonMethod.wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[4]/main/div[7]/div[2]/div/div[2]/div/div[1]/div[2]/div/form/div/button")));
        applyButton.click();

        JavascriptExecutor js = (JavascriptExecutor) CommonMethod.driver;
        // Thread.sleep(2000); // CommonMethod.wait to observe the scroll operation

        js.executeScript("window.scrollBy(0, 300);"); // Scroll down operation

        Thread.sleep(3000);
        // Check for the pop display if filter is successfully applied.
        WebElement filterDisplay = CommonMethod.wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#am-shopby-container > ol > li.item.amshopby-item > span")));
        Assert.assertEquals(filterDisplay.isDisplayed(), true);
    }
}