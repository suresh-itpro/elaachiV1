package com.elaachiV2.testCases;



import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.elaachiV2.pageObjects.LoginPage;
public class TC_LoginTest_001 extends BaseClass
{
@Test
public void LoginTest() throws IOException, InterruptedException
{
	
	logger.info("URL is opened");
	LoginPage lp=new LoginPage(driver);
	lp.setUserEmail(userEmail);
	logger.info("enter useremail");
	lp.setPassword(password);
	logger.info("enter password");
	lp.clickSubmit();
	Thread.sleep(5000);
	if(driver.getCurrentUrl().equals("http://sales-testv2-dasboard.s3-website-us-east-1.amazonaws.com/restaurant"))
	{
		Assert.assertTrue(true);
		logger.info("Login test passed");
	}
	else
	{
		captureScreen(driver,"LoginTest");
		Assert.assertTrue(false);
		logger.info("Login test failed");
	}
	
}
}    