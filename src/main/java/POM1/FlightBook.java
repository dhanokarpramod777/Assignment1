package POM1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import UtilClass.UtilClass;

public class FlightBook extends UtilClass   {
	
	
	WebDriver driver;

	@FindBy(xpath="(//span[@class='text-label text-active'])")
	private WebElement  Flights  ;
	
	@FindBy(xpath="(//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_RoundTrip'])")
	private WebElement RoundTrip;                           //1
	
	@FindBy(xpath="(//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT'])")
	private WebElement DepartureCity;
	@FindBy(linkText="Mumbai (BOM)")
	private WebElement city1;
	
	
	@FindBy(xpath="(//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT'])")
	private WebElement ArrivalCity;
	
	@FindBy(linkText="Delhi (DEL)")
	private WebElement city2;
	
	
	@FindBy(xpath="(//input[@id='custom_date_picker_id_1'])[1]")
	private WebElement DEPARTDATE;
	
	@FindBy(xpath="(//a[@class='ui-state-default'])[18]")
	private WebElement date1;
	
	@FindBy(xpath="(//input[@id='custom_date_picker_id_2'])[1]")
	private WebElement RETURNDATE;
	
	@FindBy(xpath="(//a[@class='ui-state-default'])[19]")
	private WebElement date2;
	
	
	@FindBy(xpath="(//div[@id='divpaxinfo'])")
	private WebElement PASSENGERS;
	
	@FindBy(xpath="(//select[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT'])")
	private WebElement Adult;
	
	@FindBy(xpath="(//select[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_CHD'])")
	private WebElement child;
	
	@FindBy(xpath="(//input[@type='submit'])[1]")
	private WebElement submit;
	
	
	public FlightBook (WebDriver driver ) {
		PageFactory.initElements(driver, this);
		this.driver = driver ;
	}
	
	public void isFlights() 
	{
		   expliciteWait(driver, Flights).click();	
	}
	
		
	public void isRoundTrip() throws InterruptedException 
	{
				expliciteWait(driver, RoundTrip).click();
	}
	


	public void isDepartureCity() throws InterruptedException   {
		  
		    expliciteWait(driver, DepartureCity).click();
		     
	}
	public void isCity1() throws InterruptedException   {
		  
	    expliciteWait(driver, city1).click();
	     
}

	
	public void isArrivalCity() throws InterruptedException {
	    expliciteWait(driver, ArrivalCity).click();
	  
		}
	
	public void isCity2() throws InterruptedException   {
		  
	    expliciteWait(driver, city2).click();
	     
}
	public void isDEPARTDATE() throws InterruptedException {
		
		     expliciteWait(driver, DEPARTDATE);
		     DEPARTDATE.click();
		    	
			}

	public void isdate1() throws InterruptedException {
		
	     expliciteWait(driver, date1);
	     date1.click();
	     Thread.sleep(1000);
	    	
		}

	public void isRETURNDATE() throws InterruptedException {
		
	     expliciteWait(driver, RETURNDATE);
	     RETURNDATE.click();
	    	
		}

	public void isdate2() throws InterruptedException {
		
	     expliciteWait(driver, date2);
	     date2.click();
	     Thread.sleep(1000);
		}

	public void isPASSENGERS() throws InterruptedException {
		
	     expliciteWait(driver, PASSENGERS);
	     PASSENGERS.click();
	    	
		}
	public void isAdult() throws InterruptedException {
		
	     expliciteWait(driver, Adult).click();
	     Select s = new Select(Adult);
	     s.selectByValue("3");
	  
	    	
		}
	public void ischild() throws InterruptedException {
		
	     expliciteWait(driver, child).click();
	     Select s = new Select(child);
	     s.selectByValue("2");
	    	
		}

	public void isSubmit() throws InterruptedException {
		
	     expliciteWait(driver, submit);
	     submit.click();
	    	
		}

	
	
}
