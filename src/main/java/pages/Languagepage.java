package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class Languagepage extends Pagebase {

	public Select select;
	
	public Languagepage(WebDriver driver) {
		super(driver);
		
	}
	
	@FindBy(css="span.icp-nav-flag.icp-nav-flag-us")
	WebElement lang;

	@FindBy(xpath="//*[@id=\"icp-language-settings\"]/div[4]/div/label/i")
	WebElement changlang;
	
	@FindBy(id="icp-currency-dropdown")
	WebElement currlist;
	
	@FindBy(xpath="//*[@id=\"icp-save-button\"]/span/input")
	WebElement submit;
	
	
	@FindBy(xpath="//*[@id=\"nav-cart-text-container\"]/span[2]")
	public WebElement successlang;
	
	
	public void changelang() throws InterruptedException
	{
	press(lang);
	press(changlang);
	Thread.sleep(5000);
    select=new Select(currlist);
	select.selectByValue("EUR");
	press(submit);	
	
	}
	
	
	
}
