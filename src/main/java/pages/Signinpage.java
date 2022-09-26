package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Signinpage extends Pagebase {

	public Signinpage(WebDriver driver) {
		super(driver);
			
	}

	@FindBy(id="ap_email")
	WebElement email;	
	
	@FindBy(id="continue")
	WebElement continuebtn;
	
	@FindBy(id="ap_password")
	WebElement password;
	
	@FindBy(id="signInSubmit")
	WebElement signinsubmit;
	
	@FindBy(id="nav-link-accountList-nav-line-1")
    public	WebElement sucesssignin;
	
	public void usersignin(String mail,String pass) throws InterruptedException
	{
		write(email, mail);
		press(continuebtn);
		write(password, pass);	
		press(signinsubmit);
	}
	
	
	
	
}
