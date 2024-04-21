package PracticeSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
        driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("bo");
        Thread.sleep(1000);
       List<WebElement> dynamic=driver.findElements(By.xpath("//*[@class='ui-menu-item']/div"));
	   System.out.println(dynamic.size()); 
       for(WebElement city:dynamic) {
	    	 if(city.getText().equalsIgnoreCase("Botswana")){
	    	 city.click();
	    	 break;
	     }
       }
	
	
	
	
	
	}
	
	
	
	

}
