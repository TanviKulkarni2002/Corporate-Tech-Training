package com.ncs.PositiveTestcases;

import org.openqa.selenium.JavascriptExecutor;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

@SuppressWarnings("unused")
public class LehengaCholiModule {
    private WebDriver driver;
    private WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        // WebDriverManager.edgedriver().setup();
        // driver = new EdgeDriver();

        // WebDriverManager.firefoxdriver().setup();
        // driver = new FirefoxDriver();
        
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        driver.get("https://www.saree.com");
    }

    @BeforeMethod
    public void viewLehengaCholi() throws InterruptedException{
        //Click on the Lehenga and Choli Tab in the Navigation Bar
        Thread.sleep(5000);
        WebElement navLehengaCholiTab = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"ui-id-4\"]")));
        navLehengaCholiTab.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saree.com/lehenga-choli");
    }

    @Test
    public void successfulFilteringPrice() throws InterruptedException{
        float lowerPrice = 2000.277f;
        lowerPrice=Math.round(lowerPrice * 100.00f)/100.00f; //for rounding off to 2 decimal places
        Thread.sleep(3000);
        WebElement priceFilterOption = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#narrow-by-list > div:nth-child(1)")));
        priceFilterOption.click();

        Thread.sleep(3000);
        WebElement lowerPriceRange = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/main/div[6]/div[2]/div/div[2]/div/div[1]/div[2]/div/form/div/div[1]/input")));
        lowerPriceRange.clear(); // to erase the place holder value
        lowerPriceRange.sendKeys(String.valueOf(lowerPrice));

        float higherPrice = 20000.274f;
        Thread.sleep(3000);
        higherPrice=Math.round(higherPrice * 100.00f)/100.00f; //for rounding off to 2 decimal places
        WebElement higherPriceRange = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/main/div[6]/div[2]/div/div[2]/div/div[1]/div[2]/div/form/div/div[2]/input")));
        higherPriceRange.clear(); // to erase the place holder value
        higherPriceRange.sendKeys(String.valueOf(higherPrice));

        Thread.sleep(3000);
        // Click on the apply button to view products of entered price range
        WebElement applyButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/main/div[6]/div[2]/div/div[2]/div/div[1]/div[2]/div/form/div/button")));
        applyButton.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Thread.sleep(2000); // wait to observe the scroll operation

        js.executeScript("window.scrollBy(0, 300);"); // Scroll down operation

        // Check for the pop display if filter is successfully applied.
        WebElement filterDisplay = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#am-shopby-container > ol > li.item.amshopby-item > span")));
        Assert.assertEquals(filterDisplay.isDisplayed(), true);
    }

    @Test
    public void successfulFilteringColor() throws InterruptedException{
        //Testing only one color components for now
        WebElement colorFilterOption = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#narrow-by-list > div:nth-child(2)")));
        colorFilterOption.click();

        // Thread.sleep(3000);
        WebElement brownColorOption = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#narrow-by-list > div.filter-options-item.allow.active > div.filter-options-content > form > div > div:nth-child(1) > a")));
        brownColorOption.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(3000);

        js.executeScript("window.scrollBy(0, 300);"); // Scroll down operation

        //check if brown dresses page is loaded
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saree.com/lehenga-choli/brown?cat=45");

        Thread.sleep(5000); // wait for the brown dress page to load and then select white
        WebElement whiteInBrownOption = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#narrow-by-list > div.filter-options-item.active > div.filter-options-content > form > div > div:nth-child(2) > a")));
        whiteInBrownOption.click();
        Thread.sleep(3000);

        //check if white dresses with white dresses page is loaded
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saree.com/lehenga-choli/brown_white");
    }

    @Test
    public void successfulFilteringFabric() throws InterruptedException{
        //Testing only one fabric type for now
        WebElement fabricFilterOption = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#narrow-by-list > div:nth-child(3) > div.filter-options-title")));
        fabricFilterOption.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Thread.sleep(2000);

        js.executeScript("window.scrollBy(0, 300);"); // Scroll down operation
        // Thread.sleep(2000);
        
        WebElement chinonOption = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#am-ranges-fabric > ol > li:nth-child(4)")));
        chinonOption.click();

        // Check for the pop display if filter is successfully applied.
        WebElement filterDisplay = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#am-shopby-container > ol > li.item.amshopby-item > span")));
        Assert.assertEquals(filterDisplay.isDisplayed(), true);
    }

    @Test
    public void successfulFilteringSize() throws InterruptedException{
        // Testing only one size option for now
        WebElement sizeFilterOption = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#narrow-by-list > div:nth-child(4) > div.filter-options-title")));
        sizeFilterOption.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Thread.sleep(2000);

        js.executeScript("window.scrollBy(0, 300);"); // Scroll down operation
        // Thread.sleep(2000);

        WebElement size44 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#am-ranges-size > ol > li:nth-child(6) > a")));
        size44.click();

        Thread.sleep(3000);
        // Check for the pop display if filter is successfully applied.
        WebElement filterDisplay = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#am-shopby-container > ol > li.item.amshopby-item > span")));
        Assert.assertEquals(filterDisplay.isDisplayed(), true);
    }

    @Test
    public void successfulFilterStyle() throws InterruptedException{
        WebElement styleOption = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#narrow-by-list > div:nth-child(5) > div.filter-options-title")));
        styleOption.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Thread.sleep(2000);

        js.executeScript("window.scrollBy(0, 300);"); // Scroll down operation
        // Thread.sleep(2000);

        WebElement plainStyleOption = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#am-ranges-style > ol > li:nth-child(3) > a")));
        plainStyleOption.click();

        Thread.sleep(3000);
        // Check for the pop display if filter is successfully applied.
        WebElement filterDisplay = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#am-shopby-container > ol > li.item.amshopby-item > span")));
        Assert.assertEquals(filterDisplay.isDisplayed(), true);
    }

    @Test
    public void successfulFilterOccasion() throws InterruptedException{
        //Testing only one type for now
        WebElement occasionOption = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#narrow-by-list > div:nth-child(6) > div.filter-options-title")));
        occasionOption.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Thread.sleep(2000);

        js.executeScript("window.scrollBy(0, 300);"); // Scroll down operation
        // Thread.sleep(2000);

        WebElement weddingOption = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#am-ranges-occasion > ol > li:nth-child(4) > a")));
        weddingOption.click();

        Thread.sleep(3000);
        // Check for the pop display if filter is successfully applied.
        WebElement filterDisplay = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#am-shopby-container > ol > li.item.amshopby-item > span")));
        Assert.assertEquals(filterDisplay.isDisplayed(), true);
    }

    @Test
    public void successfulFilterLook() throws InterruptedException{
        //Testing only one type for now
        WebElement lookOption = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#narrow-by-list > div:nth-child(7) > div.filter-options-title")));
        lookOption.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Thread.sleep(2000);

        js.executeScript("window.scrollBy(0, 300);"); // Scroll down operation
        // Thread.sleep(2000);

        WebElement fancyOption = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#am-ranges-look > ol > li:nth-child(4) > a")));
        fancyOption.click();

        Thread.sleep(3000);
        // Check for the pop display if filter is successfully applied.
        WebElement filterDisplay = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#am-shopby-container > ol > li.item.amshopby-item > span")));
        Assert.assertEquals(filterDisplay.isDisplayed(), true);
    }

    @Test
    public void successfulFilterProductType() throws InterruptedException{
        //Testing only one type for now
        WebElement productTypeOption = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#narrow-by-list > div:nth-child(8) > div.filter-options-title")));
        productTypeOption.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Thread.sleep(2000);

        js.executeScript("window.scrollBy(0, 300);"); // Scroll down operation
        // Thread.sleep(2000);

        WebElement stitchedOption = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#am-ranges-product_types > ol > li:nth-child(1) > a")));
        stitchedOption.click();

        Thread.sleep(3000);
        // Check for the pop display if filter is successfully applied.
        WebElement filterDisplay = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#am-shopby-container > ol > li.item.amshopby-item > span")));
        Assert.assertEquals(filterDisplay.isDisplayed(), true);
    }

    @Test
    public void successfulFilterTimeToDispatch() throws InterruptedException{
        //Testing only one type for now
        WebElement timeToDispatchOption = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#narrow-by-list > div:nth-child(9) > div.filter-options-title")));
        timeToDispatchOption.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Thread.sleep(2000);

        js.executeScript("window.scrollBy(0, 400);"); // Scroll down operation
        // Thread.sleep(2000);

        WebElement days30To35Option = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#am-ranges-timetodispatch > ol > li:nth-child(5) > a")));
        days30To35Option.click();

        Thread.sleep(3000);
        // Check for the pop display if filter is successfully applied.
        WebElement filterDisplay = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#am-shopby-container > ol > li.item.amshopby-item > span")));
        Assert.assertEquals(filterDisplay.isDisplayed(), true);
    }

    @AfterMethod
    public void shutDown() {
        // Clean up
        if (driver != null) {
            driver.quit();
        }
    }
}