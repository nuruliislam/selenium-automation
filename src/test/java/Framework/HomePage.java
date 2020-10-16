package Framework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base 
{
	public WebDriver driver;
	public static Logger log =LogManager.getLogger(base.class.getName());
	
	@BeforeTest
	public void initialize() throws IOException
	{
		driver =initializeDriver();
	}
	
	@Test(dataProvider="getUsers")
	public void basePageNavigation(String email,String pass) throws IOException
	{
	
		 driver.get(prop.getProperty("url"));
		 
		 LandingPage lp=new LandingPage(driver);
		 lp.getLoginPage().click();
		 
		 LoginPage lg=new LoginPage(driver);
		 lg.getEmail().sendKeys(email);
		 lg.getPassword().sendKeys(pass);
		 
		 log.info(email);
		 
		 //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 lg.getLogin().click();
	}
	
	//provide multiple data
	@DataProvider
	public Object[][] getUsers()
	{
		Object[][] data=new Object[1][2];
		//0th row
		data[0][0]="username@gmail.com";
		data[0][1]="password";
		
		//1st row
		//data[1][0]="mdnrl59@gmail.com";
		//data[1][1]="nurul1994";
		
		return data;
	}
	
	@AfterTest
	public void teardown()
	{
		driver.close();
	}
}
