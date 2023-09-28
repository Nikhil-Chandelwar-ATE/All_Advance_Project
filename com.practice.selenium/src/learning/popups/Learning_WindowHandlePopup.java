package learning.popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Learning_WindowHandlePopup {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.hyrtutorials.com/");
		
		//Creating object of Actions class
		Actions action = new Actions(driver);
		
		//mouse hover to selenium practice menu link
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Selenium Practice']"))).perform();
		
		//Click on Window Handles link
		driver.findElement(By.xpath("//a[text()='Window Handles']")).click();
//		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='aswift_5']")));
//		driver.findElement(By.xpath("//div[@id='dismiss-button']")).click();
//		driver.switchTo().defaultContent();
		
		//Click on Open Multiple Windows button
		driver.findElement(By.xpath("//button[@id='newWindowsBtn']")).click();
		
		//Fetch the window ID's
		String parentWindowID = driver.getWindowHandle();
		Set<String> allWindowID = driver.getWindowHandles();
		
		//Remove parentWindowID from allWindowID
		allWindowID.remove(parentWindowID);
		
		//Switch the control and fetch the title
		for (String string : allWindowID) {
			
			driver.switchTo().window(string);
			System.out.println("Title : "+driver.getTitle());
			driver.close();
		}
		driver.quit();
	}

}
