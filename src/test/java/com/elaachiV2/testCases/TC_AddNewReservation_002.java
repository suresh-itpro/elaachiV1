package com.elaachiV2.testCases;


import java.io.IOException;

import org.testng.Assert;

import com.elaachiV2.pageObjects.AddNewReservation;
import com.elaachiV2.pageObjects.LoginPage;

public class TC_AddNewReservation_002 extends BaseClass

{
    public void AddNewReservation() throws InterruptedException, IOException
    {
    	logger.info("connect driver");
    	LoginPage lp = new LoginPage(driver);
    	lp.setUserEmail(userEmail);
    	logger.info("enter useremail");
    	lp.setPassword(password);
    	logger.info("enter password");
    	lp.clickSubmit();
    	Thread.sleep(3000);
    	AddNewReservation addres=new AddNewReservation(driver);
    	addres.clickReservation();
    	Thread.sleep(3000);
    	addres.clickNewReservation();
    	Thread.sleep(3000);
    	addres.custfirstname("suresh");
    	addres.custlastname("sk");
    	addres.custresedate("12/1/2020,6:00PM");
    	Thread.sleep(3000);
    	addres.custphnnum("8142737758");
    	addres.custemailid("suresh@gmail.com");
    	addres.custoccu("Birthday");
    	addres.clickCheckAvailability(); 
    	
    	Thread.sleep(3000);
    	logger.info("checkavailability seat displayig..");
    	boolean res=driver.getPageSource().contains("New Reservation ");
    	if(res==true){
    		Assert.assertTrue(true);
    		logger.info("test is passed");
    	}else 
    	{
    
    		logger.info("test is failed");
    		captureScreen(driver,"AddNewReservation");
    		Assert.assertTrue(false);
    	}
    }
}
