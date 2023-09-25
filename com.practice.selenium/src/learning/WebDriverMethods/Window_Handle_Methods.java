package learning.WebDriverMethods;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window_Handle_Methods {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//maximize window
		driver.manage().window().maximize();
		
		//get method
		driver.get("https://www.flipkart.com/");
		
		//getWindowHandle method
		String windowID = driver.getWindowHandle();
		System.out.println(windowID);
		System.out.println("===================================================");
		
		//getWindowHandles method
		Set<String> allWindowID = driver.getWindowHandles();
		for (String id : allWindowID) {
			System.out.println(id);
		}
		driver.quit();
	}
}
