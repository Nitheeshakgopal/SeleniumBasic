package LearnTestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersLearning {
	@Test
	@Parameters({"name","address"})
	//If we dont want the string value while running, we can add@optional method, then we get null result instead of failure////
	public void firstWebTest(String name, String address) {
		System.out.println("name is "+name+"address is "+address);
	}
	
	@Test(priority=1)
    public void secondTest() {
	System.out.println("Second");
    }
	
    public void priorityTest() {
    	System.out.println("Third");
    }
	
	@BeforeTest
    public void beforeTest() {
    	System.out.println("I am Executing BeforeTest Method");
    }
	@AfterTest
    public void afterTest() {
    	System.out.println("I am Executing AfterTest Method");
    }
	@BeforeMethod
    public void beforeMethodTest() {
    	System.out.println("I am Executing BeforeMethod Test Method");
    }
	
	@AfterMethod
    public void afterMethodTest() {
    	System.out.println("I am Executing AfterMethod Test Method");
    }

}
