package com.vtiger.test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.actitime.pom.LoginPage;

    public class CreateUser {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		LoginPage l=new LoginPage(driver);
		l.setuser("admin1", "manager1");
		Thread.sleep(3000);
		l.setuser("admin2", "manager2");
		Thread.sleep(3000);
		l.setuser("admin", "manager");
	}

}
