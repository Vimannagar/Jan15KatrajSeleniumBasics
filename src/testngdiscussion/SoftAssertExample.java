package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {
	
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
		
		SoftAssert sa = new SoftAssert();
				
		sa.assertTrue(ispresent, "Test case is failed please file a bug");
		
		System.out.println("After assertion statement 1");
		
		
		System.out.println("After assertion statement 2");
		
		sa.assertAll();
		
	
	}

}
