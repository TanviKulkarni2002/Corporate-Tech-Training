package com.ncs.StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CommonSteps {

    @Given("the user has chosen a browser and logged onto the website")
    public void logOnToWebsite() throws InterruptedException {
        CommonMethod.initializeDriver();
        CommonMethod.logOnToWebsite();
        CommonMethod.navigateToKurti();
    }

    @Then("the user should see a display of all the Kurti options")
    public void verifyKurtiDisplay() {
        WebDriver driver = CommonMethod.getDriver();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.saree.com/kurti");
    }

    @And(value="close the browser")
    public void killBrowser(){
        CommonMethod.shutDown();
    }
}
