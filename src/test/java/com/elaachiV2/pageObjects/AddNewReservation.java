package com.elaachiV2.pageObjects;

    
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class AddNewReservation 
{
	WebDriver Idriver;
	public AddNewReservation(WebDriver rdriver)
	{
		Idriver=rdriver;
		PageFactory.initElements(rdriver,this);
	}
	    @FindBy(how = How.XPATH, using="//span[text()='RESERVATIONS']")
        @CacheLookup
        WebElement lnkReservation;
        @FindBy(how = How.XPATH, using="//button[@id='openNewReservation']")
        @CacheLookup
        WebElement lnkNewReservation;
        @FindBy(how = How.NAME, using="firstName")
        @CacheLookup
        WebElement custfirstname;
        @FindBy(how = How.NAME, using="lastName")
        @CacheLookup
        WebElement custlastname;
        @FindBy(how = How.NAME, using="reservedDate")
        @CacheLookup
        WebElement custresdate;
        @FindBy(how = How.NAME, using="InputPhone")
        @CacheLookup
        WebElement custphnno;
        @FindBy(how = How.NAME, using="email")
        @CacheLookup
        WebElement custemailid;
        @FindBy(how = How.ID, using="occasion ")
        @CacheLookup
        WebElement custoccu;
        @FindBy(how = How.XPATH, using="(//button[@id='openNewReservation'])[2]") 
        @CacheLookup
        WebElement tablecheck;
        
        public void clickReservation()
        {
        	lnkReservation.click();
        }
        public void clickNewReservation()
        {
        	lnkNewReservation.click();
        }
        public void custfirstname(String cfname)
        {
        	custfirstname.sendKeys(cfname);
        }
        public void custlastname(String clname){
        	custlastname.sendKeys(clname);
        }
        public void custresedate(String crdate){
        	custresdate.sendKeys(crdate);
         }
        public void custphnnum(String cphno){
        	custphnno.sendKeys(cphno);
        }
        public void custemailid(String cemail){
        	custemailid.sendKeys(cemail);
        }
        public void custoccu(String coccu){
        	custoccu.click();
        	
        }
        public void clickCheckAvailability(){
        	tablecheck.click();
        	
        }
        
}
