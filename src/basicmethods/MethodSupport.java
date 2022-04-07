package basicmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodSupport {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\desktop\\Katraj\\15 Jan\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// chrome browser will get open

		driver.manage().window().maximize();// to maximize the window

		driver.get("https://www.instagram.com/");
		
		Thread.sleep(3000);
		
		WebElement username = driver.findElement(By.xpath("//*[@name='username']"));
		
		username.sendKeys("abc@abc.com");
		
		// to verify that the typed string is the same or not:
		
		String actual = username.getAttribute("value");
		
		System.out.println(actual);
		
		if(actual.equals("abc@abc.com"))
		{
			System.out.println("value got verified");
		}
		else
		{
			System.out.println("not matched");
		}
		
//		username.clear();
		
//		to get the url of the current page
		String urlofpage = driver.getCurrentUrl();
		
		System.out.println(urlofpage);
		
//		to get the title of the page
		
		String titleofpage = driver.getTitle();
		
		System.out.println(titleofpage);
		
		
	
	}
	
	

}
