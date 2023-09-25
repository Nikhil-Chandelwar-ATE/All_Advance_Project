package learning.popups;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Learning_AlertPopup {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		driver.findElement(By.xpath("//div[@class='menuTable']/div[2]")).click();
		driver.findElement(By.partialLinkText("Types of Work")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Create Type of Work')]")).click();
		driver.findElement(By.name("name")).sendKeys("Qspiders");
		
		WebElement dropdown = driver.findElement(By.name("active"));
		Select sel=new Select(dropdown);
		sel.selectByVisibleText("archived");
		
		driver.findElement(By.name("billable")).click();
		
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshots/actitime.png");
		FileHandler.copy(src, dest);
		
		driver.findElement(By.xpath("//input[@onclick='handleCancel();']")).click();
		
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		alert.accept();
		System.out.println(driver.getTitle());
		driver.quit();
		
	}
}
