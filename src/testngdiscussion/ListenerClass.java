package testngdiscussion;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener

{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case started :"+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case passed :"+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case Failed :"+result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case got skipped :"+result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
	System.out.println("Test started :"+context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test completed :"+context.getName());
	}
	
	
	
	
	

}
