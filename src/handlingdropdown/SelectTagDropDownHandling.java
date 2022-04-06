package handlingdropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTagDropDownHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\desktop\\Katraj\\15 Jan\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// chrome browser will get open

		driver.manage().window().maximize();// to maximize the window

		driver.get("https://www.facebook.com/signup");
		
		
		WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
		
		Select sel = new Select(day);
		
		sel.selectByVisibleText("20");
		
		WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
		
		Select selmonth = new Select(month);
		
		selmonth.selectByValue("8");
		
		WebElement year = driver.findElement(By.xpath("//*[@id='year']"));
		
		Select selyear = new Select(year);
		
		selyear.selectByIndex(10);
		
		
		
	}

}
