package Framework;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import resources.base;

public class validateTitle extends base 
{
	public WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver =initializeDriver();
	}
	
	@Test
	public void basePageNavigation() throws IOException
	{
	
		 driver = initializeDriver();
		 driver.get(prop.getProperty("url"));
		 
		 LandingPage lp=new LandingPage(driver);
		 Assert.assertEquals(lp.getTitle().getText(),"Welcome to Bikroy.com - the largest marketplace in Bangladesh!");

	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}