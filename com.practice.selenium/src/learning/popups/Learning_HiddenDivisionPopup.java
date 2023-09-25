package learning.popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learning_HiddenDivisionPopup {

	public static void main(String[] args) throws InterruptedException {

		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.actitime.com/");
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.xpath("//div[text()='Tasks']")).click();
		driver.findElement(By.xpath("(//div[@class='checkbox inactive'])[2]")).click();
		driver.findElement(By.xpath("(//div[text()='Delete'])[1]")).click();
		Thread.sleep(2000);
		String text = driver.findElement(By.xpath("(//div[text()='You are about to delete a task'])")).getText();
		System.out.println(text);
		driver.quit();
	}

}
