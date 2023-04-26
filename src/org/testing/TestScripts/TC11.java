package org.testing.TestScripts;

//import java.sql.Driver;
import java.util.List;
//import java.util.Set;
//import java.util.Set;
//import java.util.List;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testing.Base.Base_class;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.interactions.SendKeysAction;
//import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
public class TC11 extends Base_class
{
    ChromeDriver driver;
       
	@BeforeMethod
	public void Browerlaunch()
	{
   System.setProperty("webdriver.chrome.driver", "../YTFramework/chromedriver.exe");
   ChromeOptions option=new ChromeOptions();
   option.addArguments("--disable-notifications");
   driver=new ChromeDriver(option);
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
	    driver.findElement(By.xpath("//*[@id='passwordNext']/div/button/span")).click();
	    Thread.sleep(5000);
	    System.out.println("click to the next button");
	    driver.findElement(By.xpath(pr.getProperty("next"))).click();
	    List<WebElement > w= driver.findElements(By.xpath("//div[@class='sbsb_a']/ul/li"));
	    System.out.println("total elements in the list are"+w.size());
	    int i=0;
	    for(WebElement s:w)
	    {
	    	if(i==2)
	    s.click();
	    break;
	    }
	    
	    List<WebElement> w2=driver.findElements(By.xpath("//a[@id='video-title']"));
	    System.out.println("total videos"+w2.size());
	    int j=0;
	    for(WebElement s3:w2)
	    {
	    	j=j+1;
	    	if(j==3)
	    	{
	    		s3.click();
	    		String w4=driver.getWindowHandle();
	    	    driver.switchTo().window(w4);
	    	    Thread.sleep(2000);
	    	 
	    	}
	    }  
	    System.out.println("commented on a video");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@id='avatar-btn']")).click();
        Thread.sleep(3000);
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
