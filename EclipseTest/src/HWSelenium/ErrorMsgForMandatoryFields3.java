package HWSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class ErrorMsgForMandatoryFields3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		driver.get("http://automationpractice.com/index.php");

		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")).click();

		driver.findElement(By.id("email_create")).sendKeys("test1679@test.com");
		driver.findElement(By.xpath("//button[@name=\"SubmitCreate\"]")).click();

		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

		Thread.sleep(2000);

		driver.findElement(By.id("submitAccount")).click();

		System.out.println("There are 8 errors");

	}
}
