package com.ShoppersStack.Register;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAddressFormPage 
{
	public MyAddressFormPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Office")
	private WebElement office;
	
	@FindBy(id="Name")
	private WebElement name;
	
	@FindBy(id="House/Office Info")
	private WebElement houseNo;
	
	@FindBy(id="Street Info")
	private WebElement streetInfo;
	
	@FindBy(id="Landmark")
	private WebElement landmark;
	
	@FindBy(id="Country")
	private WebElement country;
	
	@FindBy(id="State")
	private WebElement state;
	
	@FindBy(id="City")
	private WebElement city;
	
	@FindBy(id="Pincode")
	private WebElement pincode;
	
	@FindBy(id="Phone Number")
	private WebElement phoneNumber;

	@FindBy(id="addAddress")
	private WebElement addAddress;

	public WebElement getOffice() {
		return office;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getHouseNo() {
		return houseNo;
	}

	public WebElement getStreetInfo() {
		return streetInfo;
	}

	public WebElement getLandmark() {
		return landmark;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getPincode() {
		return pincode;
	}

	public WebElement getPhoneNumber() {
		return phoneNumber;
	}

	public WebElement getAddAddress() {
		return addAddress;
	}
	
	
}
