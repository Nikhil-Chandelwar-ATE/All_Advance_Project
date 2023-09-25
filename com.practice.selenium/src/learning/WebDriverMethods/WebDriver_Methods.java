package learning.WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_Methods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		//maximize window
		driver.manage().window().maximize();
		
		//get method
		driver.get("https://www.flipkart.com/");
		
		//getTitle method
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println("===================================================");

		//getSource method
		String sourceCode = driver.getPageSource();
		System.out.println(sourceCode);
		System.out.println("===================================================");

		//getCurrentUrl method
		String url = driver.getCurrentUrl();
		System.out.println(url);
		System.out.println("===================================================");
		
		driver.quit();
	}
}
