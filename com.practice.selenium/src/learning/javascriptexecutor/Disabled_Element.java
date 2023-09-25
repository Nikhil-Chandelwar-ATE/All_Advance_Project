package learning.javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disabled_Element {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		WebElement subscribeTextField = driver.findElement(By.xpath("//input[@class='form-control']"));
		js.executeScript("arguments[0].value='Nikhil';", subscribeTextField);
		Thread.sleep(2000);
		
		WebElement subscribeButton = driver.findElement(By.xpath("(//button[@type='button'])[2]"));
		js.executeScript("arguments[0].click;", subscribeButton);
		Thread.sleep(2000);
		driver.quit();
	}
}
