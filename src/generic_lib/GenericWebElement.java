package generic_lib;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GenericWebElement {
	public void cleardata(WebElement ele)//clear()
	{
		ele.clear();
	}
	
	public void click_element(WebElement ele)//click()
	{
		ele.click();
	}
	
	public WebElement findTheElement(WebDriver driver, String path)//findElement()
	{
		WebElement ele = driver.findElement(By.xpath(path));
		return ele;
	}
	
	public String getTheAttribute(WebElement ele, String att)//getAttribute()
	{
		String a = ele.getAttribute(att);
		System.out.println(a);
		return a;
	}
	
	public String getTheCssValue(WebElement ele, String val)//getCssValue
	{
		String x = ele.getCssValue(val);
		System.out.println(x);
		return x;
	}
	
	public Point getTheLocation(WebElement ele)//getLocation()
	{
		Point loc = ele.getLocation();
		System.out.println(loc);
		return loc;
	}
	public int getLocationX(WebElement ele)//getX()
	{
		Point loc = ele.getLocation();
		int x = loc.getX();
		System.out.println(x);
		return x;
	}
	public int getLocationY(WebElement ele)//getY()
	{
		Point loc = ele.getLocation();
		int y = loc.getY();
		System.out.println(y);
		return y;
	}
	
	
	public int getTheHeight(WebElement ele)//getSize().getHeight()
	{
		int height = ele.getSize().getHeight();
		System.out.println(height);
		return height;
	}
	
	public int getTheWidth(WebElement ele)//getSize().getWidth()
	{
		int width = ele.getSize().getWidth();
		System.out.println(width);
		return width;
	}
	public String getTheTagName(WebElement ele)//getTagName()
	{
		String tag = ele.getTagName();
		System.out.println(tag);
		return tag;
	}
	
	public String getTheText(WebElement ele)//getText()
	{
		String text = ele.getText();
		System.out.println(text);
		return text;
	}
	public boolean isElementDisplayed(WebElement ele)//isDisplayed()
	{
		boolean b = ele.isDisplayed();
		System.out.println(b);
		return b;
	}
	
	public boolean isElementEnabled(WebElement ele)//isEnabled()
	{
		boolean b = ele.isEnabled();
		System.out.println(b);
		return b;
	}
	
	public boolean isElementSelected(WebElement ele)//isSelcted()
	{
		boolean b =ele.isSelected();
		System.out.println(b);
		return b;
	}

	public void sendTheKeys(WebElement ele,String value)//sendkeys()
	{
		ele.sendKeys(value);
	}
	
	public void submitval(WebElement ele,String value)//submit()
	{
		ele.submit();
	}
	
	
}
