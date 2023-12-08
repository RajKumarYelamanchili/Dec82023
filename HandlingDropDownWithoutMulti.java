package seleniumfirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownWithoutMulti {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Browser\\ChromeDriver1\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.get("https://selenium08.blogspot.com/2019/11/dropdown.html");
		Thread.sleep(2000);
		
		WebElement dropdown1= driver.findElement(By.xpath("//select[@name='country']"));
		
		if (dropdown1.isDisplayed() && dropdown1.isEnabled())
		{
			System.out.println("Dropdown is enabled and displayed");
		}
		else
		{
			System.out.println("Dropdown is NOT enabled and displayed");
		}
		
		Select sel = new Select(dropdown1);
		if (sel.isMultiple())
		{
			System.out.println("DD allows multiple selection");
		}
		else
		{
			System.out.println("DD DOES NOT allows multiple selection");
		}

		int lstSize = sel.getOptions().size();
		System.out.println("Number of countries in the country dropdown: " + lstSize);
		Thread.sleep(2000);
		
		sel.selectByIndex(3);
		String txt1 =sel.getFirstSelectedOption().getText();
		System.out.println("Option chosen: " + txt1);
		Thread.sleep(2000);
		sel.selectByVisibleText("India");
		String txt2 =sel.getFirstSelectedOption().getText();
		System.out.println("Option chosen: " + txt2);
		Thread.sleep(2000);
		
		sel.selectByValue("NL");
		String txt3 =sel.getFirstSelectedOption().getText();
		System.out.println("Option chosen: " + txt3);
		Thread.sleep(2000);
	}

}
