package com.example.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.springframework.stereotype.Component;

@Component
public class SellOrTradePage implements BasePage{
    @FindBy(how = How.CSS, using = "[data-analytics-event-label='Sell or Trade']")
    public WebElement sellOrTrade;

    @FindBy(how = How.CSS, using = "[data-test='licensePlateNumber']")
    public WebElement licensePlate;

    @FindBy(how = How.ID_OR_NAME, using = "licensePlateState")
    private WebElement stateWebElement;

    public void selectState(String state){
        Select select = new Select(stateWebElement);
        select.selectByVisibleText(state);
    }

}
