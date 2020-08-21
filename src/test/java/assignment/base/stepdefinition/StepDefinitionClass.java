package assignment.base.stepdefinition;

import assignment.Pages.CalculatorPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.log4j.xml.DOMConfigurator;
import org.apache.logging.log4j.LogManager;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class StepDefinitionClass extends BaseClass {

    @Before
    public void setUp() {

        logger = LogManager.getLogger("StepDefinitionClass");
        DOMConfigurator.configure("log4j.xml");
        logger.getName();
        String path = System.getProperty("user.dir") + "/src/test/resources/properties/Assignment.properties";
        prop = new Properties();
        try {
            FileInputStream fis = new FileInputStream(path);
            prop.load(fis);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String browser = prop.getProperty("browser");
        if (browser.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.chromedriver().setup();
        } else {
            logger.info("invalid browser specified");
        }
        cPage = new CalculatorPage(driver);
        setExtent();
        test = extent.createTest("launch Chrome browser");
        test.getStatus();
        test.createNode("launch Chrome browser");
        logger.info("launch Chrome browser");
    }

    @When("user opens url {string}")
    public void user_opens_url(String url) {
        driver.get(url);
        driver.manage().window().maximize();
        test = extent.createTest("opens the url");
        test.getStatus();
        test.createNode("opens the url");
        logger.info("opens URL");
    }

    @Then("user clicks on calculator")
    public void user_clicks_on_calculator() {
        cPage.clickCalc();
        test = extent.createTest("clicks on calculator");
        test.getStatus();
        test.createNode("clicks on calculator");
        logger.info("clicks on calculator");
    }

    @Then("user clicks on price of one bit coin")
    public void user_clicks_on_price_of_one_bit_coin() {
        test = extent.createTest("clicks on price of one bit coin");
        test.getStatus();
        test.createNode("clicks on price of one bit coin");
        logger.info("clicks on price of one bit coin");
        cPage.bitCo();
    }

    @After
    public void quit() {
        extent.flush();
        driver.quit();
    }
}
