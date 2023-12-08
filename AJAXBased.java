package seleniumfirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AJAXBased {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Browser\\ChromeDriver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("http://omayo.blogspot.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='dropbtn']")).click();
		Thread.sleep(2000);
	//WebElement facebookOption =	driver.findElement(By.linkText("Facebook"));
		
		WebDriverWait wait = new WebDriverWait(driver,30);
		
		WebElement facebookOption=wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Facebook")));
		
			facebookOption.click();
			Thread.sleep(4000);
		

	}

}
