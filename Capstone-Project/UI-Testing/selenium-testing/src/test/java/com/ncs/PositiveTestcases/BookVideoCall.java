package com.ncs.PositiveTestcases;

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
public class BookVideoCall {
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

    @Test
    public void successfulBookVC() {
        String name = "Tanvi";
        String country = "India";
        String whatsappNo = "9960336548";
        String outfitsAndOccasion = "Diwali Festivities";
        String email = "tanvi.kulkarni@in.ncs-i.com";
        String password = "saree-lover21";
        String comments = "Diwali Festivities: traditional wear";
    
        try {
            // Wait and click Book VC option
            WebElement bookVC = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#html-body > div.page-wrapper > header > div:nth-child(1) > div > div.flex-col-left.flex-grow-none > ul")));
            bookVC.click();
    
            // Check if it loads the Book Video Call web page
            Assert.assertEquals(driver.getCurrentUrl(), "https://www.saree.com/exclusive-video-calling");
    
            // Fill in the appointment form
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#name"))).sendKeys(name);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#country"))).sendKeys(country);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#wappnumber"))).sendKeys(whatsappNo);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#outfit"))).sendKeys(outfitsAndOccasion);
    
            WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#page-0 > div.amcform-toolbar > button")));
            if (submitButton.isDisplayed() && submitButton.isEnabled()) {
                submitButton.click();
            } else {
                throw new Exception("Submit button is disabled or not displayed.");
            }
    
            // Check if it loads the checkout page
            Assert.assertEquals(driver.getCurrentUrl(), "https://www.saree.com/checkout/");
            
            // Wait for it to finish reloading
            wait.until(ExpectedConditions.urlToBe("https://www.saree.com/checkout/"));
    
            WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#customer-email")));
            emailField.sendKeys(email);
    
            WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#customer-password")));
            passwordField.sendKeys(password);
    
            WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#customer-email-fieldset > fieldset > div.actions-toolbar > div.primary > button")));
            if (loginButton.isDisplayed() && loginButton.isEnabled()) {
                loginButton.click();
            } else {
                throw new Exception("Login button is disabled or not displayed.");
            }
    
            // Wait for the page to become stable
            wait.until(ExpectedConditions.urlContains("checkout"));
    
            WebElement commentBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/main/div[2]/div/div[3]/div[3]/ol/li[3]/div/form/fieldset/div[1]/div[2]/div/div/textarea")));
            commentBox.sendKeys(comments);
    
            WebElement checkoutSubmitButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/main/div[2]/div/div[3]/aside/div[2]/div/div/div[2]/div[2]/div/div/button")));
            if (checkoutSubmitButton.isDisplayed() && checkoutSubmitButton.isEnabled()) {
                checkoutSubmitButton.click();
            } else {
                throw new Exception("Checkout submit button is either not displayed or disabled.");
            }
    
            // Wait for the page to load
            wait.until(ExpectedConditions.urlToBe("https://www.saree.com/checkout/onepage/success/"));
    
            // Check if it loads the successful order placed page
            Assert.assertEquals(driver.getCurrentUrl(), "https://www.saree.com/checkout/onepage/success/");
    
        } catch (Exception e) {
            e.printStackTrace();
        }
    }    

    @AfterMethod
    public void shutDown() {
        // Close the browser
        if (driver != null) {
            driver.quit();
        }
    }
}