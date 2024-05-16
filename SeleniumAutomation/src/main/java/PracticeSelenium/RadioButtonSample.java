package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonSample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/jquery-select.php") ;
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@class='list-group list-group-flush']/li[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#inlineRadio1")).click();
		
	}

}
