package Framework;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class validateHomeMap extends base
{
	public WebDriver driver;
	
	
	@Test
	public void initialize() throws IOException
	{
	
		 driver = initializeDriver();
		 driver.get(prop.getProperty("url"));
		 
		 LandingPage lp=new LandingPage(driver);
		 Assert.assertFalse(lp.getHomeMap().isDisplayed());

	}
}