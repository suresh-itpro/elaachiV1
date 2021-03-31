package com.elaachiV2.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
	WebDriver Idriver;
	public LoginPage(WebDriver rdriver)
	{
		Idriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	@FindBy(name="email")
	@CacheLookup
	WebElement txtUserEmail;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(xpath="//strong[text()='SUBMIT']")
	@CacheLookup
	WebElement btnSubmit;
	//@FindBy(id="dropdownMenuButton")
	//@CacheLookup
    //WebElement lnkAdmin;
     //@FindBy(linkText="sign-out")
     //@CacheLookup
     //WebElement signout;

	
	public void setUserEmail(String uemail)
	{
		txtUserEmail.sendKeys(uemail);
	}
	public void setPassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	public void clickSubmit() throws InterruptedException
	{
		btnSubmit.click();
		Thread.sleep(5000);
	}	
	//public void clickAdmin()
	//{
		//lnkAdmin.click();
	//}
	//public void clickSignout()
	//{
		//signout.click();	
	//}

}
