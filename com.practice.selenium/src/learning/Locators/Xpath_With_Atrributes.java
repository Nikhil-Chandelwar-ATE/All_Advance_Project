package learning.Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_With_Atrributes {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://shop-global.malaicha.com/");
		driver.findElement(By.xpath("//button[@id='my-acc-btn']")).click();
		Thread.sleep(2000);
		
		//best example of xpath with attribute
		driver.findElement(By.xpath("//a[@href='/registration']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Nikhil");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Chandelwar");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("qwerty@gmail.com");
		
		//country code dropdown
		driver.findElement(By.xpath("//div[@class='option']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search..']")).sendKeys("india");
		driver.findElement(By.xpath("//p[text()='India']")).click();
		driver.findElement(By.xpath("//input[@name='mobileNumber']")).sendKeys("9032654896");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("qwerty123");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("qwerty123");
		driver.findElement(By.xpath("//input[@name='tncAccepted']")).click();
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.quit();
	}
}
