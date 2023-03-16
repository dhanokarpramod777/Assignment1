package BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class BaseClass {
	
	
public static WebDriver firefoxDriver() throws InterruptedException {
		
	    System.setProperty("webdriver.gecko.driver","src\\main\\resources\\Browser\\geckodriver.exe");
	    WebDriver driver = new FirefoxDriver();
	    driver.get("https://book.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		return driver;
			
	}

	static ExtentHtmlReporter htmlReporter;
	static ExtentReports report;
	static ExtentTest test;
	
	public static ExtentTest getTestForReproter(String useCase) {
		return test=report.createTest(useCase);
		
	}
	public static ExtentHtmlReporter gethtmlReporter() {
		if(htmlReporter==null) {
			htmlReporter = new ExtentHtmlReporter("ExtentReporter.html");
		}
		return htmlReporter;	
	}
	
	public static ExtentReports getExtentReports() {
		
		if(report==null) {
			report = new ExtentReports();
			report.attachReporter(htmlReporter);
		}
		
		return report;
	}

}
