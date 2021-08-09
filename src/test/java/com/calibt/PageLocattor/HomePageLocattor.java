package com.calibt.PageLocattor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.calibt.Utilll.TestBaseCABT;

public class HomePageLocattor extends TestBaseCABT {

	public HomePageLocattor() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using = "//a[@id='nav-logo-sprites']")
	public WebElement Customeronhomepage;

	@FindBy(how = How.ID, using = "twotabsearchtextbox")
	public WebElement Enteraproductname;

	@FindBy(how = How.XPATH, using = "//input[@id='nav-search-submit-button']")
	public WebElement Clickonsearchbox;

	@FindBy(how = How.XPATH, using = "//span[text()='SAMSUNG']")
	public WebElement SearchforSamsung;

	@FindBy(how = How.XPATH, using = "//img[@alt='Samsung Galaxy S10, 128GB, Prism White - Fully Unlocked (Renewed)']")
	public WebElement VerifySamsungGalaxy;
	@FindBy(how = How.XPATH, using = "//span[text()='Hello, Sign in']")
	public WebElement Clicksigninbutton;

}
