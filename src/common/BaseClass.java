package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import java.io.File;
import org.apache.commons.io.FileUtils;

import File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class BaseClass {
	
	
	protected static WebDriver driver;
	//private ScreenshotHelper screenShotHelper;
	//TODO : How to do loggin, how to take screenshot, how to run failed test cases, test case grouping 
	
	public void openBrowser(){
		System.setProperty("webdriver.chrome.driver","C:\\Personal\\Interviews\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");	
	
	}
	
	public void getScreenshot(){
		File screenshotSaveFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshotSaveFile, new File("D:\\screenshot.png"));
		
	}		
	
	
}
