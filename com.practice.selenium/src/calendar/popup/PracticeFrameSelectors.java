package calendar.popup;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeFrameSelectors {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");

		WebElement frame2 = driver.findElement(By.id("frm2"));
		driver.switchTo().frame(frame2);
		WebElement MenuSelect = driver.findElement(By.id("selectnav1"));
		Select ms = new Select(MenuSelect);
		//ms.selectByVisibleText("-- Selenium");

		List<WebElement> menuOptions = ms.getOptions();
		for (WebElement menu : menuOptions) {
			
			ms = new Select(MenuSelect);
			System.out.println(menu.getText());
		}
		System.out.println("------------------------------------------------------------------");

		driver.switchTo().defaultContent();
		driver.findElement(By.id("name")).sendKeys("Divya");

		WebElement Frame1 = driver.findElement(By.id("frm1"));
		driver.switchTo().frame(Frame1);
		WebElement courseSelect = driver.findElement(By.id("course"));
		Select cS = new Select(courseSelect);
		cS.selectByValue("java");

		WebElement ideSelect = driver.findElement(By.id("ide"));
		Select iS = new Select(ideSelect);
		iS.selectByIndex(2);
		iS.selectByValue("ec");
		iS.selectByVisibleText("IntelliJ IDEA");
		System.out.println(iS.isMultiple());

		System.out.println("------------------------------------------------------------------");

		List<WebElement> ideOptions = iS.getAllSelectedOptions();
		for (WebElement ides : ideOptions) {
			System.out.println(ides.getText());
		}
	}

}