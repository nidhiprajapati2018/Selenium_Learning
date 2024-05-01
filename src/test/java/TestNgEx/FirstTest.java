package TestNgEx;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTest {
	
	

	
	 WebDriver driver;
	
	@Test(priority = 1)
	void openApp() {
		
		 WebDriverManager.chromedriver().setup();  
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 
		
	}
	
	@Test(priority = 2)
	void login() {
		
		driver.findElement(By.xpath("//*[@placeholder = 'Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type= 'submit']")).click();
		
	}
	
	@Test (priority = 3)
	void close() {
		driver.close();
		
	}

}
