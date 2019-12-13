package registerationTesting;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import common.Keyword;
import common.Xls_Reader;

public class Registeration extends Keyword {

	public Registeration(String path1) throws IOException {
		super(path1);
		// TODO Auto-generated constructor stub
	}
	
	@BeforeClass
	public void open_brow(){
		
		open_Browser("chrome");
		//enter_URL("http://newtours.demoaut.com/");
		
		enter_URL("https://dev.indersciencesubmissions.com/ossi/staging/");
 	}
	
	@Test(priority=1)  	
    public void SUP1() throws Exception //To verify the functionality of Login button with valid credentials
    {
		String xlrPath = System.getProperty("user.dir")+"\\src\\testData\\Data.xlsx"; //Get path of an Excel Sheet
		Xls_Reader xlr = new Xls_Reader(xlrPath); //Calling constructor of xls reader to read the data from xl sheet
		int rowCount = xlr.getRowCount("SignUp"); //Count Rows of an excel sheet		
		
		System.out.println(rowCount);
		for(int i=2;i<=rowCount;i++)
		{
			String FName = xlr.getCellData("SignUp", "First Name", i);
			String LName = xlr.getCellData("SignUp", "Last Name", i);
			String Phone = xlr.getCellData("SignUp", "Email Address", i);
			String UserName = xlr.getCellData("SignUp", "Alternate Email Address", i);
			String Address = xlr.getCellData("SignUp", "Country", i);
			String City = xlr.getCellData("SignUp", "Biography", i);
			String State = xlr.getCellData("SignUp", "Institution", i);
			String PIN = xlr.getCellData("SignUp", "Choose your username", i);
			String Country = xlr.getCellData("SignUp", "Choose your password", i);
			String Email = xlr.getCellData("SignUp", "Confirm password", i);
//			String PassWord = xlr.getCellData("SignUp", "Password", i);
	//		String CnfPwd = xlr.getCellData("SignUp", "Confirm Password", i);
			
				
		//	click_On_Link("linkText", "REGISTER");
	    	click_On_Button("name","Register");
						
			Thread.sleep(2000);
			input_data("name","txtFirstName" , FName);
			input_data("name", "txtLastName",LName);
			input_data("name", "txtEmail", Phone);
	    	input_data("name", "txtAlternateEmail", UserName);
	    	input_data("name", "selCountry", Address);
	    	input_data("name", "txtBiography", City);
	    	input_data("name", "txtInstitution", State);
	    	input_data("name", "txtUserName", PIN);
	    	input_data("name", "txtPassword", Country);
	    	input_data("id", "txtPassword2", Email);
	   // 	input_data("name", "password", PassWord);
	   // 	input_data("name", "confirmPassword", CnfPwd);
	    	
	    	Thread.sleep(2000);
	    //	click_On_Button("name","register");
  	
	    	click_On_Button("name","cmdSubmit");
	    	
	    	//Thread.sleep(2000);
	    	
	    	///String expText = "Thank you for registering. You may now sign-in using the user name and password you've just entered.";
	    	//String actualText = getText("xpath", "/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[3]/td/p[2]/font/text()");
	    	//System.out.println(actualText);

	    	
	    	Thread.sleep(4000);
	    	
	    	click_On_Link("linkText", "Log out");
	    	
	    //	Thread.sleep(8000);
	   // 	click_On_Link("linkText", "REGISTER");	
	    	//Thread.sleep(2000);
	    	//Thread.sleep(2000);
	    	//Thread.sleep(2000);
	    	
	    //	if (actualText.equals(expText)){
//	    		xlr.setCellData("SignUp", "Status", i, "Pass");
	    		
	    	//	Thread.sleep(2000);
		    //	Thread.sleep(2000);
		    //	Thread.sleep(2000);
	    	//	click_On_Link("linkText", "SIGN-OFF");
	    	//	click_On_Link("linkText", "REGISTER");
	    	//	click_On_Link("linkText", "REGISTER");
	    		
	    //	}
	    	//else{
//	    		xlr.setCellData("SignUp", "Status", i, "Fail");
	    		//click_On_Link("linkText", "Home");
	    	//	click_On_Link("linkText", "REGISTER");
	    	//}
	    	
	    //	click_On_Button("name","register");
	//    	Thread.sleep(8000);
	  //  	click_On_Link("linkText", "REGISTER");
	    	
		}
    }    
}