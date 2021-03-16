package com.automaation_maven_project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderThirdPage {
//driver variable initialize
	public WebDriver driver;
//constructor
	public OrderThirdPage(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
//elements
	@FindBy(xpath="//input[@type='checkbox']")
	private WebElement checkBox;
	public WebElement getCheckBox() {
		return checkBox;
	}
	@FindBy(xpath="//button[@name='processCarrier']")
	private WebElement checkOutBtn;
	public WebElement getCheckOutBtn() {
		return checkOutBtn;
	}
}
