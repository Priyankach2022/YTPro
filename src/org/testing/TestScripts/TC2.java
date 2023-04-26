package org.testing.TestScripts;

import org.testing.Base.Base_class;
import org.testing.pages.HomePage;
import org.testing.pages.Login;
import org.testing.pages.Logout;
import org.testng.annotations.Test;

public class TC2 extends Base_class
{
   
	@Test
	public void test() throws InterruptedException
	{	    
		 Login login=new Login(driver, pr);
	     login.SignIn("gitajjhdh5662@gmail.com", "priyanka@123456789");
	     Thread.sleep(2000);
	        
	      HomePage homepage=new HomePage(driver, pr);
	   homepage.Click_History();
	    
	    System.out.println("click on history");
        Thread.sleep(5000);
        Logout logout=new Logout(driver, pr);
        logout.Signout();
          System.out.println("signed out youtube");
        Thread.sleep(2000);
		}
	
}
