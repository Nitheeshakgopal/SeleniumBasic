package Assertions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionAssignment {
	@Test
	public void login() {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		 
		List<WebElement> list=driver.findElements(By.xpath("//*[@class='top-menu']/li"));
		
		 for(WebElement actual:list) {
			String actualTitle=actual.getText();
			System.out.println(actualTitle);
		
			String expectedTitle = "Books,Computers,Electronics,Apparel & Shoes,Digital downloads,Jewelry Gift Cards";
		    Assert.assertEquals(actualTitle, expectedTitle);
		 }
		System.out.println("First assertion is completed");
		
	}
	
	

}
