package TestData;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import BaseClass.BaseClass;
import POM1.FlightBook;


import UtilClass.UtilClass;


public class Test1 {
	WebDriver driver ;
	
	FlightBook fb ;
	
	ExtentHtmlReporter htmlReporter;
	ExtentReports report;
	ExtentTest test;

	 @BeforeClass
	  public void beforeClass() throws InterruptedException 
	 {
		      driver=BaseClass.firefoxDriver();
		   	  htmlReporter = BaseClass.gethtmlReporter();
			  report = BaseClass.getExtentReports();
			  test = BaseClass.getTestForReproter("Test1");	
	  }
	  @BeforeMethod
	  public void beforeMethod() 
	  {
		fb = new FlightBook(driver);
		 
	  }
	  
	

	  @Test( )
       public void VerifyUser_Login() throws IOException, InterruptedException {
				
		  fb.isFlights();
		  fb.isRoundTrip();
		  
		  fb.isDepartureCity();
		  fb.isCity1();
		  
		  fb.isArrivalCity();
		  fb.isCity2();
		  
		  fb.isDEPARTDATE();
		  fb.isdate1();
		  
		  fb.isRETURNDATE();
		  fb.isdate2();
		  
		  fb.isPASSENGERS();
		  fb.isAdult();
		  fb.ischild();
		  
		  fb.isSubmit();
		  driver.findElement(By.xpath("(//span[@class='bound-city uppercase'])")).isDisplayed();
		  
		  System.out.println("DEPARTURE FLIGHT Text on Page");
		    
	  }
		
	  
	  @AfterMethod
	  public void afterMethod(ITestResult result) throws IOException {
		  if(result.getStatus() == ITestResult.SUCCESS){
			  String path = fb.getScreenShot(driver, result.getName());
				test.log(Status.PASS, "Test is passed " + result.getName(),
				MediaEntityBuilder.createScreenCaptureFromPath(path).build());
			}
			else
			{
				String path = fb.getScreenShot(driver, result.getName());
				test.log(Status.FAIL, "Test is failed " + result.getName(), 
				MediaEntityBuilder.createScreenCaptureFromPath(path).build());
			}  	
		 
		  
	  } 

     @AfterClass
     public void afterClass() {
   	  report.flush();
   	  driver.quit(); 
  }
}
