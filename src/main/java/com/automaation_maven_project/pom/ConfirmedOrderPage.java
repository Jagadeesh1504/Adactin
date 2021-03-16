package com.automaation_maven_project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmedOrderPage {
//driver variable initialize
	public WebDriver driver;
//constructor
	public ConfirmedOrderPage(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
//elements
	@FindBy(id="center_column")
	private WebElement centerColumn;
	public WebElement getCenterColumn() {
		return centerColumn;
	}
	@FindBy(xpath="//a[@title='Back to orders']")
	private WebElement backToOrders;
	public WebElement getBackToOrders() {
		return backToOrders;
	}

}

