package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDemo {

	public static void main(String[] args) {
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//Xpath with single attribute
		
		//driver.findElement(By.xpath("//input[@placeholder= 'Search']")).sendKeys("T-shirt");
		
		//Xpath with multiple attributes
		
		//driver.findElement(By.xpath("//input[@placeholder= 'Search'][@name= 'search']")).sendKeys("T-shirt");
		
		//Xpath with 'and' 'or' operator
		
		driver.findElement(By.xpath("//input[@placeholder= 'Search' and @name= 'search']")).sendKeys("T-shirt");
		
		//driver.findElement(By.xpath("//input[@placeholder= 'Search' or @name= 'search']")).sendKeys("T-shirt");

		//xpath with inner text
		
		driver.findElement(By.xpath("//*[text()= 'Desktops']")).click();
		
		boolean displaystatus  =  driver.findElement(By.xpath("//*[text()= 'Featured']")).isDisplayed();
		
		
		
		
		
	}

}
