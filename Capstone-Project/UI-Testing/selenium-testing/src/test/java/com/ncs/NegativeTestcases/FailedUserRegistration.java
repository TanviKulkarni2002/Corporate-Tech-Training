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
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

@SuppressWarnings("unused")
public class FailedUserRegistration {
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

    //Unsuccessful Login
    @Test
    public void failedUserLogin1() {
        String email=""; //invalid email
        String password="saree-lover21"; //enter a password
        String confirmPassword="saree-lover21";
        String fname="ABC";
        String lname="XYZ";
        String phoneNo="1234567890";

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
            // Thread.sleep(2000);


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
            WebElement confirmPasswordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#password-confirmation"))); // Note: Confirm password field has same selector as password
            confirmPasswordField.sendKeys(confirmPassword);

            // Wait for and fill the phone number field
            WebElement phoneNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#mobile-mobileget")));
            phoneNumber.sendKeys(phoneNo);

            // Wait for and click the send OTP button
            WebElement sendOTP = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#create-account-page > div.mobileget > div.model-bottom > div.submitbtnajax > input")));
            sendOTP.click();
            
            // Wait for and click Submit button
            WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#form-validate > div > div.primary")));
            submitButton.click();

            Thread.sleep(5000);
            WebElement errorPopUp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#maincontent > div.page.messages")));
            String errorMsg=errorPopUp.getText();

            Assert.assertEquals(errorMsg,"The customer email is missing. Enter and try again.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void failedUserLogin2() {
        String email="demotest@gmail.com"; //valid email
        String password=""; //invalid password
        String confirmPassword=""; //invalid repeated password
        String fname="ABC";
        String lname="XYZ";
        String phoneNo="1234567890";

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
            WebElement confirmPasswordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#password-confirmation"))); // Note: Confirm password field has same selector as password
            confirmPasswordField.sendKeys(confirmPassword);

            // Wait for and fill the phone number field
            WebElement phoneNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#mobile-mobileget")));
            phoneNumber.sendKeys(phoneNo);

            // Wait for and click the send OTP button
            WebElement sendOTP = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#create-account-page > div.mobileget > div.model-bottom > div.submitbtnajax > input")));
            sendOTP.click();
            
            // Wait for and click Submit button
            WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#form-validate > div > div.primary")));
            submitButton.click();

            Thread.sleep(5000);
            WebElement errorPopUp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#maincontent > div.page.messages")));
            String errorMsg=errorPopUp.getText();

            Assert.assertEquals(errorMsg,"The password needs at least 8 characters. Create a new password and try again.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void failedUserLogin3() {
        String email="demotest@gmail.com"; //valid email
        String password="saree-lover21"; //enter a password
        String confirmPassword="password-not-matching-or-invalid"; // incorrect repeated password
        String fname="ABC";
        String lname="XYZ";
        String phoneNo="1234567890";

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
            WebElement confirmPasswordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#password-confirmation"))); // Note: Confirm password field has same selector as password
            confirmPasswordField.sendKeys(confirmPassword);

            // Wait for and fill the phone number field
            WebElement phoneNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#mobile-mobileget")));
            phoneNumber.sendKeys(phoneNo);

            // Wait for and click the send OTP button
            WebElement sendOTP = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#create-account-page > div.mobileget > div.model-bottom > div.submitbtnajax > input")));
            sendOTP.click();
            
            // Wait for and click Submit button
            WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#form-validate > div > div.primary")));
            submitButton.click();

            Thread.sleep(5000);
            WebElement errorPopUp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#maincontent > div.page.messages")));
            String errorMsg=errorPopUp.getText();

            Assert.assertEquals(errorMsg,"Please make sure your passwords match.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void failedUserLogin4() {
        String email="wrongemailaddress@gmail.com"; //valid email
        String password="saree-lover21"; //enter a password
        String confirmPassword="saree-lover21";
        String fname=""; //invalid first name
        String lname="XYZ";
        String phoneNo="1234567890";

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
            WebElement confirmPasswordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#password-confirmation"))); // Note: Confirm password field has same selector as password
            confirmPasswordField.sendKeys(confirmPassword);

            // Wait for and fill the phone number field
            WebElement phoneNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#mobile-mobileget")));
            phoneNumber.sendKeys(phoneNo);

            // Wait for and click the send OTP button
            WebElement sendOTP = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#create-account-page > div.mobileget > div.model-bottom > div.submitbtnajax > input")));
            sendOTP.click();
            
            // Wait for and click Submit button
            WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#form-validate > div > div.primary")));
            submitButton.click();

            Thread.sleep(5000);
            WebElement errorPopUp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#maincontent > div.page.messages")));
            String errorMsg=errorPopUp.getText();

            Assert.assertEquals(errorMsg,"\"First Name\" is a required value.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void failedUserLogin5() {
        String email="wrongemailaddress@gmail.com"; //valid email
        String password="saree-lover21"; //enter a password
        String confirmPassword="saree-lover21";
        String fname="ABC";
        String lname=""; //invalid last name
        String phoneNo="1234567890";

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
            WebElement confirmPasswordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#password-confirmation"))); // Note: Confirm password field has same selector as password
            confirmPasswordField.sendKeys(confirmPassword);

            // Wait for and fill the phone number field
            WebElement phoneNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#mobile-mobileget")));
            phoneNumber.sendKeys(phoneNo);

            // Wait for and click the send OTP button
            WebElement sendOTP = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#create-account-page > div.mobileget > div.model-bottom > div.submitbtnajax > input")));
            sendOTP.click();
            
            // Wait for and click Submit button
            WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#form-validate > div > div.primary")));
            submitButton.click();

            Thread.sleep(5000);
            WebElement errorPopUp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#maincontent > div.page.messages")));
            String errorMsg=errorPopUp.getText();

            Assert.assertEquals(errorMsg,"\"Last Name\" is a required value.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Account Already exists: Enter all details of an account that is already registered
    @Test
    public void failedUserLogin6() {
        String email="tanvi.kulkarni@in.ncs-i.com";
        String password="saree-lover21";
        String confirmPassword="saree-lover21";
        String fname="Tanvi";
        String lname="Kulkarni";
        String phoneNo="9960336548";

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
            WebElement confirmPasswordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#password-confirmation"))); // Note: Confirm password field has same selector as password
            confirmPasswordField.sendKeys(confirmPassword);

            // Wait for and fill the phone number field
            WebElement phoneNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#mobile-mobileget")));
            phoneNumber.sendKeys(phoneNo);

            // Wait for and click the send OTP button
            WebElement sendOTP = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#create-account-page > div.mobileget > div.model-bottom > div.submitbtnajax > input")));
            sendOTP.click();
            
            // Wait for and click Submit button
            WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#form-validate > div > div.primary")));
            submitButton.click();

            Thread.sleep(5000);
            WebElement errorPopUp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#maincontent > div.page.messages")));
            String errorMsg=errorPopUp.getText().toLowerCase();

            Assert.assertEquals(errorMsg,"there is already an account with this email address. if you are sure that it is your email address, click here to get your password and access your account.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void failedUserLogin7() {
        String email="invalid-email-entered"; //invalid email
        String password="saree-lover21"; //invalid password
        String confirmPassword="saree-lover21";
        String fname="ABC";
        String lname="XYZ";
        String phoneNo="1234567890";

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
            WebElement confirmPasswordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#password-confirmation"))); // Note: Confirm password field has same selector as password
            confirmPasswordField.sendKeys(confirmPassword);

            // Wait for and fill the phone number field
            WebElement phoneNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#mobile-mobileget")));
            phoneNumber.sendKeys(phoneNo);

            // Wait for and click the send OTP button
            WebElement sendOTP = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#create-account-page > div.mobileget > div.model-bottom > div.submitbtnajax > input")));
            sendOTP.click();
            
            // Wait for and click Submit button
            WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#form-validate > div > div.primary")));
            submitButton.click();

            Thread.sleep(5000);
            WebElement errorPopUp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#maincontent > div.page.messages")));
            String errorMsg=errorPopUp.getText();

            Assert.assertEquals(errorMsg,"\"Email\" is not a valid email address.");


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void failedUserLogin8() {
        String email="demotest@gmail.com";
        String password="saree-lover21";
        String confirmPassword="saree-lover21";
        String fname="ABC";
        String lname="XYZ";
        String phoneNo=""; // invalid phoneNo.

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
            WebElement confirmPasswordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#password-confirmation"))); // Note: Confirm password field has same selector as password
            confirmPasswordField.sendKeys(confirmPassword);

            // Wait for and fill the phone number field
            WebElement phoneNumber = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#mobile-mobileget")));
            phoneNumber.sendKeys(phoneNo);

            // Wait for and click the send OTP button
            WebElement sendOTP = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#create-account-page > div.mobileget > div.model-bottom > div.submitbtnajax > input")));
            sendOTP.click();

            // Thread.sleep(5000);
            WebElement errorPopUp = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#create-account-page > div.mobileget > div.otp-content.fieldset > div.blankerror.error > span")));
            String errorMsg=errorPopUp.getText();

            Assert.assertEquals(errorMsg,"Required fields cannot be empty");

            // If this a non-registered account details, it will create an account even when phone No. is not enetered. Refer defect log report
            // WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#form-validate > div > div.primary")));
            // submitButton.click();
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
