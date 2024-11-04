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
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

@SuppressWarnings("unused")
public class FailedBookVideoCall {
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
public void failedBookVC1() {
    String name = ""; // name invalid
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

        // Fill in the appointment form
        WebElement nameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#name")));
        if (nameField.isDisplayed() && nameField.isEnabled()) {
            nameField.sendKeys(name);
        }

        WebElement countryField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#country")));
        if (countryField.isDisplayed() && countryField.isEnabled()) {
            countryField.sendKeys(country);
        }

        WebElement whatsappField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#wappnumber")));
        if (whatsappField.isDisplayed() && whatsappField.isEnabled()) {
            whatsappField.sendKeys(whatsappNo);
        }

        WebElement outfitField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#outfit")));
        if (outfitField.isDisplayed() && outfitField.isEnabled()) {
            outfitField.sendKeys(outfitsAndOccasion);
        }

        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#page-0 > div.amcform-toolbar > button")));
        if (submitButton.isDisplayed() && submitButton.isEnabled()) {
            submitButton.click();
        }

        // Check if it loads the video-calling page
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saree.com/exclusive-video-calling");

        // Wait for it to finish reloading
        Thread.sleep(20000); // Adjust timing as needed

        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#customer-email")));
        if (emailField.isDisplayed() && emailField.isEnabled()) {
            emailField.sendKeys(email);
        }

        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#customer-password")));
        if (passwordField.isDisplayed() && passwordField.isEnabled()) {
            passwordField.sendKeys(password);
        }

        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#customer-email-fieldset > fieldset > div.actions-toolbar > div.primary > button")));
        if (loginButton.isDisplayed() && loginButton.isEnabled()) {
            loginButton.click();
        }

        // Check if it loads the checkout page
        Assert.assertNotSame(driver.getCurrentUrl(), "https://www.saree.com/checkout/");

        Thread.sleep(5000); // wait for the page to become stable

        WebElement commentBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/main/div[2]/div/div[3]/div[3]/ol/li[3]/div/form/fieldset/div[1]/div[2]/div/div/textarea")));
        if (commentBox.isDisplayed() && commentBox.isEnabled()) {
            commentBox.sendKeys(comments);
        }

        WebElement checkoutSubmitButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/main/div[2]/div/div[3]/aside/div[2]/div/div/div[2]/div[2]/div/div/button")));
        if (checkoutSubmitButton.isDisplayed() && checkoutSubmitButton.isEnabled()) {
            checkoutSubmitButton.click();
        }

        // Check if it loads the checkout page
        Assert.assertNotSame(driver.getCurrentUrl(), "https://www.saree.com/checkout/onepage/success/");
    } catch (Exception e) {
        e.printStackTrace();
    }
}

@Test
public void failedBookVC2() {
    String name = "ABC";
    String country = ""; // country invalid
    String whatsappNo = "9960336548";
    String outfitsAndOccasion = "Diwali Festivities";
    String email = "tanvi.kulkarni@in.ncs-i.com";
    String password = "saree-lover21";
    String comments = "Diwali Festivities: traditional wear";
    
    try {
        // Wait and click Book VC option
        WebElement bookVC = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#html-body > div.page-wrapper > header > div:nth-child(1) > div > div.flex-col-left.flex-grow-none > ul")));
        bookVC.click();

        // Fill in the appointment form
        WebElement nameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#name")));
        if (nameField.isDisplayed() && nameField.isEnabled()) {
            nameField.sendKeys(name);
        }

        WebElement countryField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#country")));
        if (countryField.isDisplayed() && countryField.isEnabled()) {
            countryField.sendKeys(country);
        }

        WebElement whatsappField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#wappnumber")));
        if (whatsappField.isDisplayed() && whatsappField.isEnabled()) {
            whatsappField.sendKeys(whatsappNo);
        }

        WebElement outfitField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#outfit")));
        if (outfitField.isDisplayed() && outfitField.isEnabled()) {
            outfitField.sendKeys(outfitsAndOccasion);
        }

        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#page-0 > div.amcform-toolbar > button")));
        if (submitButton.isDisplayed() && submitButton.isEnabled()) {
            submitButton.click();
        }

        // Check if it loads the video-calling page
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saree.com/exclusive-video-calling");

        // Wait for it to finish reloading
        Thread.sleep(20000); // Adjust timing as needed

        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#customer-email")));
        if (emailField.isDisplayed() && emailField.isEnabled()) {
            emailField.sendKeys(email);
        }

        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#customer-password")));
        if (passwordField.isDisplayed() && passwordField.isEnabled()) {
            passwordField.sendKeys(password);
        }

        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#customer-email-fieldset > fieldset > div.actions-toolbar > div.primary > button")));
        if (loginButton.isDisplayed() && loginButton.isEnabled()) {
            loginButton.click();
        }

        // Check if it loads the checkout page
        Assert.assertNotSame(driver.getCurrentUrl(), "https://www.saree.com/checkout/");

        Thread.sleep(5000); // wait for the page to stabilize

        WebElement commentBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/main/div[2]/div/div[3]/div[3]/ol/li[3]/div/form/fieldset/div[1]/div[2]/div/div/textarea")));
        if (commentBox.isDisplayed() && commentBox.isEnabled()) {
            commentBox.sendKeys(comments);
        }

        WebElement checkoutSubmitButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/main/div[2]/div/div[3]/aside/div[2]/div/div/div[2]/div[2]/div/div/button")));
        if (checkoutSubmitButton.isDisplayed() && checkoutSubmitButton.isEnabled()) {
            checkoutSubmitButton.click();
        }

        // Check if it loads the checkout page
        Assert.assertNotSame(driver.getCurrentUrl(), "https://www.saree.com/checkout/onepage/success/");
    } catch (Exception e) {
        e.printStackTrace();
    }
}

