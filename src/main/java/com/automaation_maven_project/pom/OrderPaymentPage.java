package com.automaation_maven_project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPaymentPage {
//driver variable initialize
	public WebDriver driver;
//constructor
	public OrderPaymentPage(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
//elements
	@FindBy(xpath="//a[@title='Pay by bank wire']")
	private WebElement bankWire;
	public WebElement getBankWire() {
		return bankWire;
	}
	@FindBy(xpath="//a[@title='Pay by check.']")
	private WebElement cheque;
	public WebElement getCheque() {
		return cheque;
	}
}
