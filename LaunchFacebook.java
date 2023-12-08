package seleniumfirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchFacebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Browser\\ChromeDriver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		//id name classname tagname linktext partial-linktext xpath cssSelector
		//driver.findElement(By.id("email")).sendKeys("rajkumar");//id
		//driver.findElement(By.name("email")).sendKeys("yrk@abc.com");//name
		
	//	driver.findElement(By.xpath("//input[@name='email']")).sendKeys("RohitSharma");//xpath
	//	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("MohammedShami");//xpath
		
		//driver.findElement(By.linkText("Create a Page")).click();//linkText
		driver.findElement(By.partialLinkText("reate a Pag")).click();//partial linkText
	
		
		
	}

}
