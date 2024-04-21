package PracticeSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.className("submit-button")).click();
		//driver.findElement(By.id("react-burger-menu-btn")).click();
		List<WebElement> cart=driver.findElements(By.className("btn_inventory"));
		System.out.println(cart.size());
		/*for(int i=0;i<cart.size();i++) {
			//cart.get(i).click();
		}
		*/
		Thread.sleep(2000);
		for(WebElement add:cart) {
			add.click();
		}
		driver.quit();
		
    
	}

}
