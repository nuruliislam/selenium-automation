package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class base 
{
	public  WebDriver driver;
	public Properties prop;
	
	public WebDriver initializeDriver() throws IOException
	{
		
		prop= new Properties();
		FileInputStream fis=new FileInputStream("C:\\work\\Java-selenium\\selenium-automation\\src\\main\\java\\resources\\data.properties");
	
		prop.load(fis);
		String browserName=prop.getProperty("browserName");
	
		if(browserName.equals("chrome"))
		{
			//Execution code for Chrome Browser
			System.setProperty("webdriver.chrome.driver", "C:\\work\\chromedriver.exe");
			driver= new ChromeDriver();
			
		}
		else if (browserName.equals("firefox"))
		{
			//Execution code for Firefox Browser
			System.setProperty("webdriver.gecko.driver", "C:\\work\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		else if (browserName.equals("edge"))
		{
			//Execution code for Microsoft Edge Browser
			System.setProperty("webdriver.edge.driver", "C:\\work\\msedgedriver.exe");
			driver=new EdgeDriver();
		}
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	

	public String getScreenShotPath(String testCaseName,WebDriver driver) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source =ts.getScreenshotAs(OutputType.FILE);
		String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		FileUtils.copyFile(source,new File(destinationFile));
		return destinationFile;
	}
	
}