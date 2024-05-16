package BasicsComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		JavascriptExecutor obj=(JavascriptExecutor)driver;
        WebElement execute=driver.findElement(By.cssSelector("[id='single-input-field']"));
        obj.executeScript("arguments[0].value='i am Nitheesha';",execute);
        WebElement msg=driver.findElement(By.cssSelector("[id='button-one']"));
        obj.executeScript("arguments[0].click();", msg);
	}

}
