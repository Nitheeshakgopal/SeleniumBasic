package PracticeSelenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngPractice {
	@Test
	public void  firstMobileTesting() {
		System.out.println("i am in the First MobileTesting");
	}
	@BeforeClass
	public void  beforeClassWebTest() {
		System.out.println("i am in the BeforeClass");
	}
	@AfterClass
	public void  afterClassWebTest() {
		System.out.println("i am in the AfterClass");
	}
	
	@BeforeTest
	public void  beforeTestMethod() {
		System.out.println("i am in the Before Test");
	}
	@AfterTest
	public void  afterTestMethod() {
		System.out.println("i am in the After Test");
	}
	
	

}
