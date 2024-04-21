package BasicsComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseKeyboard {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		/**
		 * Create an object of Actions class
		 */
		Actions obj=new Actions(driver);
		////Hover over an element command without using mouse//
	WebElement list=driver.findElement(By.id("list0box"));
	obj.moveToElement(list).build().perform();
	
	
     //click or sendkeys inside textbox without mouse//
	WebElement message=driver.findElement(By.id("single-input-field"));
	obj.moveToElement(message).click().sendKeys("Nitheesha").build().perform();
	
	////double click on an element//
	WebElement doubleClick=driver.findElement(By.id("button-one"));
	obj.moveToElement(doubleClick).doubleClick().build().perform();
	
	//right click//
	WebElement right=driver.findElement(By.id("button-one"));
	obj.moveToElement(right).contextClick().build().perform();
	
	//capital letter conversion//
	
	WebElement capital=driver.findElement(By.id("single-input-field"));
	Thread.sleep(1000);
	capital.clear();
	obj.moveToElement(capital).click().keyDown(Keys.SHIFT).sendKeys("nitheesha").build().perform();
	
	
	
		

	}

}
