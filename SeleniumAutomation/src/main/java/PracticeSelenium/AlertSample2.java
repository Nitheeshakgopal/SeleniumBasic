package PracticeSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertSample2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/javascript-alert.php");
        driver.findElement(By.xpath("//*[@class='btn btn-success']")).click();
        Alert alert=driver.switchTo().alert();
        Thread.sleep(1000);
        System.out.println(alert.getText());
        alert.accept();
        
        driver.findElement(By.xpath("//*[@class='btn btn-warning']")).click();
        System.out.println(alert.getText());
        Thread.sleep(2000);
        alert.accept();
        
        
        driver.findElement(By.xpath("//*[@class='btn btn-danger']")).click();
        alert.sendKeys("Nitheesha");
        System.out.println(alert.getText());
        alert.accept();
        driver.quit();
        
       
        
	}

}
