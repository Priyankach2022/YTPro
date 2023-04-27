
package org.testing.Base;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_class
{
	public ChromeDriver driver;
	public Properties pr;
	    
	   
		@BeforeMethod
		public void Browerlaunch() throws IOException
		{
	   System.setProperty("webdriver.chrome.driver", "../YTFramework/chromedriver.exe");
	   ChromeOptions option=new ChromeOptions();
	   java.io.File f=new java.io.File("../YTFramework/Objects.properties");
	   FileReader fr=new FileReader(f);
	   pr=new Properties();  
	   pr.load(fr);
	   
	   option.addArguments("--disable-notifications");
	   driver=new ChromeDriver(option);
	   driver.get("https://www.youtube.com");
	   driver.manage().window().maximize();
	}
		@AfterMethod
		public void Browserclose()
		{
			driver.close();
		}
}
