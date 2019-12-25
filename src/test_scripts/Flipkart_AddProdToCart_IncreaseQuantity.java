package test_scripts;

import java.util.Set;

import org.testng.annotations.Test;

import generic_lib.GenericLogin_Flipkart;
import pom_class.FLipkart_HomePage;
import pom_class.FLipkart_ProductsPage;
import pom_class.FlipKart_ShoppingCartPage;
import pom_class.Flipkart_SpecificProdPage;
import pom_class.Flipkart_WelcomePage;

public class Flipkart_AddProdToCart_IncreaseQuantity extends GenericLogin_Flipkart {

	@Test
	public void addIncreaseCartQuantity() throws InterruptedException
	{
	Flipkart_WelcomePage wpage=new Flipkart_WelcomePage(getDriver());
	FLipkart_HomePage hpage=new FLipkart_HomePage(getDriver());
	FLipkart_ProductsPage prodpage=new FLipkart_ProductsPage(getDriver());
	Flipkart_SpecificProdPage sprodpage=new Flipkart_SpecificProdPage(getDriver());
	FlipKart_ShoppingCartPage scartpage=new FlipKart_ShoppingCartPage(getDriver());
	wpage.setUsername("9972221402");
	Thread.sleep(2000);
	wpage.setPassword("$WATHIswa18");
	Thread.sleep(2000);
	wpage.clickLogin();
	Thread.sleep(4000);
	hpage.selectOption(getDriver());
	Thread.sleep(3000);
	hpage.selectSubOption();
	Thread.sleep(5000);
	prodpage.clickPrrodLink1();
	Thread.sleep(5000);
	String parent_id = getDriver().getWindowHandle();
	Set<String> tabs = getDriver().getWindowHandles();
	tabs.remove(parent_id);
	for(String we:tabs)
	{
	getDriver().switchTo().window(we);
	}
	sprodpage.chooseColour();
	Thread.sleep(2000);
	sprodpage.chooseSize();
	Thread.sleep(2000);
	sprodpage.clickAddtoCart();
	Thread.sleep(4000);
	scartpage.increaseQuantity();
	Thread.sleep(2000);
	scartpage.orderProd();
	Thread.sleep(2000);
	
}
}
