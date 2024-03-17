package shopify.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import shopify.utils.SeWrappers;

public class FreeTrial1page extends SeWrappers{
	
	@FindBy(xpath="(//a[text()='Start free trial'])[1]")
	public WebElement ft;
	
	@FindBy(id="account_email")
	public WebElement mail;
	
	@FindBy(xpath="//span[text()='Continue with email']")
	public WebElement con;
	
	
	public void freeTrial()
	{
		waitForElement(ft,20);
		actionsClick(ft);
		
	}
	
	public void typeMail(String id)
	{
		waitForElement(mail,20);
		typeText(mail,id);
	}
	
	public void continuewithMail()
	{
		waitForElement(con,20);
		clickElement(mail);
	}

}
