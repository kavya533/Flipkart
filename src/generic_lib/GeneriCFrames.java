package generic_lib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GeneriCFrames {

	public void switch_To_Frame_Via_Index(WebDriver driver,int index)
		{
			driver.switchTo().frame(index);
		}
	
	public void switch_To_Frame_Via_Id(WebDriver driver,String id)
	{
		driver.switchTo().frame(id);
	}
	
	public void switch_To_Frame_Via_WebElement(WebDriver driver,WebElement f)
	{
		driver.switchTo().frame(f);
	}
	
	

	}


