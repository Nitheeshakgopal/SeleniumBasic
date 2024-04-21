package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleBrowser {

	public static void main(String[] args) {
		String browser="firefox";// here we can enter different browser name
		WebDriver driver=null;
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")){
			driver=new EdgeDriver();
			
		}
		else if(browser.equalsIgnoreCase("firefox")){
			driver=new FirefoxDriver();
			
		}
		driver.manage().window().maximize();
		//driver.get("https://www.google.com/");
		driver.get("https://www.saucedemo.com/");
		driver.quit();
	}

}
