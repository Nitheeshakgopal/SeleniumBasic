package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/drag-drop.php");
		
		 Actions obj=new Actions(driver);
		 
		 WebElement source=driver.findElement(By.xpath("//*[@id='todrag']/span[1]"));
		 
		 WebElement target=driver.findElement(By.id("mydropzone"));
		 
		 
		 obj.dragAndDrop(source, target).build().perform();

	}

}
