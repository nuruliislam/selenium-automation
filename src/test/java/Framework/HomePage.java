package Framework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class HomePage extends base 
{
	public WebDriver driver;
	
	
	@Test(dataProvider="getUsers")
	public void initialize(String email,String pass) throws IOException
	{
	
		 driver = initializeDriver();
		 driver.get("https://bikroy.com/en");
		 
		 LandingPage lp=new LandingPage(driver);
		 lp.getLoginPage().click();
		 
		 LoginPage lg=new LoginPage(driver);
		 lg.getEmail().sendKeys(email);
		 lg.getPassword().sendKeys(pass);
		 
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 lg.getLogin().click();
	}
	
	//provide multiple data
	@DataProvider
	public Object[][] getUsers()
	{
		
		Object[][] data=new Object[2][2];
		//0th row
		data[0][0]="1st user email";
		data[0][1]="1st user password";
		
		//1st row
		data[1][0]="2nd user email";
		data[1][1]="2nd user password";
		
		return data;
	}
}
