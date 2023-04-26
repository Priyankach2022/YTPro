package org.testing.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;


public class ScreenShotCapture
{
  public static void takeScreenshot(ChromeDriver driver, String path) throws IOException
  {
	File screenshotsource= driver.getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(screenshotsource, new File(path));
  }
}
