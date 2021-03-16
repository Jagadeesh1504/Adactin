package com.automaation_maven_project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderHistory {
//driver variable initialize
	public WebDriver driver;
//constructor
	public OrderHistory(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
//elements
	@FindBy(xpath="//div[@id='center_column']")
	private WebElement centerColumn;
	public WebElement getCenterColumn() {
		return centerColumn;
	}
}

