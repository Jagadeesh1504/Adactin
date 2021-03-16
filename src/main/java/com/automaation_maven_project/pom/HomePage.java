package com.automaation_maven_project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
//driver variable initialize
	public WebDriver driver;
//constructor
	public HomePage(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
//elements
	@FindBy(xpath="//a[@class='login']")
	private WebElement signin_Btn;
	public WebElement getSignin_Btn() {
		return signin_Btn;
	}
	

}
