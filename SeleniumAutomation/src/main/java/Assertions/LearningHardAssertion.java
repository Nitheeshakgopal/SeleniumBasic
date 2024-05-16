package Assertions;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LearningHardAssertion {
	
	/**
	 * Whenever there's a failure ,
	 * program will stop and will not go forward. This is called hard assertion failure
	 */
	@Test
	public void laernAssertion() {
		String actualName="Welcome to our store";
		String expectedNmae="Welcome to our store";
		Assert.assertEquals(actualName, expectedNmae);
		System.out.println("First assertion is completed");
		
		int actualQuantity = 7;
		int expectedQuantity=7;
		Assert.assertEquals(actualQuantity, expectedQuantity);
		System.out.println("Sedond Assertion is completed");
		Assert.assertTrue(true);
		Assert.assertFalse(false);
		
	}
	

}
