package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage
{
	
	public WebDriver driver;
	
	By signin=By.linkText("Log in");
	By title=By.cssSelector("[class='t-bold']");
	By catagorys=By.cssSelector("[class='home-map']");

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
	
	public WebElement getHomeMap()
	{
		return driver.findElement(catagorys);
	}
}