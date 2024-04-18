package com.ShoppersStack.Register;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAddressPage 
{
	public MyAddressPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getAddAddress() {
		return addAddress;
	}
	

	@FindBy(xpath="//button[text()='Add Address']")
	private WebElement addAddress;
	
	public WebElement getDeleteAddress() {
		return deleteAddress;
	}

	public WebElement getYesBtn() {
		return yesBtn;
	}


	@FindBy(xpath="(//button[contains(@class,'MuiButtonBase')])[4]")
	private WebElement deleteAddress;
	
	@FindBy(xpath="(//button[text()='Yes'])[1]")
	private WebElement yesBtn;
}
