package org.example.pageobject.pages;

import org.example.pageobject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AddressPage extends BasePage {

    protected AddressPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String getInfo() {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text() = \"Доставка\"]")));
        WebElement info = webDriver.findElement(By.xpath("//h1[text() = \"Доставка\"]"));
        return info.getText();
    }
}
