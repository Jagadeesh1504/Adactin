package com.automaation_maven_project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

//driver variable initialize
	public WebDriver driver;
//constructor	
	public LoginPage(WebDriver driver1) {
	this.driver=driver1;
	PageFactory.initElements(driver, this);
	}
//elements	
	@FindBy(id="email")
	private WebElement email;
	public WebElement getEmail() {
		return email;
	}

	@FindBy(id="passwd")
	private WebElement password;
	public WebElement getPassword() {
		return password;
	}

	@FindBy(xpath="//button[@id='SubmitLogin']")
	private WebElement submit_btn;
	public WebElement getSubmit_btn() {
		return submit_btn;
	}

}
