package PracticeSelenium;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class PracticeEntermsgObsqr {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
	    System.out.println(driver.getTitle());
	    driver.findElement(By.xpath("//*[@id='single-input-field']")).sendKeys("Hai Nitheesha");
	    driver.findElement(By.id("button-one")).click();
	    Thread.sleep(1000);
	    driver.findElement(By.xpath("//*[@class='list-group list-group-flush']/li[2]")).click();
	   System.out.println(driver.getTitle());
	   driver.findElement(By.xpath("//*[@class='form-check-input']")).click();
	   List<WebElement> checkBox=driver.findElements(By.xpath("//*[@class='check-box-list']"));
	   for(WebElement check:checkBox) {
		   check.click();
	   }
	   Thread.sleep(1000);
	   driver.findElement(By.xpath("//*[@class='list-group list-group-flush']/li[4]/a")).click();
       WebElement selection=driver.findElement(By.xpath("//*[@id='single-input-field']"));
       Select obj=new Select(selection);
       obj.selectByIndex(2);
	   
	   
	   
	   
	   
	   
	}

}
