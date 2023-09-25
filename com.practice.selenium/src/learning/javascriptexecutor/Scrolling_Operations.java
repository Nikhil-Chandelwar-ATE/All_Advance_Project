package learning.javascriptexecutor;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_Operations {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		//ScrollBy
		js.executeScript("window.scrollBy(0,100);");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,200);");
		Thread.sleep(2000);
		
		//ScrollTo
		js.executeScript("window.scrollTo(0,100);");
		Thread.sleep(2000);
		js.executeScript("window.scrollTo(0,200);");
		
		//ScrollIntoView
		WebElement submitButton = driver.findElement(By.xpath("//input[@type='Submit']"));
		js.executeScript("arguments[0].scrollIntoView(true)", submitButton);
		Thread.sleep(2000);
		js.executeScript("arguments[0].scrollIntoView(false)", submitButton);
		Thread.sleep(2000);
		
		driver.quit();
	}
}
