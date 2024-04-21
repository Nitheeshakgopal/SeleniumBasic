package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com.au");
		driver.findElement(By.xpath("//a[@id='nav-logo-sprites']")).click();
		driver.findElement(By.xpath("//span[@class='hm-icon-label']")).click();

	}

}
