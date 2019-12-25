package generic_lib;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class GenericSelect {
	public void selectIndex(WebElement ele, int i)//SelectByIndex()
	{
		Select s=new Select(ele);
		s.selectByIndex(i);
	}
	
	public void selectValue(WebElement ele, String value)//selectByValue()
	{
		Select s=new Select(ele);
		s.selectByValue(value);
	}
	
	public void selectVisibleText(WebElement ele, String text)//selectByVisibleText()
	{
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}
	
	public void deselectIndex(WebElement ele, int i)//deselectByIndex()
	{
		Select s=new Select(ele);
		s.deselectByIndex(i);
	}
	
	public void deselectValue(WebElement ele, String value)//deselectByValue()
	{
		Select s=new Select(ele);
		s.deselectByValue(value);
	}
	
	public void deselectVisibleText(WebElement ele, String text)//deselectByVisibleText()
	{
		Select s=new Select(ele);
		s.deselectByVisibleText(text);
	}
	
	public void deselectAll(WebElement ele)//deselectAll()
	{
		Select s=new Select(ele);
		s.deselectAll();
	}
	
	public ArrayList<String> allSelectedOtptions(WebElement ele)//getAllSelectedOptions()
	{
		Select s=new Select(ele);
		List<WebElement> options = s.getAllSelectedOptions();
		
		ArrayList<String> l=new ArrayList<String>();
		for(WebElement we:options)
		{
			String val = we.getText();
			l.add(val);
		}
		return l;
		
		
		
	}
	public String firstSelectedOption(WebElement ele)//getFirstSelectedOption()
	{
		Select s=new Select(ele);
		WebElement option = s.getFirstSelectedOption();
		String val = option.getText();
		return val;
		
	}
	public void options(WebElement ele)//getOptions()
	{
		Select s=new Select(ele);
		List<WebElement> text = s.getOptions();
		int count = text.size();
		System.out.println(count);
		for(WebElement we:text)
		{
			String t = we.getText();
			System.out.println(t);
		}
	}
	public void checkmultiple(WebElement ele)//isMultiple()
	{
		Select s=new Select(ele);
		boolean b = s.isMultiple();
		System.out.println(b);
	}
	
	
}
