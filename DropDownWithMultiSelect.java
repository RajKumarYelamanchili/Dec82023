package seleniumfirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownWithMultiSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Browser\\ChromeDriver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		Thread.sleep(2000);
		
		WebElement dropdown2= driver.findElement(By.xpath("//select[@name='Month']"));
		
		
		if (dropdown2.isDisplayed() && dropdown2.isEnabled())
		{
			System.out.println("Dropdown is enabled and displayed");
		}
		else
		{
			System.out.println("Dropdown is NOT enabled and displayed");
		}
		
		Select sel = new Select(dropdown2);
			
		if (sel.isMultiple())
		{
			System.out.println("DD allows multiple selection");
		}
		else
		{
			System.out.println("DD DOES NOT allows multiple selection");
		}

		sel.selectByIndex(2);//Feb
		Thread.sleep(2000);
		sel.selectByVisibleText("August");
		Thread.sleep(2000);
		sel.selectByValue("Oct");
		Thread.sleep(2000);
		
		if (sel.getAllSelectedOptions().size()==3)
		{
			System.out.println("3 options selected");
		}
		else
		{
			System.out.println("3 options are not selected");
		}

	}

}
