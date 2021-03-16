package com.automaation_maven_project.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CasualDresses {
//Variables
public WebDriver driver;
//Constructor
public CasualDresses(WebDriver driver1) {
		this.driver=driver1;
		PageFactory.initElements(driver, this);
	}
//elements
@FindBy(xpath="//img[@alt='Printed Dress']")
private WebElement printedDresses;
public WebElement getPrintedDresses() {
	return printedDresses;
}
@FindBy(xpath="//a[@class='quick-view']")
private WebElement quickView;
public WebElement getQuickView() {
	return quickView;
}
@FindBy(xpath="//iframe[contains(@class,'fancybox-iframe')]")
private WebElement frame;
public WebElement getFrame() {
	return frame;
}
@FindBy(xpath="//input[@id='quantity_wanted']")
private WebElement quantityTxtBox;
public WebElement getQuantityTxtBox() {
	return quantityTxtBox;
}
@FindBy(id="group_1")
private WebElement size;
public WebElement getSize() {
	return size;
}
@FindBy(id="wishlist_button")
private WebElement wishList;
public WebElement getWishList() {
	return wishList;
}
@FindBy(xpath="//button[@name='Submit']")
private WebElement addToCart;
public WebElement getAddToCart() {
	return addToCart;
}
@FindBy(xpath="//body[@id='category']/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/span/span")
private WebElement continueBtn;
public WebElement getContinueBtn() {
	return continueBtn;
}
@FindBy(xpath="//body[@id='category']/div/div[1]/header/div[3]/div/div/div[3]/div/a")
private WebElement cart;
public WebElement getCart() {
	return cart;
}
@FindBy(xpath="//body[@id='category']/div/div[1]/header/div[3]/div/div/div[3]/div/div/div/div/p[2]/a/span")
private WebElement checkOut;
public WebElement getCheckOut() {
	return checkOut;
}


}
