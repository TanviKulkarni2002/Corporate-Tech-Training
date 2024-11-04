package com.ncs.NegativeTestcases;

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
public class FailedLehengaCholiModule {
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
        // applyButton.click(); // apply button is not clicked

        //Check if it stays on the same page
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saree.com/lehenga-choli");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Thread.sleep(2000); // wait to observe the scroll operation

        js.executeScript("window.scrollBy(0, 300);"); // Scroll down operation

        //Check if it stays on the same page
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saree.com/lehenga-choli");
    }

    @Test
    public void failedFilteringColor() throws InterruptedException{
        //Testing only one color components for now
        WebElement colorFilterOption = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#narrow-by-list > div:nth-child(2)")));
        colorFilterOption.click();

        //Check if it stays on the same page
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saree.com/lehenga-choli");

        // Thread.sleep(3000);
        WebElement brownColorOption = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#narrow-by-list > div.filter-options-item.allow.active > div.filter-options-content > form > div > div:nth-child(1) > a")));
        // brownColorOption.click(); //button not clicked

        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(3000);

        js.executeScript("window.scrollBy(0, 300);"); // Scroll down operation

        //check if brown dresses page is loaded
        Assert.assertNotSame(driver.getCurrentUrl(), "https://www.saree.com/lehenga-choli/brown?cat=45");

        Thread.sleep(5000); // wait for the brown dress page to load and then select white
        WebElement whiteInBrownOption = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#narrow-by-list > div.filter-options-item.active > div.filter-options-content > form > div > div:nth-child(2) > a")));
        // whiteInBrownOption.click(); //button not clicked
        Thread.sleep(3000);

        //check if white dresses with white dresses page is loaded
        Assert.assertNotSame(driver.getCurrentUrl(), "https://www.saree.com/lehenga-choli/brown_white");
    }

    @Test
    public void failedFilteringFabric() throws InterruptedException{
        //Testing only one fabric type for now
        WebElement fabricFilterOption = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#narrow-by-list > div:nth-child(3) > div.filter-options-title")));
        fabricFilterOption.click();

        //Check if it stays on the same page
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saree.com/lehenga-choli");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Thread.sleep(2000);

        js.executeScript("window.scrollBy(0, 300);"); // Scroll down operation
        // Thread.sleep(2000);
        
        WebElement chinonOption = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#am-ranges-fabric > ol > li:nth-child(4)")));
        // chinonOption.click(); button not clicked

        //Check if it stays on the same page
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saree.com/lehenga-choli");
    }

    @Test
    public void failedFilteringSize() throws InterruptedException{
        // Testing only one size option for now
        WebElement sizeFilterOption = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#narrow-by-list > div:nth-child(4) > div.filter-options-title")));
        sizeFilterOption.click();

        //Check if it stays on the same page
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saree.com/lehenga-choli");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Thread.sleep(2000);

        js.executeScript("window.scrollBy(0, 300);"); // Scroll down operation
        // Thread.sleep(2000);

        WebElement size44 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#am-ranges-size > ol > li:nth-child(6) > a")));
        // size44.click(); //button not clicked

        Thread.sleep(3000);
        //Check if it stays on the same page
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saree.com/lehenga-choli");
    }

    @Test
    public void failedFilterStyle() throws InterruptedException{
        WebElement styleOption = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#narrow-by-list > div:nth-child(5) > div.filter-options-title")));
        styleOption.click();

        //Check if it stays on the same page
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saree.com/lehenga-choli");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Thread.sleep(2000);

        js.executeScript("window.scrollBy(0, 300);"); // Scroll down operation
        // Thread.sleep(2000);

        WebElement plainStyleOption = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#am-ranges-style > ol > li:nth-child(3) > a")));
        // plainStyleOption.click(); //button not clicked

        Thread.sleep(3000);
        //Check if it stays on the same page
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saree.com/lehenga-choli");
    }

    @Test
    public void failedFilterOccasion() throws InterruptedException{
        //Testing only one type for now
        WebElement occasionOption = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#narrow-by-list > div:nth-child(6) > div.filter-options-title")));
        occasionOption.click();

        //Check if it stays on the same page
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saree.com/lehenga-choli");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Thread.sleep(2000);

        js.executeScript("window.scrollBy(0, 300);"); // Scroll down operation
        // Thread.sleep(2000);

        WebElement weddingOption = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#am-ranges-occasion > ol > li:nth-child(4) > a")));
        // weddingOption.click(); //button not clicked

        Thread.sleep(3000);
        //Check if it stays on the same page
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saree.com/lehenga-choli");
    }

    @Test
    public void failedFilterLook() throws InterruptedException{
        //Testing only one type for now
        WebElement lookOption = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#narrow-by-list > div:nth-child(7) > div.filter-options-title")));
        lookOption.click();

        //Check if it stays on the same page
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saree.com/lehenga-choli");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Thread.sleep(2000);

        js.executeScript("window.scrollBy(0, 300);"); // Scroll down operation
        // Thread.sleep(2000);

        WebElement fancyOption = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#am-ranges-look > ol > li:nth-child(4) > a")));
        // fancyOption.click(); //button not clicked

        Thread.sleep(3000);
        //Check if it stays on the same page
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saree.com/lehenga-choli");
    }

    @Test
    public void failedFilterProductType() throws InterruptedException{
        //Testing only one type for now
        WebElement productTypeOption = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#narrow-by-list > div:nth-child(8) > div.filter-options-title")));
        productTypeOption.click();
        //Check if it stays on the same page
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saree.com/lehenga-choli");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Thread.sleep(2000);

        js.executeScript("window.scrollBy(0, 300);"); // Scroll down operation
        // Thread.sleep(2000);

        WebElement stitchedOption = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#am-ranges-product_types > ol > li:nth-child(1) > a")));
        // stitchedOption.click(); //button not clicked

        Thread.sleep(3000);
        //Check if it stays on the same page
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saree.com/lehenga-choli");
    }

    @Test
    public void failedFilterTimeToDispatch() throws InterruptedException{
        //Testing only one type for now
        WebElement timeToDispatchOption = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#narrow-by-list > div:nth-child(9) > div.filter-options-title")));
        timeToDispatchOption.click();

        //Check if it stays on the same page
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saree.com/lehenga-choli");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        // Thread.sleep(2000);

        js.executeScript("window.scrollBy(0, 400);"); // Scroll down operation
        // Thread.sleep(2000);

        WebElement days30To35Option = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#am-ranges-timetodispatch > ol > li:nth-child(5) > a")));
        // days30To35Option.click(); //button not clicked

        Thread.sleep(3000);
        //Check if it stays on the same page
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saree.com/lehenga-choli");
    }

    @AfterMethod
    public void shutDown() {
        // Clean up
        if (driver != null) {
            driver.quit();
        }
    }
}