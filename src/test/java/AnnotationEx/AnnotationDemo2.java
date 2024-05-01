package AnnotationEx;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationDemo2 {
	
	
	@BeforeMethod
	void login( ){
		System.out.println(" Login...");
	}

	
	
	@Test(priority=1)
	void Search() {
		
		System.out.println(" Search...");
		
	}
	
	@Test()
	void AdvanceSearch() {
		
		System.out.println(" AdvanceSearch...");
		
	}
	
	
	@AfterMethod
	void Logout() {
		
		System.out.println(" Logout...");
		
	}
	
	
	
	

}
