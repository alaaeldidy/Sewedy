package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Languagepage;

public class Languagetest extends Testbase {

	public Languagepage Languageobject;

	
@Test
public void userchngelangtest() throws InterruptedException
{
	Languageobject=new Languagepage(driver);
	Languageobject.changelang();
	Thread.sleep(5000);
	Assert.assertEquals("العربة",Languageobject.successlang.getText());
}
	
	
	
}
