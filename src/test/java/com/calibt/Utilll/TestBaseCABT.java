package com.calibt.Utilll;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBaseCABT {

	public static Properties prop;
	public static WebDriver driver;

	public TestBaseCABT() {
		try {
			FileInputStream flz = new FileInputStream(System.getProperty("user.dir")
					+ "\\src\\test\\java\\com\\calibt\\configg\\caliconfigree.properties");
			prop = new Properties();
			prop.load(flz);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void initilisee() {
		String Browsername = prop.getProperty("browserC1");
		if (Browsername.equals("Chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\driverr\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(UtilityCABT.implicitlyWait_wait, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(UtilityCABT.pageLoadTimeout_wait, TimeUnit.SECONDS);

		} else if (Browsername.equals("FF"))
			;

	}

	public static void launchhh(String URL) {
		driver.get(prop.getProperty("CBT_url_QA"));
	}
}