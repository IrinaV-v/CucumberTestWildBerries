package org.example.pageobject.pages;

import org.example.pageobject.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
    @FindBy(id = "applySearchBtn")
    private WebElement searchButton;

    @FindBy(id = "searchInput")
    private WebElement searchField;

    @FindBy(xpath = "//*[@id=\"basketContent\"]/div[1]/a")
    private WebElement addressButton;


    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    public SearchPage inputSearchElement(String element) {
        searchField.sendKeys(element);
        searchButton.click();
        return new SearchPage(webDriver);
    }

    public AddressPage navigateToAddressPage() {
        addressButton.click();
        return new AddressPage(webDriver);
    }

    public HomePage open(){
        webDriver.get("https://www.wildberries.ru/");
        return this;
    }


}
