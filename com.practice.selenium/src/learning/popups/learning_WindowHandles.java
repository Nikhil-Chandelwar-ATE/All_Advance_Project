package learning.popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class learning_WindowHandles {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://in.indeed.com/");
		
		//Click on Signin Link
		driver.findElement(By.partialLinkText("Sign in")).click();
		
		String parentWindowID = driver.getWindowHandle();
		System.out.println(parentWindowID);
		driver.findElement(By.id("login-google-button")).click();
		Set<String> childWindowID = driver.getWindowHandles();
		for (String string : childWindowID) {
			System.out.println(string);
			
		}
		
		driver.quit();
		
		

	}

}