@Test
public void failedBookVC3() {
    String name = "ABC";
    String country = "India";
    String whatsappNo = ""; // invalid phoneNo.
    String outfitsAndOccasion = "Diwali Festivities";
    String email = "tanvi.kulkarni@in.ncs-i.com";
    String password = "saree-lover21";
    String comments = "Diwali Festivities: traditional wear";
    
    try {
        // Wait and click Book VC option
        WebElement bookVC = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#html-body > div.page-wrapper > header > div:nth-child(1) > div > div.flex-col-left.flex-grow-none > ul")));
        bookVC.click();

        // Fill in the appointment form
        WebElement nameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#name")));
        if (nameField.isDisplayed() && nameField.isEnabled()) {
            nameField.sendKeys(name);
        }

        WebElement countryField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#country")));
        if (countryField.isDisplayed() && countryField.isEnabled()) {
            countryField.sendKeys(country);
        }

        WebElement whatsappField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#wappnumber")));
        if (whatsappField.isDisplayed() && whatsappField.isEnabled()) {
            whatsappField.sendKeys(whatsappNo);
        }

        WebElement outfitField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#outfit")));
        if (outfitField.isDisplayed() && outfitField.isEnabled()) {
            outfitField.sendKeys(outfitsAndOccasion);
        }

        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#page-0 > div.amcform-toolbar > button")));
        if (submitButton.isDisplayed() && submitButton.isEnabled()) {
            submitButton.click();
        }

        // Check if it loads the video-calling page
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saree.com/exclusive-video-calling");

        // Wait for it to finish reloading
        Thread.sleep(20000); // Adjust timing as needed

        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#customer-email")));
        if (emailField.isDisplayed() && emailField.isEnabled()) {
            emailField.sendKeys(email);
        }

        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#customer-password")));
        if (passwordField.isDisplayed() && passwordField.isEnabled()) {
            passwordField.sendKeys(password);
        }

        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#customer-email-fieldset > fieldset > div.actions-toolbar > div.primary > button")));
        if (loginButton.isDisplayed() && loginButton.isEnabled()) {
            loginButton.click();
        }

        // Check if it loads the checkout page
        Assert.assertNotSame(driver.getCurrentUrl(), "https://www.saree.com/checkout/");

        Thread.sleep(5000); // wait for the page to stabilize

        WebElement commentBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/main/div[2]/div/div[3]/div[3]/ol/li[3]/div/form/fieldset/div[1]/div[2]/div/div/textarea")));
        if (commentBox.isDisplayed() && commentBox.isEnabled()) {
            commentBox.sendKeys(comments);
        }

        WebElement checkoutSubmitButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/main/div[2]/div/div[3]/aside/div[2]/div/div/div[2]/div[2]/div/div/button")));
        if (checkoutSubmitButton.isDisplayed() && checkoutSubmitButton.isEnabled()) {
            checkoutSubmitButton.click();
        }
        
        // Check if it loads the checkout page
        Assert.assertNotSame(driver.getCurrentUrl(), "https://www.saree.com/checkout/onepage/success/");
    } catch (Exception e) {
        e.printStackTrace();
    }
}

