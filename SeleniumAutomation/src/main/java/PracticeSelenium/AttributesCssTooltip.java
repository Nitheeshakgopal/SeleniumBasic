package PracticeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributesCssTooltip {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://yatra.com");
	WebElement yathra=driver.findElement(By.xpath("//*[@class='header-left-menu ftL']/a"));
	yathra.click();
	WebElement attri=driver.findElement(By.xpath(" //*[@class='selc-flight-options']/li[1]/a"));
	String att=attri.getAttribute("class");
	String toolTip=attri.getAttribute("title");
	System.out.println(toolTip);
	System.out.println(att);
	
	

	}
}
