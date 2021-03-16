package com.automaation_maven_project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderFirstPage {
	//driver variable initialize
		public WebDriver driver;
	//constructor
		public OrderFirstPage(WebDriver driver1) {
			this.driver=driver1;
			PageFactory.initElements(driver, this);
		}
	//elements
		@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")
		private WebElement checkOutBtn;
		public WebElement getCheckOutBtn() {
			return checkOutBtn;
		}
}
