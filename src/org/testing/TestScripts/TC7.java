package org.testing.TestScripts;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.Base_class;
import org.testing.pages.HomePage;
import org.testing.pages.Login;
import org.testing.pages.Logout;
import org.testng.annotations.Test;
public class TC7 extends Base_class
{
   
	@Test
	public void test() throws InterruptedException
	{
		Login login=new Login(driver, pr);
        login.SignIn("gitajjhdh5662@gmail.com", "priyanka@123456789");
        Thread.sleep(2000);
        
	   List<WebElement> vi= driver.findElements(By.xpath("//*[@id='video-title']"));
	   System.out.println("total videos....."+vi.size());
	   HomePage homepage= new HomePage(driver, pr);
	   for(WebElement video:vi)
	      {
	       video.click();
	       Thread.sleep(2000);
	       homepage.Click_On_VideoAndLike();
		   Thread.sleep(2000);
	       break;
	      }
	  
	    System.out.println("clicked on videos and liked");
        Logout logout=new Logout(driver, pr);
        logout.Signout();
        System.out.println("signed out youtube");
        Thread.sleep(2000);
		}
	
}
