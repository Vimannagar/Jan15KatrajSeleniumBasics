package windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwoWindowHandling {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\desktop\\Katraj\\15 Jan\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// chrome browser will get open

		driver.manage().window().maximize();// to maximize the window

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");

		String parentid = driver.getWindowHandle();
		
		System.out.println("Parent id is :"+parentid);
		
		
		WebElement link = driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']"));
		
		
		link.click();
		
		Set<String> allwinid = driver.getWindowHandles();
		
		
		
		for(String id:allwinid)
		{
			if(!(id.equals(parentid)))
			{
				driver.switchTo().window(id);
				driver.get("https://www.google.com");
				driver.quit();//close all the window i.e parent and child
			}
//			System.out.println(id);
			
			
			
			
		}
		
	
		
		
		
	}
	

}
