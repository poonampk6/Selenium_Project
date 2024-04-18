package com.ShoppersStack_testScripts;

import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ShoppersStack.Register.HomePage;
import com.ShoppersStack.Register.LoginPage;
import com.ShoppersStack.Register.MyAddressFormPage;
import com.ShoppersStack.Register.MyAddressPage;
import com.ShoppersStack.Register.MyProfilePage;
import com.ShoppersStack.Register.WelcomePage;
import genericUtility.BaseTest;
import genericUtility.ListenerUtility;

@Listeners(ListenerUtility.class)
public class VerifY_is_User_Is_able_to_add_address_Test extends BaseTest
{
	@Test
	public void addAddress() throws IOException
	{
		//ExtentTest test = null;
	
		homepage.getProfileSetting().click();
		homepage.getMyProfile().click();
		
		MyProfilePage profilePage=new MyProfilePage(driver);
		profilePage.getMyAddress().click();
		
		MyAddressPage addressPage=new MyAddressPage(driver);
		addressPage.getAddAddress().click();
		
		MyAddressFormPage addressFormPage=new MyAddressFormPage(driver);
		addressFormPage.getName().sendKeys(file.readExcelData("Sheet1", 1, 0));
		addressFormPage.getHouseNo().sendKeys(file.readExcelData("Sheet1", 1, 1));
		addressFormPage.getStreetInfo().sendKeys(file.readExcelData("Sheet1",1, 2));
		addressFormPage.getLandmark().sendKeys(file.readExcelData("Sheet1",1, 3));
		
		webdriverutil.SelectByValue(addressFormPage.getCountry(),file.readPropertyData("country"));
		webdriverutil.SelectByValue(addressFormPage.getState(),file.readPropertyData("state"));
		webdriverutil.SelectByValue(addressFormPage.getCity(),file.readPropertyData("city"));
		
		addressFormPage.getPincode().sendKeys(file.readExcelData("sheet1", 1, 4));
		addressFormPage.getPhoneNumber().sendKeys(file.readExcelData("sheet1", 1, 5));
		addressFormPage.getAddAddress().click();   //clicking on add new address button 	
		
		/*test.log(Status.INFO,"Address Added");
		
		home.getMyProfile().click();
		home.getLogout().click();

		test.log(Status.INFO,"Logged out");
		*/
	}
}
