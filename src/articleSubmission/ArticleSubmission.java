package articleSubmission;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.UUID;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/*
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
import java.util.UUID;

*/
 //import registerationTesting.Login;
 //import registerationTesting.Registeration;
//import common.Keyword;
//import common.Keyword;

//import common.Xls_Reader;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import common.Keyword;
import common.Xls_Reader;

public class ArticleSubmission extends Keyword {
	
//	private static final WebDriver WebDriver = null;

	public ArticleSubmission(String path3) throws IOException {
		super(path3);
		// TODO Auto-generated constructor stub
	}
	
/*	
	@BeforeClass
	public void open_brow(){
		
		
		open_Browser("chrome");
		//enter_URL("http://newtours.demoaut.com/");
		
		enter_URL("https://dev.indersciencesubmissions.com/ossi/staging/");
//		System.out.println("Done");
 	}
*/	
	
	@Test(priority=3)
	public void LIN6() throws Exception //Go to the Start Submission step
	{
		click_On_Link("linkText", "Submit a new article");

		Thread.sleep(4000);
	
	//	WebElement guru99seleniumlink;
	//	WebElement	element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"container\"]/div[2]/table/tbody/tr[1]/td/table/tbody/tr/td/table[2]/tbody/tr/td/table/tbody/tr/td[1]/div")));
	//	guru99seleniumlink.click();
		
		click_On_Checkbox("id", "chkCheckList1");
		Thread.sleep(1000);
		click_On_Checkbox("id", "chkCheckList7");
		Thread.sleep(1000);
		click_On_Checkbox("id", "chkCheckList8");
		Thread.sleep(1000);
	//	Thread.sleep(1000);
		click_On_Checkbox("id", "chkCheckList9");
		Thread.sleep(1000);
		click_On_Checkbox("id", "chkCheckList10");
		Thread.sleep(1000);
		click_On_Checkbox("id", "chkCheckList2");
		click_On_Checkbox("id", "chkCheckList3");
		click_On_Checkbox("id", "chkCheckList6");
	
		Select drpCountry = new Select(product.findElement(By.name("selJournal")));
		drpCountry.selectByVisibleText("IDS test -2012 : IDS");
		
	    //Select Type of Article
//		WebElement fullText = product.findElement(By.id("selSubmissionType"));
//		fullText.click();
			
		//Notes to the Editor
        WebElement shortNotes = product.findElement(By.id("txtNotesToEditor"));
        shortNotes.sendKeys("Test short notes Test short notes Test short notes Test short notes Test short notes");
	
       //Save and continue 
        click_On_Button("name", "cmdSubmit");
	}

	
	@Test(priority=4)   //Go to the Authors
	public void LIN7() throws Exception 
	{
		//Click Add additional author
		click_On_Link("linkText", "Add Additional Author");
		
        Thread.sleep(2000);
        Thread.sleep(2000);
        Thread.sleep(2000);
		
      //  click_On_Link("linkText", "Cancel");
		
		//Fill Additional Author Details
		WebElement shortNotes = product.findElement(By.name("txtEmail"));
	//	shortNotes.sendKeys("abc@gmail.com");
				
		shortNotes.sendKeys("yu2412485@gmail.com");

//		Select drpTitle = new Select(product.findElement(By.name("selTitle")));
//		drpTitle.selectByVisibleText("Prof.");
		
        click_On_Button("id", "emailcheck");
        
    //  click_On_Button("name", "btnUpdataAuthor");
        
       // System.out.println("DoneA");
        
        //Handle popup and click on Ok
//        Alert alert = product.switchTo().alert();
  //      alert.accept();

        Thread.sleep(2000);
        Thread.sleep(2000);
        Thread.sleep(2000);
                        
//        System.out.println("DoneB");
        
  //     click_On_Link("linkText", "Cancel");
      // click_On_Button("name", "btnUpdataAuthor");
        
        
//		Thread.sleep(2000);
        
        //Handle confirmation box 
        WebElement confirmation = product.findElement(By.xpath("//*[@id=\"btn_ok\"]"));
        ((JavascriptExecutor) product).executeScript("arguments[0].click()", confirmation);
        
//        Alert confirmationAlert = product.switchTo().alert();
   //   String alertText = confirmationAlert.getText();
    //  System.out.println("Alert text is " + alertText);
  //     confirmationAlert.accept();
        
        Thread.sleep(2000);
        Thread.sleep(2000);
        Thread.sleep(2000);
        
     //   System.out.println("Done1");
        
//        Thread.sleep(2000);
  //      Thread.sleep(2000);
    //    Thread.sleep(2000);
        
        //Add Additional Author
//        click_On_Button("id", "btnUpdataAuthor");
      //  click_On_Button("name", "btnUpdataAuthor");
        
     //   click_On_Button("name", "btnUpdataAuthor");
        
         
//        WebElement clickOnInstitution = product.findElement(By.name("txtinstitution"));
 //      clickOnInstitution.click(); 
        
        //Click on Textarea    	    
   //     WebElement clickOnTextArea = product.findElement(By.name("txtBiography"));
    //    clickOnTextArea.click(); 
    //    clickOnTextArea.click();
     //   clickOnTextArea.click();
   
    
     //   text_area = driver.find_element_by_id('textarea')
     //   text_area.send_keys("print('Hello World')")
        
        
        //Click
//        WebElement text_area = product.findElement(By.xpath("//*[@id=\"btnUpdataAuthor\"]"));
   
        
      //  WebElement addAdditional = product.findElement(By.name("btnUpdataAuthor"));
  //      addAdditional.click();
        
     // text_area.click(); 
   //   text_area.sendKeys("");
        
      //  new Actions(product).moveToElement(addAdditional).click();
        
  //      System.out.println("Done2");
        
		//Click on Add Additional Author button
//		click_On_Button("name", "btnUpdataAuthor");

//        Actions builder = new Actions(product);
  //      builder.moveToElement((WebElement) builder).build().perform();

        WebElement addAdditionalAuthor = product.findElement(By.xpath("//*[@id=\"btnUpdataAuthor\"]"));
        addAdditionalAuthor.click();
        
        
//        Alert alert = product.switchTo().alert();
 //       alert.accept();

 //     ((JavascriptExecutor) product).executeScript("arguments[0].click()", addAdditionalAuthor);
        
        
    //    WebDriver driver = new FirefoxDriver();
//        JavascriptExecutor jse = (JavascriptExecutor) product;
  //      jse.executeScript("document.getElementById('btnUpdataAuthor').focus();");
        		
     //   product.sendKeys(Keys.SHIFT);
        
    //    click_On_Button("name", "btnUpdataAuthor");
        
//		System.out.println("Done3");
		
     
	       Thread.sleep(2000);
	        Thread.sleep(2000);
	        Thread.sleep(2000);
	 		
	  //Save & Continue	
      //  click_On_Button("name", "cmdSubmit");
        
        WebElement saveContinue = product.findElement(By.xpath("//*[@id=\"frmSubmissionMetadata\"]/table[2]/tbody/tr[2]/td/input"));
        saveContinue.click();
     
        
   //     System.out.println("Done4");
	}
		
	
	@Test(priority=5) //Go to the Metadata
	
