package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Pagebase {

	public WebDriver driver;
	public JavascriptExecutor jse;
	
	public	Pagebase(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	
	public void press(WebElement ele)
	{
		ele.click();	
	}
	
	public void write(WebElement ele,String txt)
	{
	ele.sendKeys(txt);	
	}	
	
	public void scrolldown()
	{
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("scrollBy(0,3000)");
	}
	
	
	
	
	
	
}
