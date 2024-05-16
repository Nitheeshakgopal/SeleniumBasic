package BasicsComponents;

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
		driver.get("https://www.obsqurazone.com");
		TakesScreenshot screen=(TakesScreenshot)driver;
		File source=screen.getScreenshotAs(OutputType.FILE);
		File desire=new File(System.getProperty("user.dir")+"\\screenshot.png");
        FileUtils.moveFile(source, desire);
        driver.quit();
	}

}
