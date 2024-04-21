package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GeneralMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://yatra.com/");
		String heading=driver.findElement(By.xpath("//*[@class='main-heading']")).getText();
		System.out.println(heading);
		WebElement tittle=driver.findElement(By.xpath("//ul[@class='selc-flight-options']/li[1]/a"));
		String title=tittle.getAttribute("title");
		System.out.println(title);
		//we can also use the below method without using webElements
		/*String oneWay=driver.findElement(By.xpath("//ul[@class='selc-flight-options']/li[1]/a")).getAttribute("title");
		System.out.println(oneWay);
		*/
		WebElement multi=driver.findElement(By.xpath("//ul[@class='selc-flight-options']/li[3]/a"));
		String multiCity=multi.getAttribute("data-flighttrip");
		System.out.println(multiCity);
		
		String cssValue=multi.getCssValue("color");
		System.out.println(cssValue);
		//ToolTip - value of title Attribute
		//Grab tootltip for RoundTrip
		WebElement roundTrip=driver.findElement(By.xpath("//ul[@class='selc-flight-options']/li[2]/a"));
		String round=roundTrip.getAttribute("title");
		System.out.println(round);
		//yathrasite heading tooltip grabbing//
		WebElement head=driver.findElement(By.xpath("//*[@class='ico-newHeaderLogo']/a"));
		String toolTip=head.getAttribute("title");
		System.out.println(toolTip);
		
		
		

	}

}
