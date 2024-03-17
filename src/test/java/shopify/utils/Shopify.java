package shopify.utils;

import org.openqa.selenium.support.PageFactory;

import shopify.pages.FreeTrial1page;

public class Shopify extends SeWrappers{
	
	public void ft1(String id)
	{
	
	FreeTrial1page ft = PageFactory.initElements(driver, FreeTrial1page.class);
	
	ft.freeTrial();
	ft.typeMail(id);
	ft.continuewithMail();
	
	}

}
