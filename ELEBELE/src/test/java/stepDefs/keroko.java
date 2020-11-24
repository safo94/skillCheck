package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import runner.TestRunner;

import java.util.Set;
import java.util.concurrent.TimeUnit;


public class keroko {

    @Autowired

    private WebDriver driver;
    private WebElements webElements;

    @Given("navigate to website")
    public void navigate_to_website() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://the-internet.herokuapp.com/frames");
        webElements = PageFactory.initElements(driver, WebElements.class);

    }

    @When("click on button")
    public void click_on_button() {
        WebElement lol = new WebDriverWait(driver,5)
                .until(ExpectedConditions.elementToBeClickable(webElements.ok));
        lol.click();


    }


}
