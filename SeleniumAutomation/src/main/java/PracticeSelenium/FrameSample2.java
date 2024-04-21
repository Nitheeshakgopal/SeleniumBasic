package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameSample2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		WebElement frame=driver.findElement(By.xpath("//*[@id='courses-iframe']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath(" //*[@class='theme-btn']")).click();
		System.out.println(driver.findElement(By.xpath(" //*[@class='theme-btn']")).getText());
		

	}

}
