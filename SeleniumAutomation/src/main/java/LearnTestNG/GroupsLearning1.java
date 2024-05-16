package LearnTestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class GroupsLearning1 {
	
	@Test(groups="Regression")
	public void  secondMobileTesting() {
		System.out.println("i am in the Second Regression Testing");
	}
	@BeforeClass
	public void  beforeClassWebTest() {
		System.out.println("i am in the BeforeClass");
	}
	@AfterClass
	public void  afterClassWebTest() {
		System.out.println("i am in the AfterClass");
	}
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("Execute once before entire suite");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("Execute once after entire suite");
	}

}
