import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Formassignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "Users/HP/OneDrive/Documents/Eclipse - Chrome driver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		Thread.sleep(1000);
		driver.findElement(By.name("name")).sendKeys("Revathi");
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("revathinetlink@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("testpassword");
		driver.findElement(By.id("exampleCheck1")).click();
//		driver.findElement(By.xpath("//*[text()='Female']")).click();
		WebElement Gendersel = driver.findElement(By.id("exampleFormControlSelect1"));
		Select Gender = new Select(Gendersel);
		Gender.selectByVisibleText("Female");
		driver.findElement(By.id("inlineRadio2")).click();
		driver.findElement(By.cssSelector("input[type='date']")).click();
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());

	}

}
