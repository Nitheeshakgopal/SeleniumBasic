package PracticeSelenium;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Excelreader {
	@Test
	public void sample() throws IOException {
	
	Properties prop=new Properties();
	File file=new File("C:\\Automation\\Java_Selenium\\SupermarketAutomation\\src\\main\\resources\\Configuration\\confi.properties");
	FileInputStream fis =new FileInputStream(file);
	prop.load(fis);
	System.out.println(prop.getProperty("Environment"));
	WebDriver driver=new ChromeDriver();
	driver.get(prop.getProperty("stg"));
	
	
			
			
			
			
	}
}
