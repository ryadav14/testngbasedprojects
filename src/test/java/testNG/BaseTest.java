package testNG;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	  protected ThreadLocal<RemoteWebDriver> threadDriver = null;
	  
	 // public static WebDriver driver;
	  
	    @BeforeClass
	    public void setUp() throws MalformedURLException {
	 
	    threadDriver = new ThreadLocal<RemoteWebDriver>();
	        DesiredCapabilities dc = new DesiredCapabilities();
	        threadDriver.set(new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), dc.chrome()));
	     	 getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    	 
	     	getDriver().manage().window().maximize();
	    }
	 

	    public WebDriver getDriver() {
	        return threadDriver.get();
	    }
	 
	    @AfterClass
	    public void closeBrowser() {
	        getDriver().quit();
	 
	    }

}
