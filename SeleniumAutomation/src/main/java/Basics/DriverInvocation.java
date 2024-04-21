package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverInvocation {

	public static void main(String[] args) throws InterruptedException {
		//creating an object of chrome driver class
		WebDriver driver=new ChromeDriver();
		//for importing=> ctrl+shft+o
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		//get the title
		String title=driver.getTitle();
		System.out.println(title);
		//getting for url
		String url=driver.getCurrentUrl();
		System.out.println(url);
		//command to  navigate backward
		driver.navigate().back();
		//waiting time
		Thread.sleep(2000);
		//navigate forward
		driver.navigate().forward();
		//command to quit browser
		driver.quit();
		

	}

}
