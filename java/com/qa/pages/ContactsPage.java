package com.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.qa.base.TestBase;

public class ContactsPage extends TestBase {


	
	
	@FindBy(xpath="//a//button[@class='ui linkedin button']")
	WebElement newContact;
	
	@FindBy(xpath="//input[@name='first_name']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@name='last_name']")
	WebElement lastName;
	
	@FindBy(xpath="//input[@name='value' and @type='text']")
	WebElement emailId;
	
	
	@FindBy(xpath="//div[@class='ui header item mb5 light-black']")
	WebElement newContactLabel;
	
	
	@FindBy(xpath="//button[@class='ui linkedin button']")
	WebElement saveBtn;

	
	
	public ContactsPage() {
		PageFactory.initElements(driver,this);
	}
	
	
	
	public void clickOnNewContactLink() {
		newContact.click();
	}
	
	
	
	public boolean verifyNewContactLabel() {
		return newContactLabel.isDisplayed();
	}
	
	
	public void createNewContact(String ftName,String ltName) throws InterruptedException {
		firstName.sendKeys(ftName);
		lastName.sendKeys(ltName);
		saveBtn.click();
	}
	
	
	
	
	
	
}
