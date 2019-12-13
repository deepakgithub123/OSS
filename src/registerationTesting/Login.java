package registerationTesting;

import org.junit.AfterClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.UUID;

import common.Keyword;
import common.Xls_Reader;

public class Login extends Keyword {

	private static final WebDriver WebDriver = null;

	public Login(String path2) throws IOException {
		super(path2);
		// TODO Auto-generated constructor stub
	}
	
	@BeforeClass
	public void open_brow(){
		
		open_Browser("chrome");
		enter_URL("https://dev.indersciencesubmissions.com/ossi/staging/");
	}
	

	@Test(priority=1)  	
    public void LIN4() throws IOException //To verify the functionality of Login button with valid/Invalid credentials from Excel
    {
		String xlrPath = System.getProperty("user.dir")+"\\src\\testData\\Data.xlsx"; //Get path of an Excel Sheet
		Xls_Reader xlr = new Xls_Reader(xlrPath); //Calling constructor of xls reader to read the data from xl sheet
		int rowCount = xlr.getRowCount("Login"); //Count Rows of an excel sheet
		
		
		for(int i=2;i<=rowCount;i++)
		{
			String UserName = xlr.getCellData("Login", "Username", i);
			String PassWord = xlr.getCellData("Login", "Password", i);
			
		//	click_On_Link("linkText", "Home");
	    	input_data("name", "txtUsername", UserName);
	    	input_data("name", "txtPassword", PassWord);
	    	click_On_Button("name", "cmdSubmit");

//	    	Thread.sleep(2000);
	    	//click_On_Link("linkText", "Log out");
	    	
	    	String expTitle = "https://dev.indersciencesubmissions.com/ossi/staging/session/index.php";
	    	String actualTitle = getURL();
	    	
	    	System.out.println(actualTitle);
	    	if (actualTitle.equals(expTitle)){
	    		xlr.setCellData("Login", "Status", i, "Pass");
	//    		click_On_Link("linkText", "Log out");
	    	}
	   	else{
	    		xlr.setCellData("Login", "Status", i, "Fail");
	    		//click_On_Link("linkText", "Log out");
	    	}
	    
		}
    }
/*	
	@Test(priority=2)
	public void LIN5() throws Exception //To verify the functionality of Login button with invalid credentials
	{
		click_On_Link("linkText", "Home");
		waitForElementPresence("name", "userName", 10);
		input_data("name", "userName", generateRandomAlphaNumeric(10));
		input_data("name", "password", generateRandomAlphaNumeric(10));
		click_On_Button("name", "login");
		String expTitle = "Sign-on: Mercury Tours";
		String actualTitle = getTitle();
		Assert.assertEquals(actualTitle, expTitle);
	}
*/
	
	@AfterClass
	public void close_brow(){
		close_Browser();
	}

}
