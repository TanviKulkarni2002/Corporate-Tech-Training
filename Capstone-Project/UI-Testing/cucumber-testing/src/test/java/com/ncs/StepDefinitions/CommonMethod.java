package com.ncs.StepDefinitions;

import java.time.Duration;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.jupiter.api.AfterEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CommonMethod {
    public static WebDriver driver;
    public static WebDriverWait wait;

    @Given(value="initializeDriver")
    public static void initializeDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(); // Initialize the driver
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    @When(value="logOnToWebsite")
    public static void logOnToWebsite() {
        driver.get("https://saree.com");
    }

    @And(value="navigateToKurti")
    public static void navigateToKurti() throws InterruptedException {
        WebElement kurtiNavTab = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ui-id-5")));
        kurtiNavTab.click();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static WebDriverWait getWait() {
        return wait;
    }

    @AfterEach
    public static void shutDown() {
        driver.quit();
        driver = null;
    }
}
