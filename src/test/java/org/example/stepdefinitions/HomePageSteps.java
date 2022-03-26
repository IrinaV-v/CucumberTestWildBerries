package org.example.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pageobject.pages.AddressPage;
import org.example.pageobject.pages.HomePage;
import org.example.pageobject.pages.SearchPage;
import org.testng.Assert;

import static org.example.stepdefinitions.BaseSteps.PAGES_STORAGE;
import static org.example.stepdefinitions.BaseSteps.webDriver;

public class HomePageSteps {

    @Given("User is on the {string}")
    public void userIsOnHomePage(String pageName) {
        HomePage page = new HomePage(webDriver);
        PAGES_STORAGE.put(pageName, page);
        page.open();
    }

    @When("User enters an item as {string} on {string}")
    public void userEntersElementName(String element, String pageName) {
        PAGES_STORAGE.put("Search Page", ((HomePage) PAGES_STORAGE.get(pageName)).inputSearchElement(element));
    }

    @Then("User is successfully navigated to the {string}")
    public void userIsSuccessfullyNavigatedToThePage(String expectedUrl) {
        Assert.assertEquals(expectedUrl, webDriver.getCurrentUrl());
    }

    @When("User enters an item as <element> on {string}")
    public void userEntersWrongElementName(String element, String pageName) {
        PAGES_STORAGE.put("Search Page", ((HomePage) PAGES_STORAGE.get(pageName)).inputSearchElement(element));
    }

    @Then("User clicks on the Map icon.")
    public void userClicksOnTheMapIcon() {
        HomePage page = new HomePage(webDriver);
        PAGES_STORAGE.put("Address Page", ((HomePage) PAGES_STORAGE.get("Home Page")).navigateToAddressPage());
    }
}
