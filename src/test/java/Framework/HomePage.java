package Framework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
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
		 
		 LoginPage lg=new LoginPage(driver);
		 lg.getEmail().sendKeys("your email");
		 lg.getPassword().sendKeys("your password");
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 lg.getLogin().click();

	}
}
