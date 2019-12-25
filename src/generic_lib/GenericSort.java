package generic_lib;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.openqa.selenium.WebElement;

public class GenericSort {
	
	public  ArrayList<String> sortAscending(List<WebElement> listaddr)
	{
		ArrayList<String>newlist=new ArrayList<String>();
		for(WebElement we:listaddr)
		{
			String opt_val = we.getText();
			newlist.add(opt_val);
			}
		Collections.sort(newlist);
		return newlist;
	}
	
	public  ArrayList<String> sortDescending(List<WebElement> listaddr)
	{
		ArrayList<String>newlist=new ArrayList<String>();
		for(WebElement we:listaddr)
		{
			String opt_val = we.getText();
			newlist.add(opt_val);
			}
		Collections.sort(newlist, Collections.reverseOrder());
		return newlist;
	}

	
	
	

}
