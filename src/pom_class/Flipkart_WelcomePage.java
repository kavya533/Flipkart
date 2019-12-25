package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart_WelcomePage {
	@FindBy(xpath="(//input[@type='text'])[2]")
	private WebElement unametbox;
	
	@FindBy (xpath="//input[@type='password']")
	private WebElement pwdtbox;
	
	@FindBy(xpath="(//span[.='Login'])[3]")
	private WebElement loginbtn;
	
	public Flipkart_WelcomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername(String un)
	{
		unametbox.sendKeys(un);
	}
	
	public void setPassword(String pwd)
	{
		pwdtbox.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		loginbtn.click();
	}

}
