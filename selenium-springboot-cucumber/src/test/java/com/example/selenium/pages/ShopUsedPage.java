package com.example.selenium.pages;

import com.example.selenium.helpers.VisibilityHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShopUsedPage implements BasePage {

    private static final String LINKS_AREA_LOCATOR = "#links";

    @Autowired
    private VisibilityHelper visibilityHelper;

    public void assertLinksArea(){
        visibilityHelper.waitForPresenceOf(By.cssSelector(LINKS_AREA_LOCATOR));
    }

    @FindBy(how = How.CSS, using = "[data-test='homepageHeroPanelShopUsedButton']")
    public WebElement shopUsedSearch;


}