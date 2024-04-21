package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAddingDenim {

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
		//syntax;//tagname[contains(@attribute,’(partial)value of attribute’)
		driver.findElement(By.xpath("//*[@class='product-title']//*[contains(text(),'Casual Golf Belt')]")).click();
		WebElement box = driver.findElement(By.xpath("//*[contains(@id,'EnteredQuantity')]"));
		box.clear();
		box.sendKeys("5");
		
		//driver.quit();
	}

}
