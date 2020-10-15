package Framework;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class HomePage extends base 
{
	public WebDriver driver;
	
	
	@Test
	public void initialize() throws IOException
	{
	
		 driver = initializeDriver();
		 driver.get("https://bikroy.com/en");

	}
}
