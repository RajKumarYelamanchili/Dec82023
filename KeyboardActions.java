package seleniumfirst;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Browser\\ChromeDriver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.google.com");
		Thread.sleep(2000);
	WebElement searchbox=	driver.findElement(By.name("q"));
	
	Actions act = new Actions(driver);
	act.moveToElement(searchbox)
	.keyDown(searchbox, Keys.SHIFT)
	.sendKeys(searchbox,"selenium")
	.keyUp(searchbox,Keys.SHIFT)
	.sendKeys(searchbox, Keys.ENTER)
	.perform();
		

	}

}
