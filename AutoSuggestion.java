package seleniumfirst;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Browser\\ChromeDriver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("selenium");
		Thread.sleep(2000);
		
		
	List<WebElement>	lstOfElement =driver.findElements(By.xpath("//ul/li[@class='sbct']"));
	
	for(WebElement ele : lstOfElement)
	{
		
		if (ele.getText().trim().equalsIgnoreCase("selenium webdriver"))
		{
			ele.click();
			break;
		}
		
	}
		
 Thread.sleep(4000);
	}

}
