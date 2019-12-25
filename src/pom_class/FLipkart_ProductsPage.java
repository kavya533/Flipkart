package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FLipkart_ProductsPage {
	@FindBy(xpath="//a[contains(.,'Color Block Women Hooded')]")
	private WebElement prodlink;
	
	@FindBy(xpath="(//a[contains(.,'Casual Cutout Sleeve Solid Women')])[1]")
	private WebElement prodlink1;
	
	public FLipkart_ProductsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickPrrodLink()
	{
		prodlink.click();
	}
	
	public void clickPrrodLink1()
	{
		prodlink1.click();
	}
	
	

}
