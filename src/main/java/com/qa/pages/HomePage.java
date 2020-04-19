package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.base.TestBase;

public class HomePage extends TestBase {

	
	@FindBy(xpath="//span[contains(text(),'PANUGANTI BHARAT KUMAR CHARI')]")
	WebElement userNameLabel;
	
	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement contactsLink;
	
	@FindBy(xpath="//span[contains(text(),'Deals')]")
	WebElement dealsLink;
	
	@FindBy(xpath="//span[contains(text(),'Tasks')]")
    WebElement tasksLink;
	
	@FindBy(xpath="//span[contains(text(),'Calendar')]")
	WebElement calenderLink;
	
	@FindBy(xpath="//span[contains(text(),'Cases')]")
	WebElement casesLink;
	
	
	public HomePage() {
	   PageFactory.initElements(driver,this);
		
	}
	
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	

	
	public boolean verifyUserNameLabel() {
		
		return userNameLabel.isDisplayed();
	}
	public ContactsPage clickOnContactsLink() {
		contactsLink.click();
		return new ContactsPage();
	}
	
	
	
	
	public DealsPage clickOnDealsLink() {
		dealsLink.click();
		return new DealsPage();
	}
	
	
	public CalenderPage clickOnCalenderLink() {
		calenderLink.click();
		return new CalenderPage();
	}
	public TasksPage clickOnTasksLink() {
		tasksLink.click();
		return new TasksPage();
	}
	public CasesPage clickOnCasesLink() {
		casesLink.click();
		return new CasesPage();
	}
	
	
}
