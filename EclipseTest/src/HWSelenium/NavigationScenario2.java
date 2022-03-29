package HWSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*1. Open this url  http://automationpractice.com/index.php
2. Click on sign in link.
3. Enter invalid email address in the email box and click enter.
4. Validate that an error message is displaying saying "Invalid email address."*/

public class NavigationScenario2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();

		// Valid emailId
		/*
		 * driver.findElement(By.name("email")).sendKeys("test1639@test.com");
		 * driver.findElement(By.name("passwd")).sendKeys("PKR@PKR");
		 * driver.findElement(By.id("SubmitLogin")).click();
		 */
		System.out.println("Login Successful");

		// Invalid emailId

		driver.findElement(By.name("email")).sendKeys("test169@test.com");
		driver.findElement(By.name("passwd")).sendKeys("PKR@PKR");
		driver.findElement(By.id("SubmitLogin")).click();

		System.out.println("Authentication failed");

	}

}
