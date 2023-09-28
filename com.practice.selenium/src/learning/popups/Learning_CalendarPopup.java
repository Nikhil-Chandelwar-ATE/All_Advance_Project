package learning.popups;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Learning_CalendarPopup {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.hyrtutorials.com/");
		
		//Creating object of Actions class
		Actions action = new Actions(driver);
		
		//mouse hover to selenium practice menu link
		action.moveToElement(driver.findElement(By.xpath("//a[text()='Selenium Practice']"))).perform();
		driver.findElement(By.partialLinkText("Calendars Practice")).click();
		
		driver.findElement(By.xpath("//img[@alt='Calendar-icon']")).click();
		
		//WebElement calendarTitle = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
		List<WebElement> dates = driver.findElements(By.xpath("//a[@class='ui-state-default']"));
		
		while (true) {
			if(driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText().equals("August 2023"));
			{
				dates.get(30).click();
			}
		}
	}
}
