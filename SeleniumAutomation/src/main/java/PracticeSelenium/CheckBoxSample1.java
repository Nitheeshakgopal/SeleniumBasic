package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxSample1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com");
		driver.findElement(By.xpath("//*[@id='content']/ul/li[6]/a")).click();
		//driver.findElement(By.xpath("//*[@id='checkboxes']/input[1]")).click();
		WebElement check=driver.findElement(By.xpath("//*[@id='checkboxes']/input[1]"));
		boolean first=check.isSelected();
		
		System.out.println(first);
		System.out.println(check.isDisplayed());


	}

}
