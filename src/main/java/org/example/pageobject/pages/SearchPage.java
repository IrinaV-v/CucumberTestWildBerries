package org.example.pageobject.pages;

import org.example.pageobject.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchPage extends BasePage {
    public SearchPage(WebDriver webDriver) {
        super(webDriver);
    }

    public String getInfo() {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class = \"searching-results__title\"]")));
        WebElement info = webDriver.findElement(By.xpath("//h1[@class = \"searching-results__title\"]"));
        return info.getText();
    }

    public String getError() {
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"catalog\"]/div[2]/div/p")));
        WebElement error = webDriver.findElement(By.xpath("//*[@id=\"catalog\"]/div[2]/div/p"));
        return error.getText();
    }
}
