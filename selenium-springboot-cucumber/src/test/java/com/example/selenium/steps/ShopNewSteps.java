package com.example.selenium.steps;

import com.example.selenium.pages.ShopNewPage;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ShopNewSteps {

    @Autowired
    private ShopNewPage shopNewPage;

    @Given("I shop for new car")
    public void i_shop_for_a_car() throws InterruptedException {
        shopNewPage.shopNewSearch.click();
    }

    @Then("I verify there are {int} car makes")
    public void i_verify_there_are_car_makes(int numberMakes) {
        List<WebElement> carMakes = shopNewPage.carMakes;
        Assert.assertEquals(numberMakes, carMakes.size());
    }

    @Then("I select make {string}")
    public void i_select_make(String make) {
        List<WebElement> carMakes = shopNewPage.carMakes;
        for (int i = 0; i < carMakes.size() ; i++) {
            if(carMakes.get(i).getText().equals(make)){
                carMakes.get(i).click();
                break;
            }
        }
    }

    @Then("I verify car models are {string}")
    public void i_verify_car_models_are(String models) throws InterruptedException {
        Thread.sleep(2000);
        String modelsArr [] = models.split(",");
        List<String> actualCarModels = shopNewPage.getTextFromWebElement();
        for (int i = 0; i <modelsArr.length ; i++) {
            Assert.assertTrue("Failed model: "+modelsArr[i],
                    actualCarModels.contains(modelsArr[i]));
        }

    }

}
