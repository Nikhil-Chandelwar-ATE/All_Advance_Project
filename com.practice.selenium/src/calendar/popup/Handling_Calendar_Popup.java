package calendar.popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Calendar_Popup {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		driver.findElement(By.id("datepicker")).click();

		while (true) {
			WebElement header = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
			if (!(header.getText().contains("February 2020"))) {
				driver.findElement(By.xpath("//a[@title='Prev']")).click();
			}
			else {
				driver.findElement(By.xpath("//a[@data-date='22']")).click();
				break;
			}
		}
		driver.quit();
	}
}
