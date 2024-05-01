package webelement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//name
        driver.findElement(By.name("search")).sendKeys("Mac");
        
        //id
        boolean islogoDisplay= driver.findElement(By.id("logo")).isDisplayed();
        System.out.println(islogoDisplay);
        
        //Linktag
        
        //driver.findElement(By.linkText("Components")).click();
        driver.findElement(By.partialLinkText("Comp")).click();
        
        //class attribute
         List<WebElement> headerLinks = driver.findElements(By.className("list-inline-item"));
         System.out.println("Total no. of header"+ headerLinks.size());
         
         //tagName
         List<WebElement> links = driver.findElements(By.tagName("a"));
         System.out.println("Total number of link"+ links.size());
         
         
         
         List<WebElement> image = driver.findElements(By.tagName("img"));
         System.out.println("Total number of images"+ links.size());
         

	}

}
