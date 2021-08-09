package com.calibt.PaggeActionn;

import com.calibt.PageLocattor.LoginPageLocattor;
import com.calibt.Utilll.TestBaseCABT;

import junit.framework.Assert;

public class LoginPaggeAction extends TestBaseCABT {
	LoginPageLocattor loginPageLocattor = new LoginPageLocattor();

	public void usercard(String u, String p) {
		loginPageLocattor.Email.sendKeys(u);
		loginPageLocattor.Clickcontinue.click();
		loginPageLocattor.Password.sendKeys(p);
		loginPageLocattor.Signinbutton.click();
	}

	public void Verifyusercansignin() {
		boolean Result = loginPageLocattor.Verifysigninpage.isDisplayed();
		Assert.assertTrue(Result);
	}

}
