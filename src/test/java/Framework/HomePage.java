package Framework;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class HomePage extends base 
{
	public WebDriver driver;
	
	
	@Test
	public void initialize() throws IOException
	{
	
		 driver = initializeDriver();
		 driver.get("https://bikroy.com/en");
		 
		 LandingPage lp=new LandingPage(driver);
		 lp.getLoginPage().click();

	}
}
