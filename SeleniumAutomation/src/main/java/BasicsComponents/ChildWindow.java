package BasicsComponents;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindow {

	public static void main(String[] args) {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://the-internet.herokuapp.com/windows");
	  System.out.println("Parent window is :"+driver.getTitle());
	  driver.findElement(By.xpath("//*[@class='example']/a")).click();
	  System.out.println("The child class name is:"+ driver.getTitle());
	 Set<String> window= driver.getWindowHandles();
	 Iterator<String>it = window.iterator();
	 String parent=it.next();
	 String child=it.next();
	 driver.switchTo().window(child);
	 System.out.println("Child window is :"+driver.getTitle());
	 driver.close();
	 
	 

	}

}
