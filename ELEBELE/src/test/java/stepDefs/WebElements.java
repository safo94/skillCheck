package stepDefs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class WebElements {


    @FindBy(how = How.CSS, using = "[class='global-nav__parent'] [data-linkname='header-buy']")
    public WebElement carsForSale;

    @FindBy(how = How.NAME, using = "stockType")
    public WebElement carCondition;

    @FindBy(how = How.CSS, using = "[aria-label='Select a make']")
    public WebElement carMake;

    @FindBy(how = How.CSS, using = "[aria-label='Select a model']")
    public WebElement carModel;

    @FindBy(how = How.NAME, using = "priceMax")
    public WebElement carPrice;

    @FindBy(how = How.CSS, using = "[aria-label='Select a maximum distance']")
    public WebElement carDistance;

    @FindBy(how = How.CSS, using = "[aria-label='Enter a Zip Code']")
    public WebElement zip;

    @FindBy(how = How.CSS, using = "[value='Search']")
    public WebElement search;


}
