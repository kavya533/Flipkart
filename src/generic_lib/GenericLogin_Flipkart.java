package generic_lib;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class GenericLogin_Flipkart implements Framework_Constants {
	private WebDriver driver;
	@BeforeMethod
	public void openApp()
	{
		System.setProperty(GECKO_KEY, GECKO_VALUE);
		setDriver(new FirefoxDriver());
		getDriver().get("https://www.flipkart.com/");
	}

	@AfterMethod
	public void closeApp(ITestResult res) throws IOException
	{
		int status = res.getStatus();
		String tcname=res.getName();
		if(status==2)
		{
		GenericScreenshot.getScreenshot(driver, tcname);
		}
		driver.quit();
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

}
