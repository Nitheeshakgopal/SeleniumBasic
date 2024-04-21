package PracticeSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonDropdown {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://artoftesting.com/samplesiteforselenium");
		WebElement sample=driver.findElement(By.xpath(" //select[@id='testingDropdown']"));
		Select obj=new Select(sample);
		Thread.sleep(2000);
		obj.selectByVisibleText("Automation Testing");
	
		Thread.sleep(2000);
		obj.selectByIndex(3);
		List<WebElement> checkBox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement box:checkBox) {
			box.click();
		}
		
	   
	
		
		
	}

}
