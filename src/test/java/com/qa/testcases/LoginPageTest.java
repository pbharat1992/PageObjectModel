package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;
import com.qa.pages.SignUpPage;

public class LoginPageTest extends TestBase {

	 LoginPage loginPage;
	 HomePage homePage;
	 SignUpPage signUpPage;
	 
	public LoginPageTest() {
		super();
		
	}
	

@BeforeMethod
public void setUp() {
	initialization();
	 loginPage=new LoginPage();
     homePage=new HomePage();
     signUpPage=new SignUpPage();
}



@Test(priority=1)
public void loginPageTitleTest() {
	String title=loginPage.validateLoginPageTitle();
	Assert.assertEquals(title,"Free CRM #1 cloud software for any business large or small");
	
}

@Test(priority=2)
public void loginTest() throws InterruptedException {
	loginPage.login(prop.getProperty("emailaddress"),prop.getProperty("password"));
}



@Test(priority=3)
public void signUpPageTest() {
	loginPage.signUpBtn();
}




@AfterMethod
public void tearDown() {
	driver.quit();
}








}
