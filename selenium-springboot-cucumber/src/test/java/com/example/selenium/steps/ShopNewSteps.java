package com.example.selenium.steps;

import com.example.selenium.pages.ShopNewPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

public class ShopNewSteps {

    @Autowired
    private ShopNewPage shopNewPage;

    @Given("I shop for new car")
    public void i_shop_for_a_car() {
        shopNewPage.shopNewSearch.click();
    }

}
