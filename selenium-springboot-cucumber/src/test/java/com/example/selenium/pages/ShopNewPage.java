package com.example.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ShopNewPage implements BasePage {

    @FindBy(how = How.CSS, using = "[class='btn btn-primary btn-md btn-block']")
    public WebElement shopNewSearch;

    @FindBy(how = How.CSS, using = "[data-qa='ModelSelect']")
    public List<WebElement> carModels;

    @FindBy(how = How.CSS, using = "[data-test='modelSearchBrand']")
    public List<WebElement> carMakes;

    public List<String> getTextFromWebElement() {
        List<String> textFromListWeb = new ArrayList<>();
        for (WebElement carModel : carModels) {
            textFromListWeb.add(carModel.getText().split("/n")[0]);
        }
        return textFromListWeb;
    }

    @FindBy(how = How.CSS, using = "[data-test='modelSearchOptionBody']")
    public WebElement bodyType;

    @FindBy(how = How.CSS, using = "[data-test='modelSearchBodyType']")
    private List<WebElement> bodyTypes;

    public void chooseBodyType(String text) {
        for (int i = 0; i < bodyTypes.size(); i++) {
            if(bodyTypes.get(i).getText().equals(text)){
                bodyTypes.get(i).click();
                break;
            }

        }
    }

    @FindBy(how = How.CSS, using = "[data-qa='model-search-brand-new']")
    public List<WebElement> numberOfCarsForTheGivenBodyType;



}