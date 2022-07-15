package com.github.curriculeon;

import com.git_leon.leonium.browsertools.With;
import com.git_leon.leonium.browsertools.browserhandler.BrowserHandler;
import com.git_leon.leonium.browsertools.browserhandler.WebEntity;
import com.git_leon.leonium.browsertools.factories.BrowserHandlerFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

// https://www.guru99.com/first-webdriver-script.html
public class MyObject implements Runnable {
    BrowserHandler browser = BrowserHandlerFactory.FIREFOX.getBrowserHandler();

    public void run() {
        String baseUrl = "http://automationpractice.com/index.php";
        browser.navigateTo(baseUrl);
        navigateToShirtSearch();
        selectShirtToBuy();
    }

    private void selectShirtToBuy() {
        By byFadedShortSleeveTShirts = With.attributeValue("alt", "Faded Short Sleeve T-shirts");
        WebEntity firstElementInList = browser.getWebEntity(byFadedShortSleeveTShirts);
        firstElementInList.click();
    }

    private void navigateToShirtSearch() {
        WebEntity inputSearch = browser.getWebEntity(By.id("search_query_top"));
        WebEntity buttonSearch = browser.getWebEntity(By.xpath("//*[@id=\"searchbox\"]/button"));
        inputSearch.sendKeys("shirt");
        buttonSearch.click();
    }
}
