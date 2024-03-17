package shopify.tests;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import shopify.utils.Reports;
import shopify.utils.SeWrappers;
import shopify.utils.Shopify;

public class FreeTrial1test extends SeWrappers{
	
	@BeforeTest
	public void login()
	{
		excelfile ="";
		sheet2 = "sheet2";
	}
	
	Shopify bb = new Shopify();
	Reports report = new Reports();
	
	@Parameters({"browser","url"}) 
	@BeforeMethod
	public void login1(String browserName, String url)
	{
		report.setTCDesc("Validating Signup Function");
		launchCrossBrowser(browserName,url);
	}
	
	
	@Test(dataProvider = "get")
	 
	public void loginTest(String ma,String pas)
	{		
		//bb.login1(ma,pas);
	}
	
	
	
	@DataProvider(name = "get")
	public String[][] getdata() throws IOException{
	String[][] data = excelRead(excelfile,sheet2);   //Method 1
	
	//Method 2
	//String[][] data = excelRead(excelfile);
	
	return data;
	
	}

}
