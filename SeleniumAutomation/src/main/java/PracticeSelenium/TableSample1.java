package PracticeSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableSample1 {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		List<WebElement>table=driver.findElements(By.xpath("//*[@class='table-display']/tbody/tr[4]/td"));
        for(WebElement tables:table) {
        	System.out.println(tables.getText());
        }
        
        WebElement column=driver.findElement(By.xpath("//*[@class='table-display']/tbody/tr[3]/td[2]"));
        System.out.println(column.getText());
	}

}
