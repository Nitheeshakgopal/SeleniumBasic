package BasicsComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnStaticDropdown {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://selenium.qabible.in/select-input.php");
	WebElement dropDown=driver.findElement(By.xpath("//select[@id='single-input-field']"));

	Select staticDropdown=new Select(dropDown);
	Thread.sleep(1000);
	staticDropdown.selectByValue("Yellow");
	Thread.sleep(1000);
	staticDropdown.selectByIndex(1);
	Thread.sleep(1000);
	staticDropdown.selectByVisibleText("Green");
	//driver.quit();
	}

}
