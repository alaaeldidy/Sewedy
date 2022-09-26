package tests;

import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;



public class Testbase {


public WebDriver driver;
public Select select;

@BeforeMethod
public void useropen(@Optional("chrome") String browsename )
{
if(browsename.equalsIgnoreCase("chrome"))
{
	String path=System.getProperty("user.dir")+"\\Drivers\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver",path);
	driver= new ChromeDriver();
}

if(browsename.equalsIgnoreCase("firefox"))
{
	String path=System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe";
	System.setProperty("webdriver.gecko.driver",path);
	driver= new ChromeDriver();
}


driver.manage().window().maximize();
driver.navigate().to("https://www.amazon.com/");

}

@AfterMethod 
public void usertakescreen(ITestResult result) throws IOException

{ 
	if(ITestResult.FAILURE == result.getStatus()) 
	{ 
		String path=System.getProperty("user.dir")+"\\Automation\\Screenshots";
		TakesScreenshot ts = ((TakesScreenshot) driver); 
		File source=ts.getScreenshotAs(OutputType.FILE); 
	    FileUtils.copyFile(source,new File(".\\Screenshots\\"+result.getName()+".png"));
	}

}



@AfterTest
public void userclose()
{
driver.quit();	
}


















	
	
}
