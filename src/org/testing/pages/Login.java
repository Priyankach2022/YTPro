package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login 
{
	ChromeDriver driver;
	Properties pr;
	
   public Login(ChromeDriver driver, Properties pr)
   {
	   this.driver=driver;
	   this.pr=	pr;   
   }
	public void SignIn( String username, String password) throws InterruptedException
	{   String s=username;
	    String p=password;
		driver.findElement(By.xpath(pr.getProperty("loginbutton"))).click();
		driver.findElement(By.cssSelector(pr.getProperty("username"))).sendKeys(s);
		Thread.sleep(1000);
		driver.findElement(By.xpath(pr.getProperty("click"))).click();
		Thread.sleep(5000);
        driver.findElement(By.xpath(pr.getProperty("password"))).sendKeys(p);
        Thread.sleep(2000);
	    driver.findElement(By.xpath(pr.getProperty("next"))).click();


}
}
