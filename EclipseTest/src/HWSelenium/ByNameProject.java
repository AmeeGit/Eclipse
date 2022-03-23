package HWSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByNameProject {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\Drivers\\chromedriver.exe");
		
		     WebDriver driver= new ChromeDriver();	
		     
		     driver.get("https://opensource-demo.orangehrmlive.com/");
			 
			 driver.manage().window().maximize();
			 
			 driver.findElement(By.name("txtUsername")).sendKeys("Admin");
				driver.findElement(By.name("txtPassword")).sendKeys("admin123");
				driver.findElement(By.name("Submit")).click();
				
	}



	}


