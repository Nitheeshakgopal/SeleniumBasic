package BasicsComponents;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/date-picker.php");
		driver.findElement(By.xpath("(//*[@class='fa fa-calendar'])[1]")).click();
		
		WebElement date=driver.findElement(By.xpath("(//*[@class='datepicker-switch'])[1]"));
		while(date.getText().contains("November")) {
			driver.findElement(By.xpath("(//*[@class='datepicker-switch'])[1]")).click();
			
		}
        List<WebElement> days = driver.findElements(By.xpath("//*[@class='day']"));
		
		for(WebElement day : days) {
			if(day.getText().equals("30")) {
				day.click();
				break;
			}
		}

	}

}
