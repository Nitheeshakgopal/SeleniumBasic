package PracticeSelenium;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPractice {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
		System.out.println("Parent window is:"+driver.getTitle());
		driver.findElement(By.xpath("//*[@id='content']/div/a")).click();
		System.out.println("Child window is :"+driver.getTitle());
		Set<String>window=driver.getWindowHandles();
		Iterator<String>it=window.iterator();
		String parent=it.next();
		String Child=it.next();
		driver.switchTo().window(Child);
		System.out.println("Child window name is:"+driver.getTitle());
		driver.close();
		driver.quit();
		
		
	}

}
