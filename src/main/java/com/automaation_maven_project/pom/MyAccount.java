package com.automaation_maven_project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccount {
//variable
	public WebDriver driver;
//constructor
	public MyAccount(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}
//elements	
	@FindBy(xpath="//a[@title='Women']")
	private WebElement women;
	public WebElement getWomen() {
		return women;
	}
	
	@FindBy(xpath="(//a[@title='Casual Dresses'])[1]")
	private WebElement casualDresses;
	public WebElement getCasualDresses() {
		return casualDresses;
	}
	@FindBy(xpath="(//a[@title='Evening Dresses'])[1]")
	private WebElement eveningDresses;
	public WebElement getEveningDresses() {
		return eveningDresses;
	}
	

}
