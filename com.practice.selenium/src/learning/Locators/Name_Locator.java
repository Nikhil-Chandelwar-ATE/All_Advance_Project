package learning.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Name_Locator {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("njshun@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("qwerty123");
		driver.findElement(By.name("login")).click();
		Thread.sleep(2000);
		driver.quit(); 
	}
}
