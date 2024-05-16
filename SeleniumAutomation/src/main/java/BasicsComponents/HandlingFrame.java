package BasicsComponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/iframe");
		WebElement tittle=driver.findElement(By.xpath("//*[@class='example']/h3"));
		System.out.println(tittle.getText());
		/**
		 * switch to frame using name, id, index or WebElement
		 */
		//driver.switchTo().frame("mce_0_ifr");
		
		
		WebElement frame=driver.findElement(By.xpath("//*[@id='mce_0_ifr']"));
		//We can handle frames by index,By name/id, By webelement.Here we use webelement in the bracket of frame//
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//*[@id='tinymce']")).sendKeys("Hi Nitheesha");
		System.out.println(driver.findElement(By.xpath("//*[@id='tinymce']")).getText());
		
		//come outside of frame
		driver.switchTo().defaultContent();
		System.out.println(tittle.getText());
		//driver.quit();

	}

}
