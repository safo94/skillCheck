package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.springframework.beans.factory.annotation.Autowired;

public class StepDefinitions {
   // @Autowired
    private WebElements webElements;

    private WebDriver driver;

    @Given("Navigate to cars.com")
    public void navigate_to_cars_com() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        webElements = PageFactory.initElements(driver, WebElements.class);
        driver.navigate().to("https://www.cars.com/");
        Thread.sleep(3000);
    }

    @Then("Input credentials")
    public void input_credentials() {
        Select select = new Select(webElements.carCondition);
        select.selectByVisibleText("Used Cars");
        Select select1 = new Select(webElements.carMake);
        select1.selectByVisibleText("Lexus");
        Select select2 = new Select(webElements.carModel);
        select2.selectByVisibleText("- IS 350");
        Select select3 = new Select(webElements.carPrice);
        select3.selectByValue("35000");
        Select select4 = new Select(webElements.carDistance);
        select4.selectByVisibleText("40 Miles from");
        webElements.zip.clear();
        webElements.zip.sendKeys("02472");
    }

    @Then("Click search")
    public void click_search() {
        webElements.search.click();

    }
}
