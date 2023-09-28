package learning.SearchContext;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningFindElements {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.findElement(By.name("q")).sendKeys("Java");
		Thread.sleep(1000);
		
		List<WebElement> allsuggesion = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		
		for (int i = 0; i < allsuggesion.size(); i++) {
			
			String text = allsuggesion.get(i).getText();
			System.out.println(text);
		}
		
	}

}
