package com.automaation_maven_project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmOrderPage {
//driver variable initialize
	public WebDriver driver;
//constructor
	public ConfirmOrderPage(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
//elements
	@FindBy(xpath="(//button[@type='submit'])[2]")
	private WebElement confirmBtn;
	public WebElement getConfirmBtn() {
		return confirmBtn;
	}

}

