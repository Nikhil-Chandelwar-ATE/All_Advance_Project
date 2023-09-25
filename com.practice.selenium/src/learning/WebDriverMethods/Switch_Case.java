package learning.WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Switch_Case {
	static WebDriver driver = null;
	public static void main(String[] args) {
		
		char value = 'a';
		switch (value) {
		case 'a': {
			driver = new ChromeDriver();
			driver.get("http://www.amazon.in/");
		}
		case 'b':{
			driver = new FirefoxDriver();
			driver.get("http://www.amazon.in/");
			}
		}
	}
}
