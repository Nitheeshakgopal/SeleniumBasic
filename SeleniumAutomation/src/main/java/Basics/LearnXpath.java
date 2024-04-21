package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[@class='ico-login']")).click();
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("obsqura24@gmail.com");
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("mypassword");
		driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
		//using parent/child path including index
		driver.findElement(By.xpath("//ul[@class='list']/li[4]/a")).click();
		//selection for blue shirt using contains
		driver.findElement(By.xpath("//*[@class='product-title']//*[contains(text(),'Blue Jeans')]")).click();
		WebElement quantity=driver.findElement(By.xpath("//*[@class='qty-input']"));
		//removing quantity from quantity box
		quantity.clear();
		//after clearing the quantity box send our required number
		quantity.sendKeys("10");
		
		

	}

}
