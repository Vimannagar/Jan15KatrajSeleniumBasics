package testngdiscussion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodsKeyword {
	
	
	@Test(priority = 1)
	public void loginTest()
	{
		System.out.println("Login to application");
		
		Assert.fail("test case failing deliberately");
	}

	@Test(dependsOnMethods = "loginTest", priority = 2)
	public void homePage()
	{
		System.out.println("Home page of application");
	}

	
	@Test(dependsOnMethods = {"homePage", "loginTest"}, priority = 3)
	public void logout()
	{
		System.out.println("Logout from application");
	}


}
