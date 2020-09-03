package com.example.selenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.stereotype.Component;

@Component
public class ShopNewPage implements BasePage {

    @FindBy(how = How.CSS, using = "[class='btn btn-primary btn-md btn-block']")
    public WebElement shopNewSearch;


}