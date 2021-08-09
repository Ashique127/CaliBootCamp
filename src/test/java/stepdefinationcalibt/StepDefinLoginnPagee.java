package stepdefinationcalibt;

import com.calibt.PaggeActionn.HomeepageAction;
import com.calibt.PaggeActionn.LoginPaggeAction;
import com.calibt.Utilll.TestBaseCABT;

import cucumber.api.java.en.Then;

public class StepDefinLoginnPagee extends TestBaseCABT {
	HomeepageAction homeepageAction = new HomeepageAction();
	LoginPaggeAction loginPaggeAction = new LoginPaggeAction();

	@Then("^click on signin button$")
	public void click_on_signin_button() throws Throwable {
		homeepageAction.ClickonSigninButton();
	}

	@Then("^user enter username and password and click on signin$")
	public void user_enter_username_and_password_and_click_on_signin() throws Throwable {
		loginPaggeAction.usercard(prop.getProperty("mrtid"), prop.getProperty("mrtpass"));
	}

	@Then("^verify user can signin and in his own profile page$")
	public void verify_user_can_signin_and_in_his_own_profile_page() throws Throwable {
		loginPaggeAction.Verifyusercansignin();
	}

}
