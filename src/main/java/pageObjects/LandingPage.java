package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage
{
	
	public WebDriver driver;
	By title=By.cssSelector("[class='t-bold']");
	
	By signin=By.linkText("Log in");

	public LandingPage(WebDriver driver) 
	{
		this.driver=driver;
		
	}

	public WebElement getLoginPage()
	{
		 return driver.findElement(signin);
		 
	}
	
	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
}