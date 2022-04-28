package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsInTestNG {
	
	@Test
	public void verifyUrl()
	{

		System.setProperty("webdriver.chrome.driver", "E:\\desktop\\Katraj\\15 Jan\\Selenium\\chromedriver.exe");
		
			
		WebDriver driver = new ChromeDriver();// chrome browser will get open
		
		driver.manage().window().maximize();// to maximize the window
		
		driver.get("https://www.facebook.com/");
		
		 String url = driver.getCurrentUrl();
		 
		 String expectedurl = "facebooke";
		 
		boolean ispresent = url.contains(expectedurl);
		
		Assert.assertTrue(ispresent, "Test case is failed please file a bug");
		
	
	}

}
