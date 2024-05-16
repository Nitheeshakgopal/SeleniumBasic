package Assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Newone {
	@Test
	public void login() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
	    String Actual=(driver.findElement(By.xpath("//*[@class='top-menu']")).getText());
	    String expected="BOOKS,COMPUTERS,ELECTRONICS,APPAREL & SHOES,DIGITAL DOWNLOADS,JEWELRY GIFT CARDS";
         Assert.assertEquals(Actual, expected);
        

		
		}
}



