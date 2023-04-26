package org.testing.utilities;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentReport 
{ public static ExtentReports reports;
	public static ExtentReports report()
	{
	  reports = new ExtentReports("../YTFramework",false);
	  return reports;
}
}
