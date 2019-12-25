package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import generic_lib.GenricActions;;

public class FLipkart_HomePage {
	GenricActions g1=new GenricActions();
	
	@FindBy(xpath="(//div[.='My Account'])[3]")
	private WebElement myactbtn;
	
	@FindBy(xpath="//div[.='Logout']")
	private WebElement logoutbtn;
	
	@FindBy(xpath="//span[.='Women']")
	private WebElement womentab;
	
	@FindBy(xpath="//a[@title='Top, T-Shirts & Shirts']")
	private WebElement topslink;
	
	public FLipkart_HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	public void selectOption(WebDriver driver)
	{
		
		g1.mouse_Hover(driver, womentab);
		
	}

	public void selectSubOption()
	{
		topslink.click();
	}
	
	public void movetoMyAccount(WebDriver driver)
	{
		g1.mouse_Hover(driver, myactbtn);
	}
	
	public void clickToLogout()
	{
		logoutbtn.click();
	}
}
