package PracticeSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddTocartForeach {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		//driver.findElement(By.xpath("//*[@class='bm-burger-button']")).click();
		Thread.sleep(1000);
		List<WebElement> cart=driver.findElements(By.className("btn_inventory"));
		
		for(WebElement carts:cart) {
			carts.click();
		}
		
		

	}

}
