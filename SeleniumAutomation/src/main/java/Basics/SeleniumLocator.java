package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocator {

	public static void main(String[] args) throws InterruptedException {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://www.saucedemo.com/");
	 
	 
	//command for sending username in the field username 
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	//command for sending password in the field password 
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	//command for clicking submit button
	driver.findElement(By.className("submit-button")).click();
	//command for clicking the burger menu button
	driver.findElement(By.id("react-burger-menu-btn")).click();
	
	//we can also write the above commamnd like the below format
	 //WebElement hamburgerIcon = driver.findElement(By.id("react-burger-menu-btn"));
	 //hamburgerIcon.click();
	//before doing linktext command we must declare waitinf command thread
	 Thread.sleep(1000);
	 driver.findElement(By.linkText("About")).click();
	 driver.navigate().back();
	 driver.findElement(By.id("react-burger-menu-btn")).click();
	 // //before doing partial linktext command we must declare waiting command thread
	 Thread.sleep(1000);
	 driver.findElement(By.partialLinkText("Logo"));
	 Thread.sleep(1000);
	 driver.quit();
	 
	 
	 
	 

	}

}
