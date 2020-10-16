package Framework;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import resources.base;

public class Listeners extends base implements ITestListener 
{
	public static Logger log =LogManager.getLogger(base.class.getName());

	@Override
	public void onTestStart(ITestResult result) {
		log.info("Test Started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
		
		log.info("Test Succeded");
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		log.info("Test Failed");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}


}

