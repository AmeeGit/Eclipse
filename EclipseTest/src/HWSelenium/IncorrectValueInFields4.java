package HWSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IncorrectValueInFields4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");

		driver.manage().window().maximize();

		driver.findElement(By.className("login")).click();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);

		driver.findElement(By.id("email_create")).sendKeys("test1679@test.com");
		driver.findElement(By.xpath("//button[@name=\"SubmitCreate\"]")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"account-creation_form\"]/div[1]/div[1]/div[2]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"customer_firstname\"]")).sendKeys("15978");

		System.out.println("firstname is invalid");

		driver.findElement(By.xpath("//*[@id=\"customer_lastname\"]")).sendKeys("25864");

		System.out.println("lastname is invalid");

		driver.findElement(By.name("passwd")).sendKeys("PKR@PKR");

		driver.findElement(By.id("address1")).sendKeys("258741");
		driver.findElement(By.id("city")).sendKeys("357");
		driver.findElement(By.id("id_state")).sendKeys("6843");
		System.out.println("This country requires you to choose a State");
		driver.findElement(By.name("postcode")).sendKeys("51838");

		WebElement countrydropDown = driver.findElement(By.name("id_country"));
		Select oSelectC = new Select(countrydropDown);
		oSelectC.selectByVisibleText("United States");
		driver.findElement(By.name("phone_mobile")).sendKeys("5136258967");
		driver.findElement(By.xpath("//*[@id=\"alias\"]")).sendKeys("657");
		driver.findElement(By.id("submitAccount")).click();

	}

}
