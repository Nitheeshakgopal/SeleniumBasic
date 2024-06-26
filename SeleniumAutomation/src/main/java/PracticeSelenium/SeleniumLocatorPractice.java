package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocatorPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		//driver.findElement(By.id("user-name")).sendKeys("standard_user");
		WebElement element=driver.findElement(By.id("user-name"));
		element.sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		driver.findElement(By.className("product_sort_container")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("btn")).click();
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
	}

}
