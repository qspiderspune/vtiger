package com.actitime.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
@FindBy(name="username")
private WebElement untx;
@FindBy(name="pwd")
private WebElement pwd;
@FindBy(xpath="//div[text()='Login ']")
private WebElement LBtn;
public LoginPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}
public void setuser(String username,String password) {
	untx.sendKeys(username);
	pwd.sendKeys(password);
	LBtn.click();
}
}
