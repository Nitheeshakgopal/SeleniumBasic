package BasicsComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.obsqurazone.com");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1500)");
		WebElement desired=driver.findElement(By.xpath("//*[@class='home-sec3-inner-h2']"));
		Thread.sleep(1000);
		js.executeScript("arguments[0].scrollIntoView(true);",desired);

	}

}
