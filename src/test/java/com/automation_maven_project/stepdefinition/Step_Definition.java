package com.automation_maven_project.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.automaation_maven_project.pom.HomePage;
import com.automaation_maven_project.pom.LoginPage;
import com.automation_maven_project.baseclass.Base_Class;
import com.automation_maven_project.runner.Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_Class{
//driver initialize	driver from runner
	public static WebDriver driver=Runner.driver;
//Objects for Pom classes
	HomePage home=new HomePage(driver);
	LoginPage login=new LoginPage(driver);
	
	@Given("^User Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		getUrl("http://automationpractice.com/index.php");
	    
	}
    @When("^User Clicks SignIn Button$")
	public void user_Clicks_SignIn_Button() throws Throwable {
		 clickOnElement(home.getSignin_Btn());
	}
	@When("^User Gives Input To UserName Field$")
	public void user_Gives_Input_To_UserName_Field() throws Throwable {
	    inputValueElement(login.getEmail(), "jagadeeshautomationtester@gmail.com");
	}
    @When("^User Gives Input To Password Field$")
	public void user_Gives_Input_To_Password_Field() throws Throwable {
	 inputValueElement(login.getPassword(), "12345");
	}
	@Then("^User Clicks SignIn Button and It Navigates To Next Page$")
	public void user_Clicks_SignIn_Button_and_It_Navigates_To_Next_Page() throws Throwable {
		 clickOnElement(login.getSubmit_btn());
		   sleep(2000);
	}

}
