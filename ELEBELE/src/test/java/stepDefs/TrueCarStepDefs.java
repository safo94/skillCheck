package stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TrueCarStepDefs {
    private WebElements webElements;
    WebDriver driver;

    @Given("navigate to true.com")
    public void navigate_to_true_com() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.navigate().to("https://www.truecar.com/");
        webElements = PageFactory.initElements(driver, WebElements.class);
        webElements.ShopNew.click();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
    }

    @Then("choose a make")
    public void choose_a_make() {
        make("Dodge").click();
    }

    @Then("choose a model")
    public void choose_a_model() {
        model("challenger").click();
    }


    public WebElement model(String md) {
        WebElement modo = driver.findElement(By.cssSelector("[data-test-item='" + md + "'"));
        return modo;
    }

    public WebElement make(String mk) {
        List<WebElement> webElementList = webElements.MakeTrueCar;
        WebElement lola = null;
        for (WebElement make : webElementList) {
            if (make.getText().equals(mk)) {
                lola = make;
            }
        }
        return lola;

    }
}
