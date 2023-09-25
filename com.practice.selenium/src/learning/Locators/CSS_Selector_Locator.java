package learning.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector_Locator {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop-global.malaicha.com/login");
		driver.findElement(By.name("username")).sendKeys("qwerty@gmail.com");
		driver.findElement(By.name("pin")).sendKeys("qwerty123");
		
		//when there is no direct locator, then we will go with css selector
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}
}
