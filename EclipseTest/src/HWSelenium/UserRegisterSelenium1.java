package HWSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

/*1.Open this url  http://automationpractice.com/index.php
2. Click on sign in link.
3. Enter your email address in 'Create and account' section.
4. Click on Create an Account button.
5. Enter your Personal Information, Address and Contact info.
6. Click on Register button.
7. Validate that user is created.
*/
public class UserRegisterSelenium1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");

		driver.manage().window().maximize();

		driver.findElement(By.className("login")).click();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);

		driver.findElement(By.id("email_create")).sendKeys("test1639@test.com");
		driver.findElement(By.xpath("//button[@name=\"SubmitCreate\"]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"account-creation_form\"]/div[1]/div[1]/div[2]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]")).sendKeys("Test User");
		driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]")).sendKeys("Vsoft");
		driver.findElement(By.name("passwd")).sendKeys("PKR@PKR");

		driver.findElement(By.xpath("//*[@id=\"days\"]")).sendKeys("8");
		driver.findElement(By.name("months")).sendKeys("May");
		driver.findElement(By.id("years")).sendKeys("2007");

		driver.findElement(By.xpath("//*[@id=\"account-creation_form\"]/div[1]/div[7]/label")).click();

		driver.findElement(By.name("firstname")).sendKeys("Test User");
		driver.findElement(By.id("lastname")).sendKeys("Vsoft");
		driver.findElement(By.name("company")).sendKeys("SoftTech");
		driver.findElement(By.id("address1")).sendKeys("Test 81/1,2nd cross");
		driver.findElement(By.id("city")).sendKeys("XYZ");
		driver.findElement(By.id("id_state")).sendKeys("Florida");
		driver.findElement(By.name("postcode")).sendKeys("51838");

		WebElement countrydropDown = driver.findElement(By.name("id_country"));
		Select oSelectC = new Select(countrydropDown);
		oSelectC.selectByVisibleText("United States");
		driver.findElement(By.name("phone_mobile")).sendKeys("5136258967");
		driver.findElement(By.xpath("//*[@id=\"alias\"]")).sendKeys("Home");
		driver.findElement(By.id("submitAccount")).click();

	}

}
