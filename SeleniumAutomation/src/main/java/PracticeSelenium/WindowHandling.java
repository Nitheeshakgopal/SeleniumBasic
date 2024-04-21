package PracticeSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	
	driver.findElement(By.id("opentab")).click();
	
	Set<String> window=driver.getWindowHandles();
	Iterator<String>it=window.iterator();
	String child=it.next();
	String parent=it.next();
	driver.switchTo().window(parent);
	System.out.println(driver.getTitle());
	
	

	}

}
