package org.testing.TestScripts;

import java.util.List;
//import java.util.Set;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testing.Base.Base_class;
import org.testing.pages.HomePage;
import org.testing.pages.Login;
import org.testing.pages.Logout;
import org.testng.annotations.Test;
public class TC9 extends Base_class
{
	@Test
	public void test() throws InterruptedException
	{
		 Login login=new Login(driver, pr);
	     login.SignIn("gitajjhdh5662@gmail.com", "priyanka@123456789");
	     Thread.sleep(2000);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    List<WebElement> vi= driver.findElements(By.xpath("//*[@id='video-title']"));
	    System.out.println("total videos....."+vi.size());
		HomePage homepage= new HomePage(driver, pr);

	   for(WebElement video:vi)
	      {
	       video.click();
	       Thread.sleep(5000);
		   System.out.println("go to comment section");
		   js.executeScript("window.scrollBy(0,400)");
		   Thread.sleep(5000);
		   homepage.Comment_On_Video();
		  break;
	     }
	   
	    System.out.println("commented on a video");
        Thread.sleep(5000);
        Logout logout=new Logout(driver, pr);
        logout.Signout();
        System.out.println("signed out youtube");
        Thread.sleep(2000);
		}
	
}
