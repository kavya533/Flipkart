package test_scripts;

import org.testng.annotations.Test;

import generic_lib.GenericLogin_Flipkart;
import pom_class.Flipkart_WelcomePage;

public class Flipkart_Login extends GenericLogin_Flipkart
{
	@Test
	public void login() throws InterruptedException
	{
		Flipkart_WelcomePage wpage=new Flipkart_WelcomePage(getDriver());
		wpage.setUsername("9972221402");
		Thread.sleep(2000);
		wpage.setPassword("$WATHIswa18");
		Thread.sleep(2000);
		wpage.clickLogin();
		Thread.sleep(2000);
	}

}
