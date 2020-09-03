package com.example.selenium.steps;

import com.example.selenium.pages.ShopUsedPage;
import io.cucumber.java.en.Given;
import org.springframework.beans.factory.annotation.Autowired;

public class ShopUsedSteps {

    @Autowired
    private ShopUsedPage shopUsedPage;

    @Given("I shop for used car")
    public void i_shop_for_used_car() {
        shopUsedPage.shopUsedSearch.click();
    }

}
