package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropSample {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com");
		
		WebElement drags=driver.findElement(By.xpath("//*[@id='content']/ul/li[10]/a"));
		drags.click();
		Actions obj=new Actions(driver);
		WebElement source=driver.findElement(By.id("column-a"));
		System.out.println(source.getText());
		WebElement target=driver.findElement(By.id("column-b"));
		obj.dragAndDrop(source, target).build().perform();
		
		
	}

}
