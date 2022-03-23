package HWSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByClassProject {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\Drivers\\chromedriver.exe");
		
		     WebDriver driver= new ChromeDriver();	
		     
		     driver.get("https://opensource-demo.orangehrmlive.com/");
			 
			 driver.manage().window().maximize();
			 
			    driver.findElement(By.id("txtUsername")).sendKeys("Admin");
				driver.findElement(By.id("txtPassword")).sendKeys("admin123");
				driver.findElement(By.id("btnLogin")).click();
				
				
				driver.findElement(By.linkText("My Info")).click();
				
				driver.findElement(By.id("btnSave")).click();
				
				
				driver.findElement(By.name("personal[txtEmpFirstName]")).clear();
				driver.findElement(By.name("personal[txtEmpFirstName]")).sendKeys("ABCDEFGHI");
				driver.findElement(By.name("personal[txtEmpLastName]")).clear();
				driver.findElement(By.name("personal[txtEmpLastName]")).sendKeys("hdcxjcnk");
				driver.findElement(By.id("btnSave")).click();
				System.out.println("Test Passed");
				
	}

}


