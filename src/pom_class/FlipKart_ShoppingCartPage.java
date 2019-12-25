package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipKart_ShoppingCartPage {
	
	@FindBy(xpath="//span[.='Place Order']")
	private WebElement orderlink;
	
	@FindBy(xpath="//a[contains(.,'silkova Casual Cutout Sleeve Solid Women')]/../../../..//button[2]")
	private WebElement inquan;
	
	public FlipKart_ShoppingCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void orderProd()
	{
		orderlink.click();
	}
	
	public void increaseQuantity()
	{
		inquan.click();
	}
	

}
