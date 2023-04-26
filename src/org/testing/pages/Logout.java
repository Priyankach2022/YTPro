package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logout
{
	ChromeDriver driver;
	Properties pr;
	
   public Logout(ChromeDriver driver, Properties pr)
   {
	   this.driver=driver;
	   this.pr=	pr;   
   }
	public void Signout( ) throws InterruptedException
	{  
		driver.findElement(By.xpath(pr.getProperty("avtar"))).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(pr.getProperty("logout"))).click();
     
}
}
