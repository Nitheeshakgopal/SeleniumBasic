package BasicsComponents;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertSample {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://selenium.qabible.in/javascript-alert.php");
    driver.findElement(By.xpath("//*[@class='btn btn-success']")).click();
    //Alert is an interface here//
    Alert alert=driver.switchTo().alert();
    //storing value in string//
    String alertText=alert.getText();
    System.out.println(alertText);
    //accept alert//
    alert.accept();
    
    
    Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@class='btn btn-warning']")).click();
	alertText = alert.getText();
	System.out.println(alertText);
	//dismiss alert//
	alert.dismiss();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@class='btn btn-danger']")).click();
	alert.sendKeys("Nitheesha");
	alert.accept();
	Thread.sleep(2000);
	driver.quit();
    
    
	}

}
