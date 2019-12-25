package generic_lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class GenricActions {
	public void mouse_Hover(WebDriver driver, WebElement ele)//moveToElement()
	{
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
	}
	
	public void drag_Drop(WebDriver driver, WebElement src, WebElement dst)//dragAndDrop()
	{
		Actions act=new Actions(driver);
		act.dragAndDrop(src, dst).perform();
	}
	
	public void double_click (WebDriver driver, WebElement ele)//doubleClick()
	{
		Actions act=new Actions(driver);
		act.doubleClick(ele).perform();
	}
	
	public void right_click (WebDriver driver, WebElement ele)//contextClick()
	{
		Actions act=new Actions(driver);
		act.contextClick(ele).perform();
	}
	
	

}
