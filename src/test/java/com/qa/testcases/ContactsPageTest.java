package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.ContactsPage;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class ContactsPageTest extends TestBase {
	LoginPage loginPage;
	HomePage homePage;
	ContactsPage contactsPage;
	
	
	public ContactsPageTest(){
		super();
	}
	
@BeforeMethod
public void setUp() throws InterruptedException {
	initialization();
	contactsPage=new ContactsPage();
	loginPage=new LoginPage();
	homePage=loginPage.login(prop.getProperty("emailaddress"),prop.getProperty("password"));
	contactsPage=homePage.clickOnContactsLink();
	
}


@Test(priority=1)
public void verifyNewContactLabelTest() {
	Assert.assertTrue(contactsPage.verifyNewContactLabel(),"contacts label is missing on the page");
}


@Test(priority=2)
public void verifyclickOnNewContactLink() {
	contactsPage.clickOnNewContactLink();
}


@Test(priority=3)
public void verifycreateNewContact() throws InterruptedException {
	homePage.clickOnContactsLink();
	
	contactsPage.clickOnNewContactLink();
	contactsPage.createNewContact("Harish","chandra");
}




	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	

}
