package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddquantityCart {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.xpath("//*[@class='email']")).sendKeys("obsqura24@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("mypassword");
		driver.findElement(By.xpath("//*[@class='button-1 login-button']")).click();
		driver.findElement(By.xpath("//*[@class='list']/li[4]/a")).click();
		driver.findElement(By.xpath("//*[@class='product-item']//*[contains(text(),'Blue Jeans')]")).click();
        WebElement qunty=driver.findElement(By.xpath("//*[@class='qty-input']"));
        qunty.clear();
        qunty.sendKeys("10");
	}

}
