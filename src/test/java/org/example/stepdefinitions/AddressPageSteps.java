package org.example.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.example.pageobject.pages.AddressPage;
import org.testng.Assert;

import static org.example.stepdefinitions.BaseSteps.PAGES_STORAGE;
import static org.example.stepdefinitions.BaseSteps.webDriver;

public class AddressPageSteps {

    @And("the sentence {string} on {string} is present on the page")
    public void theSentenceIsPresent(String expectedInfo, String pageName) {
        String info = ((AddressPage) PAGES_STORAGE.get(pageName)).getInfo();
        Assert.assertEquals(info, expectedInfo, "Incorrect page");
    }

    @When("The user is successfully navigated to the {string}")
    public void userIsNavigatedToTheDeliveryPage(String expectedUrl) {
        Assert.assertEquals(expectedUrl, webDriver.getCurrentUrl());
    }
}