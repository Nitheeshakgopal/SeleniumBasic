package BasicsComponents;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox_RadioButton {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/check-box-demo.php");
		driver.findElement(By.xpath("//*[@id='gridCheck']")).click();
      List<WebElement> checkBox=driver.findElements(By.xpath("//*[@class='check-box-list']"));
      for(WebElement checkBoxes:checkBox) {
    	  checkBoxes.click();
    
      }
      
	}

}
