package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends Pagebase {

	public Homepage(WebDriver driver) {
		super(driver);
		
		
	}
	
	@FindBy(id="nav-link-accountList")
	WebElement account;
	
	@FindBy(id="createAccountSubmit")
	WebElement createamazon;
	
	
	public void homepages()
	{
		press(account);	
	}
	
	public void create()
	{
		press(createamazon);	
	}
	
	
	
	
	
	
	
}
