package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.Signinpage;

public class Signintest extends Testbase{
	
	public Signinpage Signinobject;
	public	Homepage    Homeobject;
	
	
	@Test 
	public void usersignintest() throws InterruptedException
	{
		Homeobject  = new Homepage(driver);
		Homeobject.homepages();
		Signinobject =new Signinpage(driver);
		Signinobject.usersignin("2laa.eldidy@gmail.com","Farida11");
		// Thread.sleep(6000);
		Assert.assertEquals("Hello, alaa",Signinobject.sucesssignin.getText());
		
	}

}
