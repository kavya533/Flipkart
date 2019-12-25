package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Flipkart_SpecificProdPage {
	
	@FindBy(xpath="(//div[@class='_2fXpRR _2RncVR _2UBURg'])[3]")
	private WebElement tcolor;
	
	@FindBy(xpath="(//span[@id='Size']/..//a)[2]")
	private WebElement tsize;
	
	@FindBy(xpath="//button[contains(.,'ADD TO CART')]")
	private WebElement addtocartbtn;
	
	public Flipkart_SpecificProdPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void chooseColour()
	{
		tcolor.click();
	}
	
	public void chooseSize()
	{
		tsize.click();
	}

	public void clickAddtoCart()
	{
		addtocartbtn.click();
	}

}
