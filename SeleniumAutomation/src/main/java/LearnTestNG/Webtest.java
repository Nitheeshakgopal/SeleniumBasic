package LearnTestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Webtest {
	
	/*
	 * 1. Anything method annotated with Test would be treated as a test case only.
	 * 2. Execution of method will follow the alphabetical order of method name
	 * 3. We can control the order of execution using priority. Lower priority will execute first(OOE= 0,1,2)
	 * 4. If any of test case  is not having priority defined, alphabetical order will take precedence.
	 * 5. BeforeTest will execute once before all the test cases present inside a class.
	 * 6. AfterTest will execute once after all the test cases present inside a class.
	 * 7. Before method will execute before every method (test case) present inside class
	 * 8. After method will execute after every method(test case) present inside class
	 * 
	 */
	
	// Anything method annotated with Test would be treated as a test case only.
	@Test
	public void firstWebTest() {
		System.out.println("First");
	}
	//We can control the order of execution using priority. Lower priority will execute first(OOE= 0,1,2)
	@Test(priority=1)
    public void secondTest() {
	System.out.println("Second");
    }
	////If any of test case  is not having priority defined, alphabetical order will take precedence
	@Test
    public void priorityTest() {
    	System.out.println("Third");
    }
	//BeforeTest will execute once before all the test cases present inside a class.
	@BeforeTest
    public void beforeTest() {
    	System.out.println("I am Executing BeforeTest Method");
    }
	// AfterTest will execute once after all the test cases present inside a class.
	@AfterTest
    public void afterTest() {
    	System.out.println("I am Executing AfterTest Method");
    }
	//Before method will execute before every method (test case) present inside class
	@BeforeMethod
    public void beforeMethodTest() {
    	System.out.println("I am Executing BeforeMethod Test Method");
    }
	// After method will execute after every method(test case) present inside class
	@AfterMethod
    public void afterMethodTest() {
    	System.out.println("I am Executing AfterMethod Test Method");
    }
    
}
