package basicmethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodSupport2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\desktop\\Katraj\\15 Jan\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// chrome browser will get open

		driver.manage().window().maximize();// to maximize the window

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		
		WebElement element = driver.findElement(By.xpath("//*[@name='actionID']"));
		
		boolean isvisible = element.isDisplayed();
		
		System.out.println("Method is returning "+isvisible);

		WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));

		username.sendKeys("Admin");
		
		username.clear();

		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");

		driver.findElement(By.xpath("//input[@type='submit']")).click();

		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();

		WebElement checkbox = driver.findElement(By.xpath("(//*[contains(@id,'ohrmList_chkSelectRecord_')])[2]"));

//		to check the webelement is enabled 
		boolean isenabletoperformaction = checkbox.isEnabled();
		System.out.println(isenabletoperformaction);
//to check the webelement is selected or not
		boolean ischecked = checkbox.isSelected();

		System.out.println(ischecked);

		boolean isvisiblee = checkbox.isDisplayed();

		System.out.println(isvisiblee);
		
		

	}

}