@Test
public void failedBookVC4() {
    String name = "ABC";
    String country = "India";
    String whatsappNo = "1234123456";
    String outfitsAndOccasion = "Diwali Festivities";
    String email = ""; // invalid email
    String password = "saree-lover21"; // invalid password
    String comments = "Diwali Festivities: traditional wear";
    
    try {
        // Wait and click Book VC option
        WebElement bookVC = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#html-body > div.page-wrapper > header > div:nth-child(1) > div > div.flex-col-left.flex-grow-none > ul")));
        bookVC.click();

        // Fill in the appointment form
        WebElement nameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#name")));
        if (nameField.isDisplayed() && nameField.isEnabled()) {
            nameField.sendKeys(name);
        }

        WebElement countryField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#country")));
        if (countryField.isDisplayed() && countryField.isEnabled()) {
            countryField.sendKeys(country);
        }

        WebElement whatsappField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#wappnumber")));
        if (whatsappField.isDisplayed() && whatsappField.isEnabled()) {
            whatsappField.sendKeys(whatsappNo);
        }

        WebElement outfitField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#outfit")));
        if (outfitField.isDisplayed() && outfitField.isEnabled()) {
            outfitField.sendKeys(outfitsAndOccasion);
        }

        // Check if it loads the video-calling page
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saree.com/exclusive-video-calling");

        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#page-0 > div.amcform-toolbar > button")));
        if (submitButton.isDisplayed() && submitButton.isEnabled()) {
            submitButton.click();
        }

        // Wait for it to finish reloading
        Thread.sleep(20000); // Adjust timing as needed

        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#customer-email")));
        if (emailField.isDisplayed() && emailField.isEnabled()) {
            emailField.sendKeys(email);
        }

        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#customer-password")));
        if (passwordField.isDisplayed() && passwordField.isEnabled()) {
            passwordField.sendKeys(password);
        }

        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#customer-email-fieldset > fieldset > div.actions-toolbar > div.primary > button")));
        if (loginButton.isDisplayed() && loginButton.isEnabled()) {
            loginButton.click();
        }

        // Check if it loads the checkout page
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saree.com/checkout/");

        Thread.sleep(5000); // wait for the page to become stable

        WebElement commentBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/main/div[2]/div/div[3]/div[3]/ol/li[3]/div/form/fieldset/div[1]/div[2]/div/div/textarea")));
        if (commentBox.isDisplayed() && commentBox.isEnabled()) {
            commentBox.sendKeys(comments);
        }

        WebElement checkoutSubmitButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/main/div[2]/div/div[3]/aside/div[2]/div/div/div[2]/div[2]/div/div/button")));
        if (checkoutSubmitButton.isDisplayed() && checkoutSubmitButton.isEnabled()) {
            checkoutSubmitButton.click();
        }
        
        // Check if it loads the checkout page
        Assert.assertNotSame(driver.getCurrentUrl(), "https://www.saree.com/checkout/onepage/success/");
    } catch (Exception e) {
        e.printStackTrace();
    }
}

