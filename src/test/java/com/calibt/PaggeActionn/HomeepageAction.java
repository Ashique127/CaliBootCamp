package com.calibt.PaggeActionn;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import com.calibt.PageLocattor.HomePageLocattor;
import com.calibt.Utilll.TestBaseCABT;
import com.calibt.Utilll.UtilityCABT;

public class HomeepageAction extends TestBaseCABT {

	HomePageLocattor homePageLocattor = new HomePageLocattor();

	public void AmazonHomepage() {
		boolean homepage = homePageLocattor.Customeronhomepage.isDisplayed();
		Assert.assertTrue(homepage);
	}

	public void EnteraproductnamePhone() {
		homePageLocattor.Enteraproductname.sendKeys(UtilityCABT.Cell);
	}

	public void Clickonsearchbox() {
		homePageLocattor.Clickonsearchbox.click();
	}

	public void SearchforSamsungandclick() {
		((JavascriptExecutor) driver).executeScript("scroll(0,400)");
		homePageLocattor.SearchforSamsung.click();
	}

	public void VerifySamsungGalaxyS10() {
		boolean Result = homePageLocattor.VerifySamsungGalaxy.isDisplayed();
		Assert.assertTrue(Result);
	}

	public void ClickonSigninButton() {
		homePageLocattor.Clicksigninbutton.click();
	}

}
