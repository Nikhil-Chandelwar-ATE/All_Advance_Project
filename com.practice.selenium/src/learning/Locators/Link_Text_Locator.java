package learning.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 
 * @author Nikhil Chandelwar
 *
 */

public class Link_Text_Locator {

	/**
	 * 
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-male")).click();
		driver.findElement(By.id("FirstName")).sendKeys("anjdue");
		driver.findElement(By.id("LastName")).sendKeys("msknej");
		driver.findElement(By.id("Email")).sendKeys("anjdue@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("qwerty123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("qwerty123");
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(1000);
		driver.quit();
	}
}
