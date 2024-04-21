package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameSample {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/iframe");
		driver.findElement(By.xpath("//*[@class='example']/h3"));
		System.out.println(driver.findElement(By.xpath("//*[@class='example']/h3")).getText());
	    WebElement frame= driver.findElement(By.xpath("//*[@id='mce_0_ifr']"));
	    driver.switchTo().frame(frame);
	  
	    driver.findElement(By.id("tinymce")).sendKeys("Nitheesha");
	    System.out.println(driver.findElement(By.id("tinymce")).getText());
	    driver.switchTo().defaultContent();
        System.out.println(driver.findElement(By.xpath("//*[@class='example']/h3")).getText());
	   
	    

	}

}
