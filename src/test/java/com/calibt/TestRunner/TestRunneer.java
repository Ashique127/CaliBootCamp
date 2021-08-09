package com.calibt.TestRunner;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import com.calibt.Utilll.TestBaseCABT;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = { "src/test/resources/Featureess" }, plugin = {
		"json:target/cucumber.json" }, glue = "stepdefinationcalibt", tags = { "@SearchCABT, @Login" })

public class TestRunneer extends AbstractTestNGCucumberTests {

	@BeforeTest

	public void LaunchAppURL() {
		TestBaseCABT Launnch = new TestBaseCABT();
		Launnch.initilisee();
	}

	@AfterTest

	public void CloseAppURL() {
		TestBaseCABT Launnch = new TestBaseCABT();
		Launnch.driver.quit();
	}

}
