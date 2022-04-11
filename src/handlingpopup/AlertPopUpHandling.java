package handlingpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\desktop\\Katraj\\15 Jan\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();// chrome browser will get open

		driver.manage().window().maximize();// to maximize the window

		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");

		WebElement alertpopup = driver.findElement(By.xpath("//*[@name='alert']"));

		alertpopup.click();

		String textonalert = driver.switchTo().alert().getText();

		System.out.println("Text on alert pop up is: " + textonalert);

//		to handle the pop up we have to call alert() method

		driver.switchTo().alert().accept();

//		confirmation alert pop up:

		driver.findElement(By.xpath("//*[@name='confirmation']")).click();

		Thread.sleep(2000);

		String confirmationstring = driver.switchTo().alert().getText();

		System.out.println(confirmationstring);

		driver.switchTo().alert().dismiss();

	}

}
