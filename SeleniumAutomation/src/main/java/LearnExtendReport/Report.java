package LearnExtendReport;

import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Report {
	ExtentReports extent;
	@BeforeTest
	public void generateReport() {
		String reportPath = System.getProperty("user.dir")+"//Reports//AutomationReport.html";
		ExtentSparkReporter reporter = new ExtentSparkReporter(reportPath);
		reporter.config().setReportName("Automation Report");
		reporter.config().setDocumentTitle("Obsqura Zone");
        extent = new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("QA Name","Nitheesha");
		extent.setSystemInfo("Environment","QA");
	}
	@Test
	public void myfirstTry() {
		ExtentTest test = extent.createTest("myFirstTest");
		WebDriver driver=new ChromeDriver();
		test.log(Status.PASS, "I am passed");
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		driver.quit();
		extent.flush();
	}
	@Test
	public void mySecondTry() {
		ExtentTest test = extent.createTest("mySecondTest");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		test.log(Status.PASS, "I am passed");
		driver.get("https://www.Google.com");
		driver.quit();
		extent.flush();
	}
	@Test
	public void failedTestCase() {
		ExtentTest test = extent.createTest("failed test case");
		test.fail("deliberately failing this test");
		extent.flush();
		Assert.fail();
		
		
	}
	
	

}


