package HWSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSTagAndID {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.manage().window().maximize();

		
		  driver.findElement(By.cssSelector("input#txtUsername")).sendKeys("Admin");
		  driver.findElement(By.cssSelector("input#txtPassword")).sendKeys("admin123");
		  driver.findElement(By.cssSelector("input#btnLogin")).click();
		  }

}
