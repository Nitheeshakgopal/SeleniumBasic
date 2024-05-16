package PracticeSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitSample {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
		WebElement scroll=driver.findElement(By.xpath("//*[@class='dropbtn']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		js.executeScript("arguments[0].scrollIntoView(true);",scroll);
		driver.findElement(By.xpath("//*[@class='dropdown-content']"));
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(9));
		wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//*[@class='dropdown-content']")),"dropdown-content show"));
		System.out.println(driver.findElement(By.xpath("//*[@class='dropdown-content']")).getText());
		

	}

}
