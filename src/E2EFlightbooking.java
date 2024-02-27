
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class E2EFlightbooking {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("Webdriver.chrome.driver", "Users/HP/OneDrive/Documents/Eclipse - Chrome driver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(5000);
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

		for(WebElement option:options)		
		{
			if(option.getText().equalsIgnoreCase("India"))
			{
				option.click();
			} 
		}  

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click();
		driver.findElement(By.cssSelector("a[value='MAA']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		driver.findElement(By.id("divpaxinfo")).click();
//		driver.findElement(By.id("hrefIncAdt")).click();
		Thread.sleep(2000);
		
		for(int i=1; i<6; i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
			
		driver.findElement(By.xpath("//input[@value='Done']")).click();
		WebElement CurrencyDropdown= driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select currency = new Select(CurrencyDropdown);
		currency.selectByIndex(1);
		System.out.println(currency.getFirstSelectedOption().getText());
		currency.selectByValue("USD");
		System.out.println(currency.getFirstSelectedOption().getText());
		currency.selectByVisibleText("AED");
		System.out.println(currency.getFirstSelectedOption().getText());
		driver.findElement(By.xpath("//span[@class='btn-find-flight-home']/input[@type='submit']")).click();
	Thread.sleep(3000);
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		driver.findElement(By.id("ctl00_mainContent_view_date2"));
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			Assert.assertFalse(false);
			System.out.println("It is Disabled");
		}
		else
		{
			Assert.assertTrue(true);
			System.out.println("It is Enabled");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
