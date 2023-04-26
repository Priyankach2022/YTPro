package org.testing.pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage 
{ 
	ChromeDriver driver;
    Properties pr;
 
	public HomePage(ChromeDriver driver, Properties pr)
	{
		this.driver=driver;
		this.pr=pr;
	}
	
	public void Click_Subscribe() throws InterruptedException
	{
		  Thread.sleep(1000);
		  driver.findElement(By.xpath(pr.getProperty("subscribe"))).click();
          Thread.sleep(2000);
	}
	
	public void Click_Trending()
	{
		driver.findElement(By.xpath(pr.getProperty("trending"))).click();
	}
	public void Click_History()
	{
	    driver.findElement(By.xpath(pr.getProperty("histoy"))).click();

	}
	public void Click_Subscriptions()
	{
		driver.findElement(By.xpath(pr.getProperty("subscriptions"))).click();
	}
	public void Click_Watchalater()
	{
		driver.findElement(By.xpath(pr.getProperty("watch_later"))).click();
	}
	public void Click_library()
	{
	    driver.findElement(By.xpath(pr.getProperty("library"))).click();

	}
	public void Click_On_VideoAndLike()
	{
		driver.findElement(By.xpath(pr.getProperty("like"))).click();

	}
	public void Comment_On_Video() throws InterruptedException
	{
          driver.findElement(By.id(pr.getProperty("placeCursor_On_CommentBox"))).click();
          Thread.sleep(2000);
		  driver.findElement(By.xpath(pr.getProperty("comment"))).sendKeys("nice video");
		  Thread.sleep(1000);
		  driver.findElement(By.xpath(pr.getProperty("submit_comment"))).click();
		  Thread.sleep(2000);

	}
	public void Auto_Suggestion() throws InterruptedException
	{
		   driver.findElement(By.xpath(pr.getProperty("Click_On_searchBox"))).click();
		   Thread.sleep(2000);
		   driver.findElement(By.xpath(pr.getProperty("search"))).sendKeys("priyanka Chopra");
		   Thread.sleep(2000);
		   driver.findElement(By.xpath(pr.getProperty("click_On_Search"))).click();
		   Thread.sleep(2000);
		   driver.findElement(By.xpath(pr.getProperty("click_On_Video"))).click();
	       Thread.sleep(2000);
	       driver.findElement(By.xpath(pr.getProperty("click_On_likeButton"))).click();
	       Thread.sleep(2000);
		

	}
}