@Test
public void failedBookVC5() {
    String name = "ABC";
    String country = "India";
    String whatsappNo = "1234123456";
    String outfitsAndOccasion = "Diwali Festivities";
    String email = "tanvi.kulkarni@in.ncs-i.com";
    String password = ""; // invalid password
    String comments = "Diwali Festivities: traditional wear";
    
    try {
        // Wait and click Book VC option
        WebElement bookVC = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#html-body > div.page-wrapper > header > div:nth-child(1) > div > div.flex-col-left.flex-grow-none > ul")));
        bookVC.click();

        // Fill in the appointment form
        WebElement nameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#name")));
        if (nameField.isDisplayed() && nameField.isEnabled()) {
            nameField.sendKeys(name);
        }

        WebElement countryField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#country")));
        if (countryField.isDisplayed() && countryField.isEnabled()) {
            countryField.sendKeys(country);
        }

        WebElement whatsappField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#wappnumber")));
        if (whatsappField.isDisplayed() && whatsappField.isEnabled()) {
            whatsappField.sendKeys(whatsappNo);
        }

        WebElement outfitField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#outfit")));
        if (outfitField.isDisplayed() && outfitField.isEnabled()) {
            outfitField.sendKeys(outfitsAndOccasion);
        }

        // Check if it loads the video-calling page
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saree.com/exclusive-video-calling");

        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#page-0 > div.amcform-toolbar > button")));
        if (submitButton.isDisplayed() && submitButton.isEnabled()) {
            submitButton.click();
        }

        // Wait for it to finish reloading
        Thread.sleep(20000); // Adjust timing as needed

        WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#customer-email")));
        if (emailField.isDisplayed() && emailField.isEnabled()) {
            emailField.sendKeys(email);
        }

        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#customer-password")));
        if (passwordField.isDisplayed() && passwordField.isEnabled()) {
            passwordField.sendKeys(password);
        }

        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#customer-email-fieldset > fieldset > div.actions-toolbar > div.primary > button")));
        if (loginButton.isDisplayed() && loginButton.isEnabled()) {
            loginButton.click();
        }

        // Check if it loads the checkout page
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saree.com/checkout/");

        Thread.sleep(5000); // Wait for the page to become stable

        WebElement commentBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/main/div[2]/div/div[3]/div[3]/ol/li[3]/div/form/fieldset/div[1]/div[2]/div/div/textarea")));
        if (commentBox.isDisplayed() && commentBox.isEnabled()) {
            commentBox.sendKeys(comments);
        }

        WebElement checkoutSubmitButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/main/div[2]/div/div[3]/aside/div[2]/div/div/div[2]/div[2]/div/div/button")));
        if (checkoutSubmitButton.isDisplayed() && checkoutSubmitButton.isEnabled()) {
            checkoutSubmitButton.click();
        }
        
        // Check if it does not load the success checkout page
        Assert.assertNotSame(driver.getCurrentUrl(), "https://www.saree.com/checkout/onepage/success/");
    } catch (Exception e) {
        e.printStackTrace();
    }
}

    //Test case failed: refer defect log report
    @Test
    public void failedBookVC6() {
        String name = "ABC";
        String country = "India";
        String whatsappNo = "9960336548";
        String outfitsAndOccasion = ""; // invalid outfits and occasion field
        String email = "tanvi.kulkarni@in.ncs-i.com";
        String password = "saree-lover21";
        String comments = "Diwali Festivities: traditional wear";
    
        try {
            // Wait and click Book VC option
            WebElement bookVC = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#html-body > div.page-wrapper > header > div:nth-child(1) > div > div.flex-col-left.flex-grow-none > ul")));
            bookVC.click();
    
            // Fill in the appointment form
            WebElement nameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#name")));
            if (nameField.isDisplayed() && nameField.isEnabled()) {
                nameField.sendKeys(name);
            }
    
            WebElement countryField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#country")));
            if (countryField.isDisplayed() && countryField.isEnabled()) {
                countryField.sendKeys(country);
            }
    
            WebElement whatsappField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#wappnumber")));
            if (whatsappField.isDisplayed() && whatsappField.isEnabled()) {
                whatsappField.sendKeys(whatsappNo);
            }
    
            WebElement outfitField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#outfit")));
            if (outfitField.isDisplayed() && outfitField.isEnabled()) {
                outfitField.sendKeys(outfitsAndOccasion);
            }
    
            // Check if it loads the video-calling page
            Assert.assertEquals(driver.getCurrentUrl(), "https://www.saree.com/exclusive-video-calling");
    
            WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#page-0 > div.amcform-toolbar > button")));
            if (submitButton.isDisplayed() && submitButton.isEnabled()) {
                submitButton.click();
            }
    
            // Wait for it to finish reloading
            Thread.sleep(20000); // Adjust timing as needed
    
            // Check again if it loads the video-calling page
            Assert.assertEquals(driver.getCurrentUrl(), "https://www.saree.com/exclusive-video-calling");
    
            WebElement emailField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#customer-email")));
            if (emailField.isDisplayed() && emailField.isEnabled()) {
                emailField.sendKeys(email);
            }
    
            WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#customer-password")));
            if (passwordField.isDisplayed() && passwordField.isEnabled()) {
                passwordField.sendKeys(password);
            }
    
            WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("#customer-email-fieldset > fieldset > div.actions-toolbar > div.primary > button")));
            if (loginButton.isDisplayed() && loginButton.isEnabled()) {
                loginButton.click();
            }
    
            // Wait for the page to become stable
            Thread.sleep(5000);
    
            WebElement commentBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/main/div[2]/div/div[3]/div[3]/ol/li[3]/div/form/fieldset/div[1]/div[2]/div/div/textarea")));
            if (commentBox.isDisplayed() && commentBox.isEnabled()) {
                commentBox.sendKeys(comments);
            }
    
            WebElement checkoutSubmitButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[3]/main/div[2]/div/div[3]/aside/div[2]/div/div/div[2]/div[2]/div/div/button")));
            if (checkoutSubmitButton.isDisplayed() && checkoutSubmitButton.isEnabled()) {
                checkoutSubmitButton.click();
            }
    
            // Check if it does not load the success checkout page
            Assert.assertNotSame(driver.getCurrentUrl(), "https://www.saree.com/checkout/onepage/success/");
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
