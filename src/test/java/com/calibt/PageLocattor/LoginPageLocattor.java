package com.calibt.PageLocattor;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.calibt.Utilll.TestBaseCABT;

public class LoginPageLocattor extends TestBaseCABT {

	public LoginPageLocattor() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.ID, using = "ap_email")
	public WebElement Email;

	@FindBy(how = How.ID, using = "continue")
	public WebElement Clickcontinue;

	@FindBy(how = How.ID, using = "ap_password")
	public WebElement Password;

	@FindBy(how = How.ID, using = "signInSubmit")
	public WebElement Signinbutton;

	@FindBy(how = How.XPATH, using = "//span[text()='Ashequr']")
	public WebElement Verifysigninpage;

}
