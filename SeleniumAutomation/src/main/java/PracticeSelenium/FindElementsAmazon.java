package PracticeSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsAmazon {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.amazon.com.au/?tag=msnaupcabk-22&ref=nav_signin&adgrpid=1230353832616213&hvadid=76897279526026&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=112413&hvtargid=kwd-76897360204732%3Aloc-9&hydadcr=179_421092");
		 Thread.sleep(2000);
		 driver.findElement(By.linkText("Amazon")).click();
		 driver.findElement(By.id("twotabsearchtextbox")).click();
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung galaxy watch 6");
		 //driver.findElement(By.id("nav-search-submit-button")).click();
		 List<WebElement> cart=driver.findElements(By.className("a-button-text"));
		 for(WebElement add:cart) {
			 add.click();
		 }
		 
		 Thread.sleep(2000);
      driver.quit();
	}

}
