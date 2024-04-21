package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropdown {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://selenium.qabible.in/jquery-select.php");
	driver.findElement(By.xpath("//span[@class='select2-selection select2-selection--multiple']")).sendKeys("new");

	}

}
