package learning.javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_Element {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement customGender = driver.findElement(By.xpath("//input[@name='custom_gender']"));
		WebElement customRadioButton = driver.findElement(By.xpath("//label[text()='Custom']"));
		
//		//ElementNotInteractableException
//		customGender.sendKeys("Male");
//		Thread.sleep(2000);
//		customRadioButton.click();
//		Thread.sleep(2000);
		
		js.executeScript("arguments[0].value='male'", customGender);
		Thread.sleep(2000);
		customRadioButton.click();
		Thread.sleep(2000);
		driver.quit();
	}
}
