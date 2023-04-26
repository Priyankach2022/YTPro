package org.testing.TestScripts;

//import java.util.List;
import java.util.Set;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.SendKeysAction;
import org.testing.Base.Base_class;
//import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC6 extends Base_class
{
    ChromeDriver driver;
    
   
	@BeforeMethod
	public void Browerlaunch()
	{
	System.setProperty("webdriver.chrome.driver", "../YTFramework/chromedriver.exe");
  driver=new ChromeDriver();
   driver.get("https://www.youtube.com");
   driver.manage().window().maximize();
}
	@Test
	public void test() throws InterruptedException
	{
		WebElement signIn=driver.findElement(By.xpath(pr.getProperty("loginbutton")));
		//Actions ac=new Actions(driver);
		signIn.click();
		System.out.println("click to the next button");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector(pr.getProperty("username"))).sendKeys("gitajjhdh5662@gmail.com");
	    System.out.println("enter gmail id");	
		driver.findElement(By.xpath(pr.getProperty("click"))).click();
		Thread.sleep(5000);
	    WebElement password=driver.findElement(By.xpath(pr.getProperty("password")));
		Thread.sleep(5000);
	    password.sendKeys("priyanka@123456789");
	    System.out.println("password is entered");
	    Thread.sleep(5000);
	    driver.findElement(By.xpath(pr.getProperty("next"))).click();
	    Thread.sleep(5000);
	    System.out.println("click to the next button");
        Thread.sleep(2000);
	    driver.findElement(By.xpath("//a/tp-yt-paper-item/yt-formatted-string[text()='Your videos']")).click();
	   // String currentTab= driver.getWindowHandle();
	   Set<String> videos= driver.getWindowHandles();
	    System.out.println("total tabs....."+videos.size());
		 System.out.println("before url is........."+driver.getCurrentUrl());
      
		for(String s:videos)
		{   
			
			driver.switchTo().window(s);
			break;
		
		}
	    
	    System.out.println("click on your videos");
        Thread.sleep(5000);
       driver.findElement(By.xpath("//button[@id='avatar-btn']")).click();
       Thread.sleep(5000);
        WebElement signout=driver.findElement(By.xpath("//yt-formatted-string[text()='Sign out']"));
        signout.click();
        System.out.println("signed out youtube");
        Thread.sleep(2000);
		}
	
	@AfterMethod
	public void Browserclose()
	{
		driver.close();
	}
}
