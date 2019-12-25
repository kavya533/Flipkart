package test_scripts;

import org.testng.annotations.Test;

import generic_lib.GenericLogin_Flipkart;
import pom_class.FLipkart_HomePage;
import pom_class.Flipkart_WelcomePage;

public class Flipkart_Login_Logout extends GenericLogin_Flipkart{
	
	@Test
	public void loginLogout() throws InterruptedException
	{
		Flipkart_WelcomePage wpage=new Flipkart_WelcomePage(getDriver());
		FLipkart_HomePage hpage= new FLipkart_HomePage(getDriver());
		wpage.setUsername("9972221402");
		Thread.sleep(2000);;
		wpage.setPassword("$WATHIswa18");
		Thread.sleep(2000);
		wpage.clickLogin();
		Thread.sleep(5000);
		hpage.movetoMyAccount(getDriver());
		Thread.sleep(3000);
		hpage.clickToLogout();
		Thread.sleep(2000);
	}

}
