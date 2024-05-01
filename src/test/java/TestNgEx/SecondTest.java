package TestNgEx;

import org.testng.annotations.Test;

public class SecondTest {
	
	@Test(priority = 4)
	void test() {
		System.out.println("Hi");
	}

}
