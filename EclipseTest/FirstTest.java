import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

	public static void main(String[] args) {
		
		
				System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\Drivers\\chromedriver.exe");
				
				     WebDriver driver= new ChromeDriver();	
				     
				     driver.get("https://www.facebook.com/");
					 
					 driver.manage().window().maximize();
					 
					 driver.findElement(By.name("email")).sendKeys("4165466236");
						driver.findElement(By.name("pass")).sendKeys("Hiral@143");
						driver.findElement(By.name("login")).click();
						
			}

		

	}


