package ExamPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class practice {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in");
		Actions obj=new Actions(driver);
		driver.findElement(By.xpath("//*[@class='collapse navbar-collapse']/ul/li[2]")).click();
		WebElement msg=driver.findElement(By.id("single-input-field"));
		obj.moveToElement(msg).click().keyDown(Keys.SHIFT).sendKeys("nitheesha").build().perform();
		
		
		

	}

}
