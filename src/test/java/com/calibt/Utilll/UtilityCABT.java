package com.calibt.Utilll;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class UtilityCABT {
	public static long implicitlyWait_wait = 30;
	public static long pageLoadTimeout_wait = 30;

	public static String Cell = "Phone";
	public static String TV = "Sony";

	public static void takescreenshot(WebDriver driver, String screenshot) {

		File srcfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		String correntdir = System.getProperty("user.dir");
		try {
			FileUtils.copyFile(srcfile, new File(correntdir + "/ScreenShotss/" + screenshot + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
