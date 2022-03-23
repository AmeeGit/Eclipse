package HWSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSubString {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		
		  driver.findElement(By.cssSelector("input[name^='ema']")).sendKeys("Amee");
		  driver.findElement(By.cssSelector("input[name*='ass']")).sendKeys("123");
		
		  }
	}


