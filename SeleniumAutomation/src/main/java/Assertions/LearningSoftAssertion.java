package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LearningSoftAssertion {
	
	/**
	 * soft Assert is used when we do not want to stop 
	 * execution of test case on assertion failures
	 * 
	 * But we can throw all assertion failures at last.
	 * 
	 */
	
	@Test
	public void assertionLearning() {
		//making object for softAssertion class
		SoftAssert soft=new SoftAssert();
		String actual="Welcome to our shop";
		String expected="Welcome to our store";
		soft.assertEquals(actual, expected);
		System.out.println("first Assertion completed");
		soft.assertTrue(true);
		System.out.println("Second Assertion Completed");
		
		////In order to throw assertion failure we use this
		soft.assertAll();
	}

}
