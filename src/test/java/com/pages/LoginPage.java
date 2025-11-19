package com.pages;

import com.base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LoginPage extends BasePage {

	@FindBy(xpath = "//input[@name='username']")
	private WebElement usernameField;
	@FindBy(xpath = "//input[@name='password']")
	private WebElement passwordField;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginButton;
	@FindBy(xpath = "//div[@class='oxd-alert-content oxd-alert-content--error']")
	private WebElement loginError;
	@FindBy(xpath = "//div[@class='oxd-topbar-header']")
	private WebElement dashboard;
	
	
	

	public void enterUsername(String un) {
		type(usernameField, un); 
		}
	public void enterPassword(String pwd) { 
		type(passwordField, pwd);
		}
	public void clickLogin() { 
		click(loginButton); 
		}
	public String getLoginError() {
		return getText(loginError);
		}
	public String getDashboard() {
		return getText(dashboard);
		}
	
	
	
}