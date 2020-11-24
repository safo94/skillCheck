package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.eo.Se;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.TimeUnit;

public class StepDefinitions {
    // @Autowired
    private WebElements webElements;

    private WebDriver driver;

    @Given("Navigate to cars.com")
    public void navigate_to_cars_com() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        webElements = PageFactory.initElements(driver, WebElements.class);
        driver.navigate().to("https://www.cars.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Then("Input credentials")
    public void input_credentials() throws InterruptedException {
        Select select = new Select(webElements.carCondition);
        select.selectByVisibleText("New Cars");

        Select select1 = new Select(webElements.carMake);
        select1.selectByVisibleText("Honda");

        Select select2 = new Select(webElements.carModel);
        select2.selectByVisibleText("Accord");

        Select select3 = new Select(webElements.carPrice);
        select3.selectByVisibleText("$30,000");

        Select select4 = new Select(webElements.carDistance);
        select4.selectByVisibleText("30 Miles from");

       webElements.zip.clear();
       webElements.zip.sendKeys("02472");
       webElements.search.click();
    }

    @Then("Click search")
    public void click_search() {
        //  driver.quit();

    }
}
