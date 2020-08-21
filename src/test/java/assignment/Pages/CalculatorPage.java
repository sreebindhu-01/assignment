package assignment.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalculatorPage {
    public WebDriver ldriver;


    public CalculatorPage(WebDriver rdriver) {
        ldriver = rdriver;
        PageFactory.initElements(rdriver, this);
    }

    /**path for calculator**/
    @FindBy(xpath = "//*[@id=\"gatsby-focus-wrapper\"]/div/header/div/nav[1]/ul/li[3]/a")
    WebElement calc;

    /**path for price of 1 bitcoin**/
    @FindBy(className = "link-query")
    WebElement bitCoin;

    /**click on calculator**/
    public void clickCalc() {
        calc.click();
    }

    /**click on price of 1 bit coin**/
    public void bitCo() {
        bitCoin.click();
    }
}
