package stepdefinationcalibt;

import org.apache.log4j.Logger;

import com.calibt.PaggeActionn.HomeepageAction;
import com.calibt.Utilll.LogsHelpper_Logg;
import com.calibt.Utilll.TestBaseCABT;
import com.calibt.Utilll.UtilityCABT;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefHomeePagee extends TestBaseCABT {

	HomeepageAction homeepageAction = new HomeepageAction();
	Logger logz = LogsHelpper_Logg.getLogss(LogsHelpper_Logg.class);

	@Given("^open application \"([^\"]*)\"$")
	public void open_application(String URL) throws Throwable {
		launchhh(URL);
		UtilityCABT.takescreenshot(driver, "Home Page");
		logz.info("Opening URL ");
	}

	@Then("^open amazon home page and customer is on home page$")
	public void open_amazon_home_page_and_customer_is_on_home_page() throws Throwable {
		homeepageAction.AmazonHomepage();
		UtilityCABT.takescreenshot(driver, "Amazom Home Page");
		logz.info("Home Page");
	}

	@Then("^Enter a product name Phone$")
	public void enter_a_product_name_Phone() throws Throwable {
		homeepageAction.EnteraproductnamePhone();
		logz.info("Phone");
	}

	@Then("^Click on search Box$")
	public void click_on_search_Box() throws Throwable {
		homeepageAction.Clickonsearchbox();
		logz.info("Search");
	}

	@Then("^Search for Samsung and Click$")
	public void search_for_Samsung_and_Click() throws Throwable {
		homeepageAction.SearchforSamsungandclick();
		UtilityCABT.takescreenshot(driver, "Search for Samsung");
		logz.info("Samsung");
	}

	@Then("^Verify Samsung Galaxy S(\\d+)$")
	public void verify_Samsung_Galaxy_S(int arg1) throws Throwable {
		homeepageAction.VerifySamsungGalaxyS10();
		UtilityCABT.takescreenshot(driver, "GalaxyS10");
	}

}
