package generic_lib;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class GenericWebDriver {
	
	public void closebrowser(WebDriver driver)//close()
	{
		driver.close();
	}
	public void enterurl(WebDriver driver, String url)//get()
	{
		driver.get(url);
	}
	
	public String getTheurl(WebDriver driver) //getCurrentUrl()
	{
	String url = driver.getCurrentUrl();
	return url;
	}
	
	public String getThePageSource(WebDriver driver)//getPageSource()
	{
		String src = driver.getPageSource();
		System.out.println(src);
		return src;
	}
	
	public String getTheTitle(WebDriver driver)//GetTitle()
	{
		String title = driver.getTitle();
		System.out.println(title);
		return title;
	}
	
	public void maximizebrowser(WebDriver driver)//manage()---maximize browser
	{
		driver.manage().window().maximize();
	}
	
	public void resizeebrowser(WebDriver driver, int x,int y)//manage()---resize browser
	{
		Dimension d=new Dimension(x,y);
		driver.manage().window().setSize(d);
	}
	
	public void minimizebrowser(WebDriver driver) throws AWTException//minimize browse
	{
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ALT);
		r.keyPress(KeyEvent.VK_SPACE);
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_ALT);
		r.keyRelease(KeyEvent.VK_SPACE);
		r.keyRelease(KeyEvent.VK_N);
	}

	public void quitbrowser(WebDriver driver)//quit()
	{
		driver.quit();
	}
	
	public void navigateToUrl(WebDriver driver,String url)//navigate() -navigateToUrl
	{
		driver.navigate().to(url);
	}
	
	public void goback(WebDriver driver,String url1, String url2)//navigate() -navigateBack
	{
		driver.get(url1);
		driver.navigate().to(url2);
		driver.navigate().back();
	}
	
	public void goforward(WebDriver driver,String url1, String url2)//navigate() -navigateForward
	{
		driver.get(url1);
		driver.navigate().to(url2);
		driver.navigate().forward();
	}
	
	public void refreshBrowser(WebDriver driver,String url)//navigate() -Refresh Browser
	{
		driver.navigate().to(url);
		driver.navigate().refresh();
	}
	
	public void switch_to_tab(WebDriver driver, String id_tab)//switchTo()
	{
		driver.switchTo().window(id_tab);
	}
	
	
	
	
	
	
	
	
	
		
		
	
}
