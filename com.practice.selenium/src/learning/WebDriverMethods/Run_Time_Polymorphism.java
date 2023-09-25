package learning.WebDriverMethods;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Run_Time_Polymorphism {

	public static void main(String[] args) {
		WebDriver driver;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("In which browser you want to run your script");
		System.out.println("Press 1 for Chrome");
		System.out.println("Press 2 for Firefox");
		System.out.println("Press 3 for MS Edge");
		int num = sc.nextInt();
		
		if (num == 1) {
			driver = new ChromeDriver();
		} else if (num == 2) {
			driver = new FirefoxDriver();
		} else if (num == 3) {
			driver = new EdgeDriver();
		} else {
			System.out.println("It is running Chrome Browser");
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.myntra.com");

		driver.quit();
	}
}
