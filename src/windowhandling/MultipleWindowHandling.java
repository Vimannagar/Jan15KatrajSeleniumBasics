package windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {

	
public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "E:\\desktop\\Katraj\\15 Jan\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// chrome browser will get open

		driver.manage().window().maximize();// to maximize the window

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");

		String parentid = driver.getWindowHandle();
		
		System.out.println("Parent id is :"+parentid);
		
		
		WebElement link = driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']"));
		
		
		link.click();
		link.click();
		link.click();
		
		Set<String> allwinid = driver.getWindowHandles();
		
		int numberofid = allwinid.size();
		
		int i =0;
		String [] winid = new String[numberofid];
		
		for(String id:allwinid)
		{
			winid[i]=id;
			i++;
		}
		
		
		driver.switchTo().window(winid[2]);
		
		driver.get("https://www.google.com");
		
		
		
		
		
}
}
