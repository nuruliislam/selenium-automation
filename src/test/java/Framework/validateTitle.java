package Framework;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
	public static Logger log =LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver =initializeDriver();
		log.info("Driver is initialized");
	}
	
	@Test
	public void basePageNavigation() throws IOException
	{
	
		 
		 driver.get(prop.getProperty("url"));
		 log.info("navigate to homepage");
		 
		 LandingPage lp=new LandingPage(driver);
		 Assert.assertEquals(lp.getTitle().getText(),"Welcome to Bikroy.com - the largest marketplace in Bangladesh!");
		 log.info("Successfully validated Title ");
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}