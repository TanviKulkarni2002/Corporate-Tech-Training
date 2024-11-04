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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

@SuppressWarnings("unused")
public class UserRegistration {
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

    // Successful User Registration
    @Test
    public void successfulUserRegistration() {
        String email = ""; // enter an emailId
        String password = "saree-lover21"; // enter a password
        String confirmPassword = "saree-lover21";
        String fname = "ABC";
        String lname = "XYZ";
        String phoneNo = "1234567890";

        try {
            // Wait for and click the profile icon
            WebElement profileIcon = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#switcher-customer > div")));
            profileIcon.click();

            // Wait for and click the My Account option
            WebElement myAccountOption = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#switcher-customer > div > ul > li:nth-child(1)")));
            myAccountOption.click();

            // Wait for and click the Create Account option
            WebElement createAccountOption = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#maincontent > div.columns > div > div.login-container > div.block.block-new-customer > div.block-content > div > div > a")));
            createAccountOption.click();

            // Wait for and fill the first name field
            WebElement firstNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#firstname")));
            firstNameField.sendKeys(fname);

            // Wait for and fill the last name field
            WebElement lastNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#lastname")));
            lastNameField.sendKeys(lname);

            // Wait for and fill the email field
            WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#email_address")));
            emailField.sendKeys(email);

            // Wait for and fill the password field
            WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#password")));
            passwordField.sendKeys(password);

            // Wait for and fill the confirm password field
            WebElement confirmPasswordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#password-confirmation")));
            confirmPasswordField.sendKeys(confirmPassword);

            // Wait for and fill the phone number field
            WebElement phoneNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#mobile-mobileget")));
            phoneNumber.sendKeys(phoneNo);

            // Wait for and click the send OTP button
            WebElement sendOTP = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#create-account-page > div.mobileget > div.model-bottom > div.submitbtnajax > input")));
            if (sendOTP.isDisplayed() && sendOTP.isEnabled()) {
                sendOTP.click();
            } else {
                System.out.println("Send OTP button is not displayed or enabled.");
            }

            // Wait for and click Submit button
            WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#form-validate > div > div.primary")));
            if (submitButton.isDisplayed() && submitButton.isEnabled()) {
                submitButton.click();
            } else {
                System.out.println("Submit button is not displayed or enabled.");
            }
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