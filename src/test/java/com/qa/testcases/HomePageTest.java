package com.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.base.TestBase;
import com.qa.pages.HomePage;
import com.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	
	LoginPage loginPage;
	HomePage homePage;

	
	public HomePageTest() {
		super();
	}
	
	
	
//	TestCases should be seperated-----independent to each other
//	before every test case------- laucn the browser
//	@test---execute test case
//	after each test case---- close the browser
	@BeforeMethod
	public void setUp() throws InterruptedException {
		initialization();
		loginPage=new LoginPage();
		homePage=loginPage.login(prop.getProperty("emailaddress"),prop.getProperty("password"));

	}
	
	
	@Test(priority=1)
	public void verifyHomePageTitleTest() {
	String title=homePage.verifyHomePageTitle();
	Assert.assertEquals(title,"Cogmento CRM","Homepage title not matched");
	}
	
	@Test(priority=2)
	public void clickOnDealsPageLinkTest() {
		homePage.clickOnDealsLink();
	}
    
	@Test(priority=3)
	public void clickOnContactsPageLinkTest() {
		homePage.clickOnContactsLink();
	}
	
	@Test(priority=4)
	public void clickOnCalenderPageLink() {
		homePage.clickOnCalenderLink();
	}
	
	@Test(priority=5)
	public void clickOnTasksPageLink() {
		homePage.clickOnTasksLink();
	}
	
	@Test(priority=6)
	public void clickOnCasesPageLink() {
		homePage.clickOnCasesLink();
	}
	
	@Test(priority=7)
	public void verifyuserNameLabelTest() {
	Assert.assertTrue(homePage.verifyUserNameLabel());
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
}
