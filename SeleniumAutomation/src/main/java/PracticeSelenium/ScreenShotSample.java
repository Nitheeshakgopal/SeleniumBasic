package PracticeSelenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotSample {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		TakesScreenshot scrn=(TakesScreenshot)driver;
		File source=scrn.getScreenshotAs(OutputType.FILE);
		File desired=new File(System.getProperty("user.dir")+"//Screenshot1.png");
		FileUtils.moveFile(source, desired);
		driver.quit();
		

	}

}
