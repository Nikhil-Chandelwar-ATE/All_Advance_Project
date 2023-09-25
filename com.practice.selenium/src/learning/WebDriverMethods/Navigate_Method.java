package learning.WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate_Method {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//maximize window
		driver.manage().window().maximize();
		
		//get method
		driver.get("https://www.flipkart.com/");
		
		//navigate methods
		//back method
		driver.navigate().back();
		
		//forward method
		driver.navigate().forward();
		
		//refresh method
		driver.navigate().refresh();
		
		//to(url) method
		driver.navigate().to("http://www.amazon.in/");
		driver.quit();
	}
}
