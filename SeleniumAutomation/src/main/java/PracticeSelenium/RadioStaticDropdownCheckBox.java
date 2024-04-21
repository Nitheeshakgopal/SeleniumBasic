package PracticeSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RadioStaticDropdownCheckBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//STATIC DROPDOWN//
		
		WebElement drop=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select obj=new Select(drop);
		obj.selectByIndex(1);
		Thread.sleep(2000);
		obj.selectByValue("option2");
		
		//CHECK BOX//
		
		List<WebElement> checkBox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement check:checkBox) {
			check.click();
		}
		
		//isSelected,isDisplayed,isEnabled//
		
		WebElement first=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[1]"));
		WebElement second=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[2]"));
		WebElement third=driver.findElement(By.xpath("//*[@id='checkbox-example']/fieldset/label[3]"));
		boolean isSelectedfirst=first.isSelected();
		System.out.println(isSelectedfirst);
		System.out.println(first.isDisplayed());
		System.out.println(first.isEnabled());
		
		
		//DYNAMIC DROPDOWN//
			driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Am");
			Thread.sleep(1000);
			List<WebElement> dynamic=driver.findElements(By.xpath("//*[@class='ui-menu-item']/div"));
			System.out.println(dynamic.size());
			for(WebElement city:dynamic) {
				if(city.getText().equalsIgnoreCase("American Samoa")){
				city.click();
				break;
				}
			}
			
	}
}

			
			
			
		
		




