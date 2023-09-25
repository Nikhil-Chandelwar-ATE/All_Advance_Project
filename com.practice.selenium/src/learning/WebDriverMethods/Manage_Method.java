package learning.WebDriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Manage_Method {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		//get method
		driver.get("https://www.flipkart.com/");
		
		// maximize method
		driver.manage().window().maximize();
		
		// minimize method
		driver.manage().window().minimize();

		// full screen method
		driver.manage().window().fullscreen();
		
		// getSize method
		Dimension size = driver.manage().window().getSize();
		System.out.println(size);
		System.out.println("===================================================");

		// getPosition method
		Point position = driver.manage().window().getPosition();
		System.out.println(position);
		System.out.println("===================================================");
		driver.quit();
	}
}
