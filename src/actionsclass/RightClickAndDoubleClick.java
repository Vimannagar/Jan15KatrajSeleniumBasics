package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickAndDoubleClick {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\desktop\\Katraj\\15 Jan\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// chrome browser will get open

		driver.manage().window().maximize();// to maximize the window

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");

		WebElement username = driver.findElement(By.xpath("//input[@name='txtUsername']"));

		username.sendKeys("Admin");

		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");

		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		WebElement recruitmentlink = driver.findElement(By.xpath("//*[@id='menu_recruitment_viewRecruitmentModule']"));
		
//		performing rightclick on the recruitment link
		
		Actions act = new Actions(driver);
		
		act.contextClick(recruitmentlink).perform();
		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		
//		Performing double click operation 
		WebElement doubleclickbutton = driver.findElement(By.xpath("//*[@id='double-click']"));
		
		
		act.doubleClick(doubleclickbutton).perform();
		
		driver.switchTo().alert().accept();
		
	}

}
