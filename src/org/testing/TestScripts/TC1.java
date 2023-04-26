package org.testing.TestScripts;

import java.io.IOException;

import org.tesing.assertions.Assesrtion;
import org.testing.Base.Base_class;
import org.testing.pages.HomePage;
import org.testing.pages.Login;
import org.testing.pages.Logout;
import org.testing.utilities.ExtentReport;
import org.testing.utilities.LogCapture;
import org.testing.utilities.ScreenShotCapture;
//import org.testng.Assert; 	
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class TC1  extends Base_class
{
  
	@Test
	public void test() throws InterruptedException, IOException
	{
		ExtentReports rp= ExtentReport.report();
		ExtentTest test1= rp.startTest("Testcase1");
		
		String expectedurl="https://www.youtube.com";
		 Login login=new Login(driver, pr);
		 LogCapture.takelogs("TC1", "browser open sucessfully");

	     login.SignIn("gitajjhdh5662@gmail.com", "priyanka@123456789");
		 Thread.sleep(5000);
		 Assesrtion.Assert(expectedurl, driver.getCurrentUrl());
		 
		// Assert.assertEquals(driver.getCurrentUrl(), expectedurl,"assertion has been failed");
		 ScreenShotCapture.takeScreenshot(driver, "C://Users//DELL//Downloads//first.png");
		 LogCapture.takelogs("TC1", "login successfully");
         HomePage homepage=new HomePage(driver, pr);
         
        String st= "https://www.youtube.com";
        if(st==driver.getCurrentUrl())
         {
        	 test1.log(LogStatus.PASS, "Status Code is matching with the expected status code");
         }
         else
         {
        	 test1.log(LogStatus.FAIL, "Test Failed");
         }
         
         rp.endTest(test1);
         rp.flush();
         
         homepage.Click_Trending();
		System.out.println("click to the trending");
        Thread.sleep(1000);
        Logout logout=new Logout(driver, pr);
        logout.Signout();
        System.out.println("signed out youtube");
        Thread.sleep(2000);
		}
	
}
