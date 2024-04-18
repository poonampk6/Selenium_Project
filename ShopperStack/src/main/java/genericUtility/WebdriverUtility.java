package genericUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class WebdriverUtility 
{
	Select sel;
	File temp;
	File dest;
	
	public void SelectByValue(WebElement element, String value)
	{
		sel=new Select(element);
		sel.selectByValue(value);
	}
	
	public void SelectByIndex(WebElement element, String value)
	{
		sel=new Select(element);
		sel.selectByValue(value);
	}
	
	public void SelectByVisibleText(WebElement element, String value)
	{
		sel=new Select(element);
		sel.selectByValue(value);
	}
	
	public void DeselectByValue(WebElement element, String value)
	{
		sel=new Select(element);
		sel.selectByValue(value);
	}
	
	public void DeselectByIndex(WebElement element, String value)
	{
		sel=new Select(element);
		sel.selectByValue(value);
	}
	
	public void DeselectByVisibleText(WebElement element, String value)
	{
		sel=new Select(element);
		sel.selectByValue(value);
	}
	
	public void DeselectAll(WebElement element, String value)
	{
		sel=new Select(element);
		sel.selectByValue(value);
	}
	
	public void ScreenshotWebPage(WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
	    temp=ts.getScreenshotAs(OutputType.FILE);
		dest=new File("./screenshot");
		FileHandler.copy(temp,dest);
	}
	
	public void ScreenshotWebElement(WebElement element) throws IOException
	{
		temp=element.getScreenshotAs(OutputType.FILE);
		dest=new File("./screenshot");
		FileHandler.copy(temp,dest);
	}

}
