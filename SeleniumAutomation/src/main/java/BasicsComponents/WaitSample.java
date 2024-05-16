package BasicsComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitSample {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
	driver.get("https://selenium.qabible.in/dynamic-load.php");
	driver.findElement(By.id("save")).click();
	WebElement name=driver.findElement(By.className("card-title"));
	System.out.println(name.getText());
	driver.findElement(By.id("progress-bars")).click();
	driver.findElement(By.id("downloadButton")).click();
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(9));
	wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//*[@class='progress-label']")),"Complete!"));
	System.out.println(driver.findElement(By.xpath("//*[@class='progress-label']")).getText());
}
}
