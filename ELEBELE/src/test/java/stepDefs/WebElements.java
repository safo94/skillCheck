package stepDefs;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.maven.model.Model;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class WebElements {




    @FindBy(how = How.CSS, using ="[aria-label='Select a stock type']")
    public WebElement carCondition;

    @FindBy(how = How.CSS, using = "[target='_blank']")
    public WebElement ok;

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

    @FindBy(how = How.CSS, using = "[href='https://saucelabs.com/']")
    public WebElement newTab;

    @FindBy(how = How.CSS, using = "[class='d-inline-block align-self-center align-middle _yak6vp']")
    public List <WebElement> MakeTrueCar;








    @FindBy(how = How.CSS, using = "[data-test='homepageHeroPanelShopNewButton']")
    public WebElement ShopNew;
}
