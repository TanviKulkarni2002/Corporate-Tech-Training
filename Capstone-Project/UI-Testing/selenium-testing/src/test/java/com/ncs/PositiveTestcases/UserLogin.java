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
public class UserLogin {
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

    // Successful Login
    @Test
    public void successfulUserLogin() {
        String email = "tanvi.kulkarni@in.ncs-i.com"; // enter an emailId
        String password = "saree-lover21"; // enter a password

        try {
            WebElement profileIcon = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#switcher-customer > div")));
            profileIcon.click(); // Perform click operation

            WebElement signInOption = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#switcher-customer > div > ul > li.authorization-link")));
            signInOption.click(); // Perform click operation

            WebElement loginWithEmailCheckBox = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ajaxlogin-login-window > input[type=checkbox]")));
            if (!loginWithEmailCheckBox.isSelected()) {
                loginWithEmailCheckBox.click(); // Perform click operation only if not selected
            }

            WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#mobile-login-email")));
            emailField.sendKeys(email); // send login email

            WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#mobile-login-pass")));
            passwordField.sendKeys(password); // send login password

            WebElement loginOption = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#loginsubmit")));
            if (loginOption.isEnabled()) {
                loginOption.click(); // Perform click operation only if enabled
            }

            Thread.sleep(3000);
            // Setting up for assertion of successful user login
            WebElement profileIcon1 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#switcher-customer > div")));
            profileIcon1.click(); // Perform click operation

            Thread.sleep(3000);
            WebElement signOutOption = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#switcher-customer > div > ul > li.authorization-link > a")));

            String textSignOut = signOutOption.getText(); // extract the text as 'Sign Out'
            Assert.assertEquals(textSignOut, "Sign Out"); // if it matches, means successful login

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