	public void LIN8() throws Exception
	{

		//Submission Title
//	    WebElement submissionTitle = product.findElement(By.name("txtMetaTitle"));
//		submissionTitle.sendKeys("Test Submission Title29");
		
		
		String uuid = UUID.randomUUID().toString();

		//Now this uuid enter to your text box
		product.findElement(By.name("txtMetaTitle")).sendKeys(uuid);
		
	
		Thread.sleep(2000);
		
		//Submission Abstract
		WebElement submissionAbstract = product.findElement(By.name("txtMetaAbstract"));
		submissionAbstract.sendKeys("When completing the use the most appropriate words to describe the content of your article, so that readers using online searches will more easily trace your article. When completing the use the most appropriate words to describe the content of your article, so that readers using online searches will more easily trace your article. When completing the use the most appropriate words to describe the content of your article, so that readers using online searches will more easily trace your article. When completing the use the most appropriate words to describe the content of your article, so that readers using online searches will more easily trace your article.");
			
		Thread.sleep(2000);
		
		//Keywords 
		WebElement keywords = product.findElement(By.name("txtMetaKeywords"));
		keywords.sendKeys("Choose terms that best describe the content of your article as these terms or keywords can help search engines such as Google Scholar to increase the ranking of your article. Separate your keywords");
		
		Thread.sleep(2000);
        Thread.sleep(2000);
        Thread.sleep(2000);
	    click_On_Button("name", "cmdSubmit");
	}
	
	@Test(priority=6) //Go to Submission Upload
	
