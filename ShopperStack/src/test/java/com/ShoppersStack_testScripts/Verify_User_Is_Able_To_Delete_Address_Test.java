package com.ShoppersStack_testScripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.ShoppersStack.Register.HomePage;
import com.ShoppersStack.Register.MyAddressPage;
import com.ShoppersStack.Register.MyProfilePage;

import genericUtility.BaseTest;

public class Verify_User_Is_Able_To_Delete_Address_Test extends BaseTest
{
	@Test
	public void addAddress() throws IOException, InterruptedException
	{
		//ExtentTest test = null;
		homepage.getProfileSetting().click();
		homepage.getMyProfile().click();
		
		MyProfilePage profilePage=new MyProfilePage(driver);
		profilePage.getMyAddress().click();
		
		MyAddressPage addressPage=new MyAddressPage(driver);
		addressPage.getDeleteAddress().click();
		Thread.sleep(2000);
		addressPage.getYesBtn().click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
	}
}
