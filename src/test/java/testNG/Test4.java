package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test4 extends BaseTest {
	  @Test
	    public void testLink()throws Exception{
		  getDriver().get("http://facebook.com");
	        WebElement emailAddress = getDriver().findElement(By.className("inputtext"));
	        emailAddress.click();
	        emailAddress.sendKeys("This is my facebook test3");
	        Thread.sleep(2000);
	    }
}
