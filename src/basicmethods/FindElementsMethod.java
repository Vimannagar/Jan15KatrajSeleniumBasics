package basicmethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsMethod {
	
	
	public static void main(String[] args) {
		
		
System.setProperty("webdriver.chrome.driver", "E:\\desktop\\Katraj\\15 Jan\\Selenium\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();// chrome browser will get open
		
		driver.manage().window().maximize();// to maximize the window
		
		driver.get("https://www.facebook.com/signup");
		
	List<WebElement> daydropdown = driver.findElements(By.xpath("//select[@id='day']//option"));

	
	
//		for(WebElement value:daydropdown)
//		{
//			String d = value.getText();
//			
//			System.out.println(d);
//			
//			if(d.equals("18"))
//			{
//				value.click();
//			}
//		}
		
		
		int numberofoptions = daydropdown.size();// size method is used to get the total number of webelements that we have located.
		
		
		for(int i=0; i<numberofoptions; i++ )
		{
			String dayvalue = daydropdown.get(i).getText();
			
			System.out.println(dayvalue);
			
		}
		
		
		
	
		
		
	}

}
