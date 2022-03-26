package org.example.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.example.pageobject.pages.SearchPage;
import org.testng.Assert;

import static org.example.stepdefinitions.BaseSteps.PAGES_STORAGE;

public class SearchPageSteps {

    @And("the sentence {string} on {string} is present at the top of the page")
    public void theSentenceIsPresent(String expectedInfo, String pageName) {
        String info = ((SearchPage) PAGES_STORAGE.get(pageName)).getInfo();
        Assert.assertTrue(info.contains(expectedInfo), "The result is not as expected");
    }

    @Then("User gets the error message {string} on {string}")
    public void userGetsErrorMessage(String errorMessage, String pageName) {
        Assert.assertEquals(((SearchPage) PAGES_STORAGE.get(pageName)).getError(), errorMessage,
                "");

    }
}
