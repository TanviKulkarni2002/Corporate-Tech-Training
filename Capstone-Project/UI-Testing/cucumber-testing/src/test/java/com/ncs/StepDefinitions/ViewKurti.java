package com.ncs.StepDefinitions;

import org.testng.Assert;

import io.cucumber.java.en.Then;

public class ViewKurti {

    @Then("the user clicks on the Kurti tab in the navigation bar")
    public void selectKurtiTab() throws InterruptedException {
        Assert.assertEquals(CommonMethod.driver.getCurrentUrl(),"https://www.saree.com/kurti");
        Thread.sleep(3000);
    }
}