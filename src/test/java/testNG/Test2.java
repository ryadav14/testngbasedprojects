package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test2 extends BaseTest{
	@Test
	 public void testLink()throws Exception{
		 getDriver().get("https://twitter.com");
		 WebElement clickSignUp = getDriver().findElement(By.className("StaticLoggedOutHomePage-noSignupForm"));
	      
		 clickSignUp.click();
		 Thread.sleep(2000);
		 WebElement fullName =  getDriver().findElement(By.xpath("//*[@id='full-name']"));
		 fullName.click();
		 fullName.sendKeys("Just another test!");
	        
	    }
}
