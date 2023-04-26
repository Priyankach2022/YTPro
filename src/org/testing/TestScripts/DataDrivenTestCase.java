package org.testing.TestScripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class DataDrivenTestCase
{
	public static void main(String[] args)
	{
		ChromeDriver driver= new ChromeDriver();  // code for java scripted pop ups
		Alert al=driver.switchTo().alert();
		al.accept();
		al.dismiss();
		al.sendKeys("prianka");
	}
	 
	@Test(dataProvider="dp2")
	public void testcase(String user, String password)
	{
		System.out.println("username is :"+user);
		System.out.println("password is :"+password);
	}
	
	
@DataProvider
public Object[][] Dp1()
{
	Object[][] ob=new Object[2][2];
	ob[0][0]="username1";
	ob[0][1]="password1";
	ob[1][0]="username2";
	ob[1][1]="password2";
	return ob;
	
}
@DataProvider
public Object[][] dp2() throws BiffException, IOException
{
	File f=new File("../YTFramework/pc2.xls");
	Workbook wk=Workbook.getWorkbook(f);
	Sheet s=wk.getSheet(0);
	int r=s.getRows();
	int c=s.getColumns();
	Object[][] ob=new Object[r][c];
	 for(int i=0;i<r;i++)
	 {
		 for(int j=0;j<c;j++)
		 {
			 Cell c1=s.getCell(j, i);
			 ob[i][j]=c1.getContents();
		 }
	 }
	return ob;
	
}
@Test(groups="smoke")
public void Tc1()
{
	System.out.println("smoke test");
}
@Test(groups="smoke")
public void Tc2()
{
	System.out.println("smoke test");
}
@Test(groups="smoke")
public void Tc3()
{
	System.out.println("smoke test");
}
@Test(groups="smoke")
public void Tc4()
{
	System.out.println("sanity test");
}
public void Tc5()
{
	System.out.println("sanity test");
}
public void Tc6()
{
	System.out.println("sanity test");
}
@Parameters({"Browser","url"})
@Test(groups="smoke")
public void tc7(String browser, String url)
{
	System.out.println("browser name is"+browser);
	System.out.println("browser name is"+url);
}
}
