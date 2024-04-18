package com.ShoppersStack.Register;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[text()='s']")
	private WebElement ProfileSetting;
	
	@FindBy(xpath="//li[text()=\"My Profile\"]")
	private WebElement MyProfile;

	@FindBy(xpath="//li[text()='Logout']")
	private WebElement logout;
	
	public WebElement getProfileSetting() {
		return ProfileSetting;
	}

	public WebElement getMyProfile() {
		return MyProfile;
	}

	public WebElement getLogout() {
		return logout;
	}
	
	
}
