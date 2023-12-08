package seleniumfirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Browser\\ChromeDriver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://www.google.com");
		Thread.sleep(2000);
	//	driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Selenium");
	//	driver.findElement(By.xpath("//textarea[@id='APjFqb']")).sendKeys("Selenium");
	//	driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Selenium");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(2000);
	//	driver.findElement(By.id("APjFqb")).sendKeys("Selenium");
		driver.findElement(By.name("btnK")).submit();
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com");
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("Raj@abc.com");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		
		
		
		

	}

}
