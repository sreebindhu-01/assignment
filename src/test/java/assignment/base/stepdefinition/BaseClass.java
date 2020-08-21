package assignment.base.stepdefinition;

import assignment.Pages.CalculatorPage;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class BaseClass {
    public WebDriver driver;
    public CalculatorPage cPage;
    public Logger logger;
    public Properties prop;
    public ExtentHtmlReporter htmlReporter;
    public ExtentReports extent;
    public ExtentTest test;

    public void setExtent() {
        System.out.println("called extent");
        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/Reports/assignmentextent.html");
        htmlReporter.config().setDocumentTitle("Assignment");
        htmlReporter.config().setReportName("functional reporter");
        htmlReporter.config().setTheme(Theme.DARK);
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        extent.setSystemInfo("hostname", "local host");
        extent.setSystemInfo("OS", "Widows10");
        extent.setSystemInfo("TesterName", "Bind");
        extent.setSystemInfo("Browser", "Chrome");
    }
}