	public void LIN9() throws Exception
	{
	
		 WebElement uploadElement = product.findElement(By.id("articlefile"));
	//	 uploadElement.click();
		 
	        // enter the file path onto the file-selection input field
	      //  uploadElement.sendKeys("D:\\Sumit_Backup\\Automation\\Workspace\\MercuryTours\\src\\registerationTesting\id31_keywords.pdf");

	        uploadElement.sendKeys(System.getProperty("user.dir")+"\\src\\registerationTesting\\id31_keywords.pdf");
	        
	   //     System.getProperty("user.dir")+"\\src\\registerationTesting\\id31_keywords.pdf";
	        
//	        // check the "I accept the terms of service" check box
	       // driver.findElement(By.id("terms")).click();

	        // click the "UploadFile" button
//	        driver.findElement(By.name("send")).click();
		
	        Thread.sleep(2000);
	        Thread.sleep(2000);
	        Thread.sleep(2000);
	        Thread.sleep(2000);
	        click_On_Button("name", "cmdSubmit");
	        
			Thread.sleep(2000);
	        Thread.sleep(2000);
	        Thread.sleep(2000);
	        Thread.sleep(2000);
			click_On_Button("name", "cmdSubmit");
	}
	
	
	@Test(priority=7)
	public void LIN10() throws Exception
	{
		//Expert1
		WebElement email1 = product.findElement(By.id("txtEmail1"));
		email1.sendKeys("peggy@wrapcreative.com.au");
		
		WebElement loading = product.findElement(By.id("showMandatoryEmail1"));
		loading.click();

		Thread.sleep(4000);
		
        Alert expertAlert = product.switchTo().alert();
        expertAlert.accept();

		Thread.sleep(3000);
		
        WebElement lastName = product.findElement(By.id("txtLastName1"));
	    lastName.sendKeys("text text");

      
      Select drpCountry = new Select(product.findElement(By.id("selCountry1")));
      drpCountry.selectByVisibleText("INDIA");
      
      WebElement Institution= product.findElement(By.id("txtInstitution1"));
      Institution.sendKeys("Test Institution");
	  
     //Expert2
      

		WebElement email2 = product.findElement(By.id("txtEmail2"));
		email2.sendKeys("bruno@wrapcreative.com.au");
		
		WebElement loading1 = product.findElement(By.id("showMandatoryEmail2"));
		loading1.click();

		Thread.sleep(4000);
		
        Alert expertAlert1 = product.switchTo().alert();
        expertAlert1.accept();
		
        Select drpCountry1 = new Select(product.findElement(By.id("selCountry2")));
        drpCountry1.selectByVisibleText("INDIA");
        
        WebElement Institution1= product.findElement(By.id("txtInstitution2"));
        Institution1.sendKeys("Test Institution");
  	 
      
	//Expert3
        
		WebElement email3 = product.findElement(By.id("txtEmail3"));
		email3.sendKeys("pradeep63@yopmail.com");
		
		WebElement loading2 = product.findElement(By.id("showMandatoryEmail3"));
		loading2.click();

		Thread.sleep(4000);
		
        Alert expertAlert2 = product.switchTo().alert();
        expertAlert2.accept();
		
        Select drpCountry2 = new Select(product.findElement(By.id("selCountry3")));
        drpCountry2.selectByVisibleText("INDIA");
        
        WebElement Institution2= product.findElement(By.id("txtInstitution3"));
        Institution2.sendKeys("Test Institution");

	//Expert4

		WebElement email4 = product.findElement(By.id("txtEmail4"));
		email4.sendKeys("pradeep123@yopmail.com");
		
		WebElement loading3 = product.findElement(By.id("showMandatoryEmail4"));
		loading3.click();

		Thread.sleep(4000);
		
  //    Alert expertAlert3 = product.switchTo().alert();
        expertAlert2.accept();
		
        Select drpCountry3 = new Select(product.findElement(By.id("selCountry4")));
        drpCountry3.selectByVisibleText("INDIA");
        
        WebElement Institution3= product.findElement(By.id("txtInstitution4"));
        Institution3.sendKeys("Test Institution");
        
        Thread.sleep(2000);
        Thread.sleep(2000);

        WebElement saveContinueExpert = product.findElement(By.xpath("//*[@id=\"cmdSubmitbtn\"]"));
        saveContinueExpert.click();
        

        //Go to Confirmation

        Thread.sleep(2000);
        Thread.sleep(2000);
        
        click_On_Button("name", "cmdSubmit");
    
        
        //View Your Submissions

        Thread.sleep(2000);
        Thread.sleep(2000);
        
        click_On_Link("linkText", "View Your Submissions");
	}

		
	@Test(priority=8)
	public void LIN114() throws Exception
	{
      System.out.println("Done");
	}
		
}
	/*

public class Expert extends Login{
	
//	public static void main()

//	public Expert(String path) {
	//	super(path);
		// TODO Auto-generated constructor stub
//	}

//	public Expert(String path) {
	//	super(path);
		// TODO Auto-generated constructor stub
//	}

	public Expert(String path) {
		super(path);
		// TODO Auto-generated constructor stub
	}

	@Test
	public void LIN11() throws Exception
	{
      System.out.println("Done");
		
//		final WebDriver WebDriver = null;
		
		//Expert1
		
/*		WebElement email1 = product.findElement(By.name("txtEmail[]"));
		email1.sendKeys("test@gmail.com");
		
		Thread.sleep(2000);

		WebElement emailLabel = product.findElement(By.id("showMandatoryEmail1[]"));
		emailLabel.click();
		
//		WebElement loading = product.findElement(By.id("loading1[]"));
//		loading.click();
	
		
	//Expert2
		
	//Expert3
	
	//Expert4
   
	}

}
*/