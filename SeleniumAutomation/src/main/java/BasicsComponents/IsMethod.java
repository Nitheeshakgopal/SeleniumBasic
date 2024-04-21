package BasicsComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsMethod {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/checkboxes");
		WebElement first=driver.findElement(By.xpath("//*[@id='checkboxes']/input[1]"));
		WebElement second=driver.findElement(By.xpath("//*[@id='checkboxes']/input[2]"));
		boolean isSelectedFirst=first.isSelected();
		boolean isSelectedsecond=second.isSelected();
		System.out.println(isSelectedFirst);
		System.out.println(isSelectedsecond);
		
		first.click();
		System.out.println(first.isSelected());
		System.out.println(first.isDisplayed());
		System.out.println(first.isEnabled());
		
		}
		

	}


