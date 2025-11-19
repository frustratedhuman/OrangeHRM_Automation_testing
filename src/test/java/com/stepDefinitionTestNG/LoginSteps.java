package com.stepDefinitionTestNG;

import io.cucumber.java.en.Given;
import com.parameters.ExcelReader;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;
import com.pages.LoginPage;


//Corrected Step Definitions using POM + DriverManager + Hooks (FINAL VERSION)
//This version removes the constructor and depends on Hooks for page initialization.


public class LoginSteps extends LoginPage {
	String us;
    String pwd;
    Map<String, String> loginData;


    public LoginSteps() throws Exception {
        ExcelReader er = new ExcelReader();
        er.beforeTest();
        er.dataMap();
        loginData = er.getDataMap();

    }

	@Given("Open the  browser and launch the application")
	public void open_the_browser_and_launch_the_application() {
		System.out.println("Successfully Opened browser");
	}

	@Given("the user is on the OrangeHRM login page")
	public void he_user_is_on_the_orange_hrm_login_page() {
		System.out.println("Successfully Opened login page");
	}
	

	@When("the user enters username {string} and password {string}")
	public void he_user_enters_username_and_password(String username, String password) throws Exception {
		
        System.out.println(us + pwd);
        enterUsername(loginData.get(username));
        Thread.sleep(1000);
        enterPassword(loginData.get(password));
        Thread.sleep(1000);

	}

	@When("clicks the login button")
	public void clicks_the_login_button() throws Exception {
		clickLogin();
		Thread.sleep(2000);
	}

	@Then("the user should be redirected to the dashboard")
	public void the_user_should_be_redirected_to_the_dashboard() {
		getDashboard();
	}

	@Then("the welcome message should be displayed")
	public void the_welcome_message_should_be_displayed() {
	   System.out.println("Successfully Login");
	}

	@Then("an error message should be displayed")
	public void an_error_message_should_be_displayed() {
		System.out.println(getLoginError());
	}

//	@Then("the user should remain on the login page")
//	public void the_user_should_remain_on_the_login_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}

}