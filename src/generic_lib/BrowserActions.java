package generic_lib;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class BrowserActions {
	Robot r;
	
	public void maximizebrowser(WebDriver driver)//manage()---maximize browser
	{
		driver.manage().window().maximize();
	}
	
	public void minimizebrowser(WebDriver driver) //minimize browse
	{
		try {
			r=new Robot();
		} 
		catch (AWTException e)	
		{
			
		}
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_N);
	}

	public void closeBrowser(WebDriver driver) //close browser without using close()
	{
		try {
			r=new Robot();
		} 
		catch (AWTException e) 
		{
			
		}
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_C);
	}
	
	public void openInNewTab() //open in New tab
	{
		try {
			r=new Robot();
		} 
		catch (AWTException e) {
		
		}
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		
	}

	public void resizeebrowser(WebDriver driver, int x,int y)//manage()---resize browser
	{
		Dimension d=new Dimension(x,y);
		driver.manage().window().setSize(d);
	}

	public void refreshBrowser(WebDriver driver) //refresh browser
	{
		driver.navigate().refresh();
	}
	
	
	public void forward_Action(WebDriver driver) //forward_action
	{
		driver.navigate().forward();
	}
	
	public void backward_action(WebDriver driver) //backward action
	{
		driver.navigate().back();
	}
	

}
