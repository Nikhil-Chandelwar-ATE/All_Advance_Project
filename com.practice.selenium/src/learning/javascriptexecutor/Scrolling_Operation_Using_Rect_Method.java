package learning.javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling_Operation_Using_Rect_Method {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoapp.skillrary.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//traditional way
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,300)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		
		//using getLocation method of WebElement
		WebElement subscribeButton = driver.findElement(By.xpath("//button[text()='Subscribe']"));
		Point loc = subscribeButton.getLocation();
		int x = loc.getX();
		int y = loc.getY();
		System.out.println(x+", "+y);
		js.executeScript("window.scrollBy(0,"+y+");");
		Thread.sleep(2000);
		
		//using getRect method of WebElement
		WebElement submitButton = driver.findElement(By.xpath("//input[@type='Submit']"));
		Rectangle rect = submitButton.getRect();
		int x2 = rect.getX();
		int y2 = rect.getY();
		System.out.println(x2+", "+y2);
		js.executeScript("window.scrollTo(0,"+y2+");");
		Thread.sleep(2000);
		driver.quit();
	}
}
