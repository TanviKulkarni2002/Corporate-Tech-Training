package com.ncs.NegativeTestcases;

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
import org.testng.Assert;

@SuppressWarnings("unused")
public class FailedUserLogin {
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

    //Unsucccessful Login
    @Test
    public void failedLogin1() {
        String email="wrong-email@gmail.com"; //invalid emailId
        String password="saree-lover21"; //valid password
        try {
            WebElement profileIcon = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#switcher-customer > div")));
            profileIcon.click(); // Perform click operation

            WebElement signInOption = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#switcher-customer > div > ul > li.authorization-link")));
            signInOption.click(); // Perform click operation

            WebElement loginWithEmailCheckBox = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ajaxlogin-login-window > input[type=checkbox]")));
            loginWithEmailCheckBox.click(); // Perform click operation

            WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#mobile-login-email")));
            emailField.sendKeys(email); // send login email

            WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#mobile-login-pass")));
            passwordField.sendKeys(password); // send login password

            WebElement loginOption = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#loginsubmit")));
            loginOption.click(); // Perform click operation

            Thread.sleep(5000);
            WebElement errorPopUp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#mobile-login-form > div.emailpasswrong.error > span")));
            String errorMsg=errorPopUp.getText();
            //Assert that the url has not changed at all
            Assert.assertEquals(errorMsg,"Invalid login or password.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void failedLogin2() {
        String email="demotest@gmail.com"; //valid emailId
        String password="wrong-password"; //invalid password
        try {
            WebElement profileIcon = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#switcher-customer > div")));
            profileIcon.click(); // Perform click operation

            WebElement signInOption = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#switcher-customer > div > ul > li.authorization-link")));
            signInOption.click(); // Perform click operation

            WebElement loginWithEmailCheckBox = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ajaxlogin-login-window > input[type=checkbox]")));
            loginWithEmailCheckBox.click(); // Perform click operation

            WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#mobile-login-email")));
            emailField.sendKeys(email); // send login email

            WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#mobile-login-pass")));
            passwordField.sendKeys(password); // send login password

            WebElement loginOption = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#loginsubmit")));
            loginOption.click(); // Perform click operation

            Thread.sleep(5000);
            WebElement errorPopUp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#mobile-login-form > div.emailpasswrong.error > span")));
            String errorMsg=errorPopUp.getText();

            //Assert that the url has not changed at all
            Assert.assertEquals(errorMsg,"Invalid login or password.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void failedLogin3() {
        String email="demotest@gmail.com"; //valid emailId
        String password=""; //invalid password
        try {
            WebElement profileIcon = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#switcher-customer > div")));
            profileIcon.click(); // Perform click operation

            WebElement signInOption = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#switcher-customer > div > ul > li.authorization-link")));
            signInOption.click(); // Perform click operation

            WebElement loginWithEmailCheckBox = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ajaxlogin-login-window > input[type=checkbox]")));
            loginWithEmailCheckBox.click(); // Perform click operation

            WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#mobile-login-email")));
            emailField.sendKeys(email); // send login email

            WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#mobile-login-pass")));
            passwordField.sendKeys(password); // send login password

            WebElement loginOption = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#loginsubmit")));
            loginOption.click(); // Perform click operation

            Thread.sleep(3000);
            //Setting up for assertion of unsuccessful user login
            WebElement profileIcon1 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#switcher-customer > div")));
            profileIcon1.click(); // Perform click operation

            Thread.sleep(3000);
            WebElement signOutOption = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#switcher-customer > div > ul > li.authorization-link > a")));

            String textSignOut=signOutOption.getText(); //extarct the text as 'Sign Out'
            Assert.assertEquals(textSignOut, "Sign In"); // if it matches, means unsuccessful login
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void failedLogin4() {
        String email=""; //invalid emailId
        String password="saree-lover21"; //valid password
        try {
            WebElement profileIcon = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#switcher-customer > div")));
            profileIcon.click(); // Perform click operation

            WebElement signInOption = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#switcher-customer > div > ul > li.authorization-link")));
            signInOption.click(); // Perform click operation

            WebElement loginWithEmailCheckBox = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ajaxlogin-login-window > input[type=checkbox]")));
            loginWithEmailCheckBox.click(); // Perform click operation

            WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#mobile-login-email")));
            emailField.sendKeys(email); // send login email

            WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#mobile-login-pass")));
            passwordField.sendKeys(password); // send login password

            WebElement loginOption = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#loginsubmit")));
            loginOption.click(); // Perform click operation

            Thread.sleep(3000);
            //Setting up for assertion of unsuccessful user login
            WebElement profileIcon1 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#switcher-customer > div")));
            profileIcon1.click(); // Perform click operation

            Thread.sleep(3000);
            WebElement signOutOption = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#switcher-customer > div > ul > li.authorization-link > a")));

            String textSignOut=signOutOption.getText(); //extarct the text as 'Sign Out'
            Assert.assertEquals(textSignOut, "Sign In"); // if it matches, means unsuccessful login
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void failedLogin5() {
        String email=""; //invalid emailId
        String password=""; //invalid password
        try {
            WebElement profileIcon = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#switcher-customer > div")));
            profileIcon.click(); // Perform click operation

            WebElement signInOption = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#switcher-customer > div > ul > li.authorization-link")));
            signInOption.click(); // Perform click operation

            WebElement loginWithEmailCheckBox = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#ajaxlogin-login-window > input[type=checkbox]")));
            loginWithEmailCheckBox.click(); // Perform click operation

            WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#mobile-login-email")));
            emailField.sendKeys(email); // send login email

            WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#mobile-login-pass")));
            passwordField.sendKeys(password); // send login password

            WebElement loginOption = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#loginsubmit")));
            loginOption.click(); // Perform click operation

            Thread.sleep(3000);
            //Setting up for assertion of unsuccessful user login
            WebElement profileIcon1 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#switcher-customer > div")));
            profileIcon1.click(); // Perform click operation

            Thread.sleep(3000);
            WebElement signOutOption = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#switcher-customer > div > ul > li.authorization-link > a")));

            String textSignOut=signOutOption.getText(); //extarct the text as 'Sign Out'
            Assert.assertEquals(textSignOut, "Sign In"); // if it matches, means unsuccessful login
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