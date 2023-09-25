package learning.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class_Name_Locator {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.className("ico-login")).click();
		driver.findElement(By.className("email")).sendKeys("chandelwar6@gmail.com");
		driver.findElement(By.className("password")).sendKeys("Nikhil@123");
		driver.findElement(By.className("login-button")).click();
		Thread.sleep(1000);
		//driver.quit();
	}
}
