package testngdiscussion;

import org.testng.annotations.Test;

public class ParallelTestClass1 {
	
	
	@Test
	public void login()
	{
		System.out.println("Login to application");
	}
	
	@Test
	public void dashBoard()
	{
		System.out.println("DashBoard Test case");
	}
}
