package com.testScripts;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Document;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class allcontacts  {

@Test
public void contacts() throws InterruptedException {
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--remote-allow-origins=*");
	WebDriver driver=new ChromeDriver(opt);
	driver.manage().window().maximize();

//PRODUCT LINK
driver.get("https://app.tryoncourse.com/sign-in");

/*
// EMAIL LOGIN	[ full completed]
//email login- password negative
Thread.sleep(2000);
driver.findElement(By.id("email")).sendKeys("james@zibtek.in");
		
Thread.sleep(4000);
driver.findElement(By.id("pwd")).sendKeys("123456");
		
Thread.sleep(2000);
driver.findElement(By.className("sign-btn")).click();
		
Thread.sleep(2000);
driver.findElement(By.id("pwd")).clear();
		
Thread.sleep(2000);
driver.findElement(By.id("email")).clear();
		
Thread.sleep(4000);
driver.findElement(By.id("email")).sendKeys("james@zibtek.co");
		
Thread.sleep(2000);
driver.findElement(By.id("pwd")).sendKeys("zibtek2023");
		
Thread.sleep(2000);
driver.findElement(By.className("sign-btn")).click();
		
Thread.sleep(2000);
driver.findElement(By.id("email")).clear();
		
Thread.sleep(2000);
driver.findElement(By.id("email")).sendKeys("james@zibtek.in");
		
Thread.sleep(2000);
driver.findElement(By.id("pwd")).clear();
		
Thread.sleep(4000);
driver.findElement(By.id("pwd")).sendKeys("123456");
		
Thread.sleep(2000);
driver.findElement(By.className("sign-btn")).click();
		
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='Forgot Password?']")).click();
		
Thread.sleep(4000);
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("james@zibtek.co");
	
Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='Reset Password']")).click();
	
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@name='email']")).clear();
	
Thread.sleep(4000);
driver.findElement(By.xpath("//input[@name='email']")).sendKeys("james@zibtek.in");
	
Thread.sleep(4000);
driver.findElement(By.xpath("//*[text()='Reset Password']")).click();
	
Thread.sleep(4000);
driver.findElement(By.xpath("//*[text()='Back to Sign in']")).click();   */
	
Thread.sleep(3000);
driver.findElement(By.id("email")).sendKeys("james@zibtek.in");
	
Thread.sleep(2000);
driver.findElement(By.id("pwd")).sendKeys("zibtek2024");
	
Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='visibility_off']")).click();
Thread.sleep(2000);	
driver.findElement(By.xpath("(//*[text()='visibility'])[1]")).click();
			
Thread.sleep(2000);
driver.findElement(By.className("sign-btn")).click();	
	
/*
// + CREATE COMPANY
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()=' Company']")).click();
	
Thread.sleep(3000);
driver.findElement(By.name("company")).sendKeys("Testing automation 3");
	
Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='CREATE'])[2]")).click();
	
Thread.sleep(2000);
driver.findElement(By.xpath("//img[@alt='logo']")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()=' Company']")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("//input[@name='company']")).sendKeys("Testing automation 3");

Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='CANCEL'])[3]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//img[@alt='logo']")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("(//input[@placeholder='Search'])[2]")).sendKeys("Testing automation 3");
	
Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='Testing automation 3']")).click();  

Thread.sleep(4000);
JavascriptExecutor script2=(JavascriptExecutor)driver;
script2.executeScript("window.scrollBy(0,850)", "");

Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='Delete Lead']")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()=' Yes - I am sure Delete ']")).click();  


// SEARCH COMPANY & MOVE TO ACCOUNT PAGE  / COMPLETED
	
Thread.sleep(4000);
driver.findElement(By.xpath("(//input[@placeholder='Search'])[2]")).sendKeys("Testing automation 2");
	
Thread.sleep(4000);
driver.findElement(By.xpath("//*[text()='Testing automation 2']")).click();   

	 
	 
// CONTACT MODULE	 
// CONTACT ADDING ADDRESS  / COMPLETED
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='+ Add Address']")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()=' Save '])[5]")).click();

Thread.sleep(3000);
driver.findElement(By.id("address")).sendKeys("#111,varanasi road");

Thread.sleep(3000);
driver.findElement(By.id("address1")).sendKeys("#111,varanasi road");

Thread.sleep(3000);
driver.findElement(By.id("country")).click();

Thread.sleep(3000);
driver.findElement(By.id("country")).sendKeys("United States");

Thread.sleep(3000);
driver.findElement(By.id("state")).click();

Thread.sleep(3000);
driver.findElement(By.id("state")).sendKeys("Florida");

Thread.sleep(3000);
driver.findElement(By.id("city")).sendKeys("Kingdom");

Thread.sleep(3000);
driver.findElement(By.id("zipcode")).sendKeys("602113");

Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()=' Save '])[5]")).click();

// Negative for address / COMPLETED

Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='edit'])[1]")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("(//select[@name='country'])[2]")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("(//select[@name='country'])[2]")).sendKeys("United Kingdom");

Thread.sleep(3000);
driver.findElement(By.xpath("(//select[@name='state'])[2]")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("(//select[@name='state'])[2]")).sendKeys("Bedford");

Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()=' Save '])[6]")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='delete'])[1]")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()=' Cancel '] )[7]")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='delete'])[1]")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("(//button[text()=' Delete '])[1]")).click();   

// CREATE CONTACT PAGE / COMPLETED ONLY CREATE CONTACT			 			 
Thread.sleep(5000);			 
driver.findElement(By.xpath("(//*[text()='add_circle_outline'])[3]")).click();
					  
Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()='Cancel'])[6]")).click();		  
					 
Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='add_circle_outline'])[3]")).click();
			          
Thread.sleep(3000);
driver.findElement(By.xpath("(//input[@formcontrolname='contactName'])[2]")).
sendKeys("Automation");
					  
Thread.sleep(3000);
driver.findElement(By.xpath("(//input[@name='title'])[2]")).sendKeys("QA");
					  					  
Thread.sleep(3000);
driver.findElement(By.xpath("(//div[@class='iti__selected-flag'])[4]")).click();
					  
Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='United States'])[8]")).click();
					
Thread.sleep(3000);
driver.findElement(By.xpath("(//input[@placeholder='(000)000-0000'])[2]")).
sendKeys("6360244152");
					  
Thread.sleep(3000);
driver.findElement(By.xpath("(//mat-select[@formcontrolname='phonetype'])[2]")).click();
					  
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='Other']")).click();
					  
Thread.sleep(3000);
driver.findElement(By.xpath("(//div[@class='iti__selected-flag'])[4]")).click();
				
Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='India (भारत)'])[4]")).click();
					  
Thread.sleep(3000);
driver.findElement(By.xpath("(//input[@id='emails'])[2]")).click();
					  
Thread.sleep(3000);
driver.findElement(By.xpath("(//input[@id='emails'])[2]")).sendKeys(
"james@zibtek.in");
					  
Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='Save'])[5]")).click();
					  
Thread.sleep(3000);
driver.findElement(By.xpath("(//i[text()='more_horiz '])[1]")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()=' Edit ']")).click();
					  
Thread.sleep(4000);
JavascriptExecutor script10=(JavascriptExecutor)driver;
script10.executeScript("window.scrollBy(0,350)", "");
					   					  
Thread.sleep(3000);
driver.findElement(By.xpath("(//input[@name='contactUrl'])[3]")).click();
					  
Thread.sleep(3000);
driver.findElement(By.xpath("(//input[@name='contactUrl'])[3]")).sendKeys("www.oncourse.com");
					  
Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()=' Save '])[8]")).click();    
					  				  					  
Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='more_horiz '])[1]")).click();
					
Thread.sleep(2000);
driver.findElement(By.xpath("(//i[@class='material-icons ed-icon'])[2]")).click();
					
Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()=' Cancel '])[12]")).click();

//Thread.sleep(3000);
//driver.findElement(By.xpath("(//*[text()='more_horiz '])[1]")).click();
//
//Thread.sleep(3000);
//driver.findElement(By.xpath("(//*[text()='delete'])[2]")).click();
//
//Thread.sleep(3000);
//driver.findElement(By.xpath("(//*[text()=' Delete '])[5]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()=' Contact']")).click();
					
Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()='Cancel'])[3]")).click();
driver.navigate().refresh();
       


/*  CONTACT DAIL CALL										
//WebElement element =driver.findElement(By.xpath("//i[@title='Call 916360244152']"));
//element.click();
//Thread.sleep(2000);
//
//Alert alert=driver.switchTo().alert();
//Thread.sleep(2000);
//alert.accept();
//									
//driver.findElement(By.xpath("//img[src='../../assets/images/callcancel.png']")).click();  

// contact sending email


Thread.sleep(4000);	
driver.findElement(By.xpath("(//*[text()='mail_outline'])[1]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//input[@placeholder='Subject']")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys("Testing subject");

Thread.sleep(2000);
driver.findElement(By.xpath("//input[@placeholder='Subject']")).clear();

Thread.sleep(2000);
driver.findElement(By.xpath("(//mat-select[@aria-label='Choose a template'])[2]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()=' Email testing ']")).click();

//Thread.sleep(2000);
//driver.findElement(By.xpath("//*[text()='Save Draft']")).click();
//
//Thread.sleep(2000);
//driver.findElement(By.xpath("//*[text()=' james@zibtek.in']")).click();
//
//Thread.sleep(2000);
//driver.findElement(By.xpath("//*[text()='Continue Editing']")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()='Send Later'])[1]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='Tomorrow']")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='11:00']")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='Schedule']")).click();

Thread.sleep(4000);
driver.findElement(By.xpath("//p[@class='elip-prop']")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("(//span[@class='glyphicon glyphicon-pushpin pinbar'])[1]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//p[@class='elip-prop']")).click();
					
Thread.sleep(2000);
driver.findElement(By.xpath("(//span[@class='glyphicon glyphicon-pushpin pinbar'])[1]")).click();			

Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()='Cancel'])[12]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("(//span[@class='glyphicon glyphicon-pushpin pinbar'])[1]")).click();	

Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='Unpin']")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("//p[@class='elip-prop']")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()=' delete '])[1]")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='Cancel'])[11]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()=' delete '])[1]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()='Delete'])[4]")).click();


// CONTACT DIRECT SEND EMAIL 

Thread.sleep(5000);	
driver.findElement(By.xpath("(//*[text()='mail_outline'])[2]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("(//mat-select[@aria-label='Choose a template'])[2]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()=' mobile text']")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()='Send'])[2]")).click();								
					
// TEXT SMS
Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()='textsms'])[1]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("(//div[@class='iti__flag iti__us'])[13]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()='India (भारत)'])[5]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("(//span[@class=\"ng-arrow-wrapper\"])[8]")).click();

driver.findElement(By.xpath("//*[text()='6360244152']")).click();

driver.findElement(By.xpath("//*[text()=' Send '])[1]")).click();

driver.findElement(By.xpath("//*[text()='No Template']")).click();

driver.findElement(By.xpath("//*[text()=' approch ']")).click();

driver.findElement(By.xpath("(//*[text()='Save Draft '])[1]")).click();

driver.findElement(By.xpath("//*[text()=' Me ']")).click();

driver.findElement(By.xpath("//*[text()='Continue Editing']")).click();  */
					
/*				 
//  CREATE CONTACT TASK PAGE / COMPLETED 
Thread.sleep(3000);
JavascriptExecutor script3=(JavascriptExecutor)driver;
script3.executeScript("window.scrollBy(0,-350)", "");
				    
Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()='add_circle_outline'])[1]")).click();
					  					  
Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()=' Create ']")).click(); 
					  
Thread.sleep(2000);
driver.findElement(By.xpath("//textarea[@placeholder='Task Description']")).clear();
					  
Thread.sleep(2000);
driver.findElement(By.xpath("//textarea[@placeholder='Task Description']")).sendKeys("Need to followup today");
					  					  
Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='Select task type']")).click();
					  
Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()='Prospecting'])[1]")).click();
					  
Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()=' Create ']")).click();  
					  					  
Thread.sleep(3000);
WebElement action=driver.findElement(By.xpath("(//*[text()='Prospecting'])[1]"));
Actions act = new Actions (driver);
act.moveToElement(action).build().perform();
driver.findElement(By.xpath("(//*[text()='edit'])[2]")).click();					  
					  
Thread.sleep(2000);
driver.findElement(By.xpath("(//input[@type='text'])[29]")).click();
					  
Thread.sleep(2000);
driver.findElement(By.xpath("(//input[@type='text'])[29]")).click();
					  
Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()=' Save '])[7]")).click();
					  
Thread.sleep(3000);
WebElement action1=driver.findElement(By.xpath("(//*[text()='Prospecting'])[1]"));
Actions act1 = new Actions (driver);
act1.moveToElement(action1).build().perform();
driver.findElement(By.xpath("(//*[text()='edit'])[2]")).click();
						 
Thread.sleep(2000);		  
driver.findElement(By.xpath("(//*[text()='check'])[1]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='Need to followup today']")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='Need to followup today']")).click();

Thread.sleep(3000);
WebElement action11=driver.findElement(By.xpath("//*[text()='Need to followup today']"));
Actions act11 = new Actions (driver);
act11.moveToElement(action11).build().perform();
driver.findElement(By.xpath("//*[text()='undo']")).click();		  

driver.navigate().refresh();
					  
Thread.sleep(4000);
WebElement action21=driver.findElement(By.xpath("(//*[text()='Prospecting'])[1]"));
Actions act21 = new Actions (driver);
act21.moveToElement(action21).build().perform();
driver.findElement(By.xpath("//*[text()='check']")).click();			  
			
Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='Need to followup today']")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='undo']")).click();			  
					  		  			  
Thread.sleep(3000);
WebElement action211=driver.findElement(By.xpath("(//*[text()='Prospecting'])[1]"));
Actions act211 = new Actions (driver);
act211.moveToElement(action211).build().perform();
driver.findElement(By.xpath("(//*[text()='delete'])[2]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()=' Cancel '])[8]")).click();
		 
Thread.sleep(3000);
WebElement action2111=driver.findElement(By.xpath("(//*[text()='Prospecting'])[1]"));
Actions act2111 = new Actions (driver);
act2111.moveToElement(action2111).build().perform();
driver.findElement(By.xpath("(//*[text()='delete'])[2]")).click();
		 
Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()=' Delete '])[2]")).click();    
					  					  
//  CREATE CONTAT DEALS PAGE / COMPLETED 
Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='add_circle_outline'])[2]")).click();
					  
Thread.sleep(4000);
JavascriptExecutor script31=(JavascriptExecutor)driver;
script31.executeScript("window.scrollBy(0,800)", "");					  
					  
Thread.sleep(3000);
driver.findElement(By.id("addoppurtunitiesSave")).click();					    
					    
Thread.sleep(4000);
JavascriptExecutor script311=(JavascriptExecutor)driver;
script311.executeScript("window.scrollBy(0,-750)", "");					    
					    
Thread.sleep(3000);
driver.findElement(By.xpath("(//input[@formcontrolname='name'])[4]")).
sendKeys("Cricket");					  
					  
Thread.sleep(3000);
driver.findElement(By.xpath("//*[@placeholder='Select Contact']")).click();
					  
Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='Automation '])[1]")).click();
					  
Thread.sleep(3000); 
driver.findElement(By.id("pipeline-opp")).click();
					  
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='Production ']")).click();
					  
Thread.sleep(3000);
driver.findElement(By.id("status")).click();
					  
Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='1 '])[1]")).click();					  
					  
Thread.sleep(2000); 
driver.findElement(By.id("oppvalue")).sendKeys("300");
					  
Thread.sleep(2000); 
driver.findElement(By.id("userSelect")).click();
					  
Thread.sleep(2000);
driver.findElement(By.xpath("(//textarea[@placeholder='Notes'])[2]")).
sendKeys("testing");
					  					  
Thread.sleep(3000);
driver.findElement(By.id("addoppurtunitiesSave")).click();
					  
Thread.sleep(3000);
JavascriptExecutor script21=(JavascriptExecutor)driver;
script21.executeScript("window.scrollBy(0,-550)", "");	    
					    
Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()=' Cricket '])[1]")).click();
					  
Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='more_vert'])[1]")).click();
					  
Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='Edit'])[1]")).click();
					  
Thread.sleep(3000);
driver.findElement(By.xpath("(//input[@formcontrolname='name'])[4]")).clear();
					  
Thread.sleep(3000);
driver.findElement(By.xpath("(//input[@formcontrolname='name'])[4]")).sendKeys("Martin");
					  
Thread.sleep(3000);
JavascriptExecutor script3111=(JavascriptExecutor)driver;
script3111.executeScript("window.scrollBy(0,650)", "");
					  										  
Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()=' Save '])[8]")).click();
					  
Thread.sleep(3000);
JavascriptExecutor script4=(JavascriptExecutor)driver;
script4.executeScript("window.scrollBy(0,-350)", "");
					    					    
// won Deals / COMPLETED
Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()=' Martin '])[1]")).click();
					  
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()=' Won ']")).click();
					  
JavascriptExecutor script5=(JavascriptExecutor)driver;
script5.executeScript("window.scrollBy(0,-750)", "");
					    					    
Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()=' Martin '])[1]")).click();
					  
Thread.sleep(2000);
driver.findElement(By.xpath("(//div[@data-toggle='collapse'])[1]")).click();
					  
Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()=' Martin '])[1]")).click();
					  
Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='Reopen']")).click();

Thread.sleep(2000);
driver.navigate().refresh();					 			  
					  
// Lost Deal	/ COMPLETED			  
Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()=' Martin '])[1] ")).click();
					  
Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()=' Lost ']")).click();
					  
Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()='Select Reason'])[1]")).click();
					  
Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()='Stopped Responding '])[1]")).click();
					  
Thread.sleep(2000);
driver.findElement(By.xpath("(//textarea[@formcontrolname='name'])[1]")).click();
					  
Thread.sleep(2000);
driver.findElement(By.xpath("(//textarea[@formcontrolname='name'])[1]")).sendKeys("testing automation");
					  
Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()=' Cancel '])[13]")).click();					 
					  
Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()=' Lost ']")).click();
					  
Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()='Select Reason'])[1]")).click();
					  
Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()='Stopped Responding '])[1]")).click();
					  
Thread.sleep(2000);
driver.findElement(By.xpath("(//textarea[@formcontrolname='name'])[1]")).click();
					  
Thread.sleep(2000);
driver.findElement(By.xpath("(//textarea[@formcontrolname='name'])[1]")).sendKeys("testing automation");
					  
Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()=' Mark as Lost '])[1]")).click();
					  
Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()=' Martin '])[1]")).click();
					  
Thread.sleep(2000);
driver.findElement(By.xpath("(//div[@data-toggle='collapse'])[1]")).click();
					  
Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()=' Martin '])[1]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='Reopen']")).click();
					  
Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()=' Martin '])[1]")).click();
					  
Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='more_vert'])[1]")).click();
					  
Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()='Delete'])[3]")).click();
					  
Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()=' Cancel '])[12]")).click();
					  
Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()='more_vert'])[1]")).click();
					  
Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()='Delete'])[3]")).click();
					  
Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()=' Delete '])[5]")).click();    
					  					  					  
// CREATE CONTACT SEQUENCES PAGE	/ COMPLETED				  
Thread.sleep(3000);
JavascriptExecutor script31111=(JavascriptExecutor)driver;
script31111.executeScript("window.scrollBy(0,-450)", "");
					 
Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='add_circle_outline' ])[4]")).click();
					  
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='Start']")).click();
					  
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='Select Sequence']")).click();
					  
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()=' sequences 1']")).click();
					  
Thread.sleep(3000);
driver.findElement(By.xpath("(//div[@class=\"ng-select-container\"])[5]")).click();
					  					  
Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='Automation'])[1]")).click();
					  
Thread.sleep(3000);
driver.findElement(By.xpath("(//*[@formcontrolname='from'])[2]")).click();
					  					  
Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='james@zibtek.in'])[2]")).click();
					  
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='Start']")).click(); 
			 
//CONTACT SEQUENCES EDIT	/ COMPLETED				  
Thread.sleep(2000);
WebElement action3=driver.findElement(By.xpath("//p[text()='Step 0/1']"));
Actions act3 = new Actions (driver);
act3.moveToElement(action3).build().perform();
driver.findElement(By.xpath("//i[text()='more_vert']")).click();
									 
Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='View/Edit Sequence']")).click();
					
Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='Pause Sequence']")).click();
					
Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()='Cancel'])[7]")).click();
					
Thread.sleep(2000);
WebElement action4=driver.findElement(By.xpath("//p[text()='Step 0/1']"));
Actions act4 = new Actions (driver);
act4.moveToElement(action4).build().perform();
driver.findElement(By.xpath("//i[text()='more_vert']")).click();
					 					 
Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='View/Edit Sequence']")).click();
					 
Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='Resume']")).click();
					
Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='Pause Sequence']")).click();
					
Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='Delete Remainder']")).click();
					
Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()='Cancel'])[8]")).click(); 
					
Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()='Cancel'])[7]")).click();
										
// SEQUENCES ADD ANOTHER CONTACT	/ COMPLETED			
Thread.sleep(2000);
WebElement action111=driver.findElement(By.xpath("(//*[text()='Step 0/1'])[1]"));
Actions act111 = new Actions (driver);
act111.moveToElement(action111).build().perform();
driver.findElement(By.xpath("(//*[text()='more_vert'])[1]")).click();
									
Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()='Add another contact '])[1]")).click();
					
Thread.sleep(3000);
driver.findElement(By.xpath("//mat-select[@placeholder='Select Sequence']")).click();
					
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()=' james1']")).click();
					  
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='Start']")).click();	
					  
Thread.sleep(3000);
driver.findElement(By.xpath("(//div[@class=\"ng-select-container\"])[5]")).click();
					  					  
Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='Automation'])[1]")).click();
					  
Thread.sleep(3000);
driver.findElement(By.xpath("(//*[@formcontrolname='from'])[2]")).click();				  
					  
Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='james@zibtek.in'])[4]")).click();
					 						  
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='Start']")).click();						 
					  
// CONTACT VIEW SEQUENCES	/ COMPLETED			 
Thread.sleep(3000);
JavascriptExecutor script311111=(JavascriptExecutor)driver;
script311111.executeScript("window.scrollBy(0,-450)", "");
					 					 
Thread.sleep(3000);
WebElement action1111=driver.findElement(By.xpath("(//*[text()='Step 0/2'])[1]"));
Actions act1111 = new Actions (driver);
act1111.moveToElement(action1111).build().perform();
driver.findElement(By.xpath("(//*[text()='more_vert'])[1]")).click();
					  					 
Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='View in sequences']")).click();
					 							
Thread.sleep(3000);
JavascriptExecutor je = (JavascriptExecutor)driver;
WebElement scroll = driver.findElement(By.xpath("//*[text()=' james1 ']"));
je.executeScript("arguments[0].scrollIntoView();", scroll);
							 							 
Thread.sleep(3000);
driver.findElement(By.xpath("//img[@alt='logo']")).click();
								
Thread.sleep(3000);
driver.findElement(By.xpath("(//input[@placeholder='Search'])[2]")).
sendKeys("Testing automation 2");
								  
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='Testing automation 2']")).click(); 
									 
// DELETE SEQUENCES / COMPLETED
Thread.sleep(3000);
JavascriptExecutor script3111111=(JavascriptExecutor)driver;
script3111111.executeScript("window.scrollBy(0,450)", "");
				 
Thread.sleep(2000);
WebElement action5=driver.findElement(By.xpath("(//*[text()='Step 0/2'])[1]"));
Actions act5 = new Actions (driver);
act5.moveToElement(action5).build().perform();
driver.findElement(By.xpath("(//*[text()='more_vert'])[1]")).click();
				 
Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='View/Edit Sequence']")).click();
					
Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='Pause Sequence']")).click();				 
					
Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='Delete Remainder']")).click();
					
Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()='Delete'])[3]")).click();
					
Thread.sleep(2000);
WebElement action6=driver.findElement(By.xpath("(//*[text()='Step 0/1'])[1]"));
Actions act6 = new Actions (driver);
act6.moveToElement(action6).build().perform();
driver.findElement(By.xpath("(//*[text()='more_vert'])[1]")).click();
					 
Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()=' Delete '])[6]")).click();
					
Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()='Delete'])[3]")).click();    
									
// CREATE CONTACT HOME PAGE
//  Home page email
Thread.sleep(3000);
JavascriptExecutor script1=(JavascriptExecutor)driver;
script1.executeScript("window.scrollBy(0,-850)", "");
WebElement ele1 =driver.findElement(By.xpath("(//*[text()='Email'])[3]")); 
ele1.click(); 
					 					  
					  
Thread.sleep(2000);
driver.findElement(By.xpath("//i[@class='material-icons deleteicon']")).click();
					  					  
// accounts page Calls ( drop down -up ) 
Thread.sleep(4000);
JavascriptExecutor script22=(JavascriptExecutor)driver;
script22.executeScript("window.scrollBy(0,-250)", "");
WebElement ele22=driver.findElement(By.xpath("//a[@title=' Calls']")); 
ele22.click();					  
					  
Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()='Cancel'])[11]")).click();
					  					  
// Home page SMS 
Thread.sleep(2000);
driver.findElement(By.xpath("//a[text()='SMS']")).click();
					  
Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()=' delete '])[1]")).click();					  
					  
// Home page notes
Thread.sleep(2000);
driver.findElement(By.xpath("//a[text()='Notes']")).click();
					 
Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()='Cancel'])[11]")).click();
					  					  
// Home page files
Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='Files']")).click();					  
					  
// Home page status field 
Thread.sleep(2000);
driver.findElement(By.id("status-list")).click();
					  
Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()=' Marketing Qualified ']")).click();
					 					 					  
// Home page individuals data pull
Thread.sleep(2000);
driver.findElement(By.xpath("//mat-select[@id='history-list']")).click();
					  
Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()= ' Email']")).click();   */



// CREATE Task MODULE 
//create new task
Thread.sleep(8000);
driver.findElement(By.xpath("//img[@mattooltip=\"Tasks\"]")).click();

/*

Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='add']")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='CREATE'])[1]")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("(//input[@type='text'])[6]")).click();
						
Thread.sleep(3000);
driver.findElement(By.xpath("(//input[@type=\"text\"])[6]")).sendKeys("Testing automation 2");

Thread.sleep(2000);
driver.findElement(By.xpath("//div[@role=\"option\"]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()='Select Task Type'])[1]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()='Prospecting'])[6]")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='CREATE'])[1]")).click();  

Thread.sleep(5000);
driver.findElement(By.xpath("//*[text()='View More ']")).click();

//Thread.sleep(5000);
//driver.findElement(By.xpath("//*[text()='View More ']")).click();   


Thread.sleep(3000);
JavascriptExecutor je = (JavascriptExecutor)driver;

Thread.sleep(6000);
WebElement scroll = driver.findElement(By.xpath("//*[text()=' Testing automation 2 ']"));

Thread.sleep(6000);
je.executeScript("arguments[0].scrollIntoView();", scroll);

Thread.sleep(6000);
driver.findElement(By.xpath("//*[text()=' Testing automation 2 ']")).click();

Thread.sleep(4000);
driver.findElement(By.xpath("//img[@mattooltip=\"Tasks\"]")).click();    */


//Thread.sleep(5000);
//WebElement action40=driver.findElement(By.xpath("(//i[@class='material-icons edit-icon hov-icon'])[1]"));
//Actions act40 = new Actions (driver);
//act40.moveToElement(action40).build().perform();
////act40.click();
////driver.findElement(By.xpath("(//*[text()='edit'])[2]")).click();
//
//
////*[text()=' Testing automation 2 ']
//
//
//
//Thread.sleep(3000);
//driver.findElement(By.id("description")).clear();
//
//Thread.sleep(3000);
//driver.findElement(By.id("description")).click();
//
//Thread.sleep(3000);
//driver.findElement(By.xpath("(//*[text()='Update '])[1]")).click();
//
//
//Thread.sleep(3000);
//WebElement action51=driver.findElement(By.xpath("//*[text()=' Testing automation 2 ']"));
//Actions act51 = new Actions (driver);
//act51.moveToElement(action51).build().perform();
//driver.findElement(By.xpath("(//*[text()='done'])[25]")).click();



/*

// NOTIFICATION

Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()=' Notification']")).click();


Thread.sleep(3000);
WebElement action71=driver.findElement(By.xpath("//*[text()=' Notification']"));
Actions act71 = new Actions (driver);
act71.moveToElement(action71).build().perform();
driver.findElement(By.xpath("//*[text()='more_vert']")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='Call']")).click();


Thread.sleep(3000);
WebElement action72=driver.findElement(By.xpath("//*[text()=' Notification']"));
Actions act72 = new Actions (driver);
act72.moveToElement(action72).build().perform();
driver.findElement(By.xpath("//*[text()='more_vert']")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='SMS'])[1]")).click();

Thread.sleep(3000);
WebElement action73=driver.findElement(By.xpath("//*[text()=' Notification']"));
Actions act73 = new Actions (driver);
act73.moveToElement(action73).build().perform();
driver.findElement(By.xpath("//*[text()='more_vert']")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='Email']")).click();


Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='Tasks ']")).click();

Thread.sleep(4000);
driver.findElement(By.xpath("(//*[text()=' Today & Overdue '])[1]")).click();

Thread.sleep(4000);
driver.findElement(By.xpath("//*[text()=' Today ']")).click();

Thread.sleep(4000);
driver.findElement(By.xpath("//*[text()=' Today ']")).click();

Thread.sleep(4000);
driver.findElement(By.xpath("//*[text()=' Overdue ']")).click();

Thread.sleep(4000);
driver.findElement(By.xpath("//*[text()=' Overdue ']")).click();

Thread.sleep(5000);
driver.findElement(By.xpath("//*[text()=' All ']")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='All ']")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='Emails']")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='Calls']")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='SMS'])[2]")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='Notes']")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='Files']")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='Tasks'])[1]")).click();

						
// Calendar view
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()= ' event']")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//div[@class=\"user-dd\"]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()=' Everyone(Active) ']")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()='High'])[1]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()='Medium'])[3]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()='Low'])[1]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("(//mat-select[@role='listbox'])[14]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()='Prospecting'])[2]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("(//mat-select[@role=\"listbox\"])[18]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()=' Week ']")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("(//mat-select[@role=\"listbox\"])[18]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()=' Day ']")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("(//mat-select[@role=\"listbox\"])[18]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()=' Month ']")).click();      */





// LIST VIEW OPEN
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()=' checklist ']")).click();
/*
Thread.sleep(2000);
driver.findElement(By.xpath("//input[@placeholder='Choose date']")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='Done']")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//input[@placeholder='Choose date']")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()=' Clear ']")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("//div[@class='user-dd']")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()=' Everyone(Active) ']")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='High'])[1]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()='Medium'])[3]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()='Low'])[1]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("(//mat-select[@role='listbox'])[15]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//p[text()='follow up']")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='more_vert']")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='more_vert']")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='All'])[1]")).click();

//Thread.sleep(4000);
//WebElement checkbox=driver.findElement(By.xpath("(//input[@aria-checked='false'])[2]"));
//WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(20));
//wait.until(ExpectedConditions.elementToBeClickable(checkbox));

Thread.sleep(3000);
driver.findElement(By.xpath("//div[@class='mat-slide-toggle-bar']")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//input[@placeholder='Choose date']")).click();
					 
Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='Done']")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//input[@placeholder='Choose date']")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()=' Clear ']")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='High'])[1]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()='Medium'])[3]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()='Low'])[1]")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("//div[@class='user-dd']")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()=' Everyone(Active) ']")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("(//mat-select[@role='listbox'])[15]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()='follow up'])[2]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='more_vert']")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='more_vert']")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='All'])[1]")).click();     */

Thread.sleep(3000);
driver.findElement(By.xpath("(//label[@class='mat-checkbox-layout'])[2]")).click();




	
// DEALS MODULES ( fully completed )				
Thread.sleep(3000);
driver.findElement(By.xpath("//img[@mattooltip='Deals']")).click();
/*					
Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()=' Deal']")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='CREATE'])[2]")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("(//input[@type='text'])[9]")).click();					
						
Thread.sleep(3000);
driver.findElement(By.xpath("(//input[@type='text'])[9]")).sendKeys("Testing Automation 2");
						
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='Testing automation 2']")).click();
						
Thread.sleep(3000);
driver.findElement(By.id("dealName")).sendKeys("Ice Cream");
												
Thread.sleep(3000);
driver.findElement(By.id("pipeValue")).click();
						
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()=' Prospeting ']")).click();
						
Thread.sleep(3000);
driver.findElement(By.id("stageValue")).click();
						
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='1 ']")).click();
						
Thread.sleep(3000);
driver.findElement(By.xpath("(//input[@type='text'])[12]")).click();
						
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()=' James Rajesh ']")).click();
						
Thread.sleep(3000);
driver.findElement(By.id("oppvalue")).sendKeys("100");
						
Thread.sleep(3000);
driver.findElement(By.xpath("(//textarea[@placeholder='Notes'])[1]")).sendKeys("Its break time");
						
Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='CREATE'])[2]")).click();
						
Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='Sales'])[1]")).click();
						
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()=' Prospeting ']")).click(); 


// PIPELINE CREATE					
Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()=' add '])[1]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()='CREATE'])[5]")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("(//input[@role='combobox'])[15]")).sendKeys("Testing Automation 2");
												
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='Testing automation 2']")).click();
						
Thread.sleep(3000);
driver.findElement(By.xpath("(//input[@placeholder='Name'])[2]")).sendKeys("James");
						
Thread.sleep(2000);
driver.findElement(By.xpath("(//input[@placeholder='Name'])[2]")).click();
						
Thread.sleep(3000);
driver.findElement(By.xpath("(//div[@class='ng-input'])[16]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("(//div[@class='ng-input'])[16]")).click();
											
Thread.sleep(3000);
driver.findElement(By.xpath("(//input[@formcontrolname='oppvalue'])[2]")).sendKeys("10");
												
Thread.sleep(3000);
driver.findElement(By.xpath("(//input[@type='text'])[29]")).click();
						
//Thread.sleep(3000);
//driver.findElement(By.xpath("//*[text()=' James Rajesh ']")).click();
												
Thread.sleep(2000);
driver.findElement(By.xpath("(//textarea[@formcontrolname='comments'])[2]")).sendKeys("Testing notes");
						
Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()='CREATE'])[5]")).click();  

Thread.sleep(3000);
driver.navigate().refresh();     

Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='Sales'])[1]")).click();
						
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()=' Prospeting ']")).click(); 
						
Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='Ice Cream'])[2]")).click();
					
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()= ' Add Task ']")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("//input[@value='Create']")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()=' Cancel '])[6]")).click();

/*
// need to fix the task
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='Select task type']")).click();
						
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()=' Inbound ']")).click();
						
Thread.sleep(3000);
driver.findElement(By.xpath("(//span[@class='ng-arrow-wrapper'])[8]")).click();
						
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()=' James Rajesh ']")).click();
												
Thread.sleep(3000);
driver.findElement(By.xpath("(//textarea[@name='description'])[3]")).sendKeys("testing devices");
						
Thread.sleep(3000);
driver.findElement(By.id("Button")).click();
										
Thread.sleep(3000);
driver.findElement(By.xpath("(//textarea[@type='text'])[6]")).sendKeys("testing devise");
						
Thread.sleep(3000);
driver.findElement(By.id("ButtonOne")).click();    
					
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='Won']")).click();
						
Thread.sleep(3000);
driver.findElement(By.xpath("//img[@alt='logo']")).click();
						
Thread.sleep(3000);
driver.findElement(By.xpath("(//input[@placeholder='Search'])[2]")).sendKeys("Testing automation 2");
						  
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='Testing automation 2']")).click();
					
Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()=' Ice Cream '])[1]")).click();
					
Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='Reopen']")).click();
					
Thread.sleep(3000);
driver.findElement(By.xpath("//img[@mattooltip='Deals']")).click();
					
Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='Sales'])[1]")).click();
					
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()=' Prospeting ']")).click(); 
					
Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='Ice Cream'])[1]")).click();
					
Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='Lost']")).click();
					
Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='Select Reason']")).click();
					
Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='Stopped Responding ']")).click();
					
Thread.sleep(2000);
driver.findElement(By.xpath("//textarea[@name='lostreasonNote']")).sendKeys("Testing notes");
					
Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()=' Cancel '])[5]")).click();
					
Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='Lost']")).click();
					
Thread.sleep(2000);
driver.findElement(By.xpath("//textarea[@name='lostreasonNote']")).sendKeys("Testing notes");
					
Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()=' Mark as Lost ']")).click();
										
Thread.sleep(3000);
driver.findElement(By.xpath("//img[@alt='logo']")).click();
					
Thread.sleep(3000);
driver.findElement(By.xpath("(//input[@placeholder='Search'])[2]")).
sendKeys("Testing automation 2");
					  
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='Testing automation 2']")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()=' Ice Cream ']")).click();
					
Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='Reopen']")).click();        
					
Thread.sleep(3000);
driver.findElement(By.xpath("//img[@mattooltip='Deals']")).click();    

Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='Sales'])[1]")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()=' Prospeting ']")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='Ice Cream'])[1]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='more_vert']")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='Edit']")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()='CANCEL'])[8]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='more_vert']")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='Edit']")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("(//input[@type='number'])[3]")).clear();

Thread.sleep(2000);
driver.findElement(By.xpath("(//input[@type='number'])[3]")).sendKeys("300");

Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='Save'])[4]")).click();     

Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='James'])[1]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='more_vert']")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()='Delete'])[3]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()=' Cancel '])[4]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()='James'])[1]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='more_vert']")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()='Delete'])[3]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()=' Delete '])[1]")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='Ice Cream'])[1]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='more_vert']")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()='Delete'])[3]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()=' Delete '])[1]")).click();      

Thread.sleep(3000);
driver.findElement(By.xpath("//img[@alt='logo']")).click();
						
Thread.sleep(3000);
driver.findElement(By.xpath("(//input[@placeholder='Search'])[2]")).sendKeys("Testing automation 2");
						  
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='Testing automation 2']")).click();      




/*
// SEQUENCES MODULE	
Thread.sleep(3000);
driver.findElement(By.xpath("//img[@mattooltip=\"Sequences\"]")).click();
	
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()=' Sequence']")).click();
	
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@placeholder='Sequence Name']")).sendKeys("Samsung");

Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='Save'])[5]")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("//mat-select[@formcontrolname='preferred_timezone']")).click();
	
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()=' (GMT+05:30) India Standard Time - Colombo ']")).click();
	
Thread.sleep(2000);
driver.findElement(By.xpath("//mat-select[@formcontrolname='preferred_time']")).click();
	
Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='9 am-5 pm']")).click();
		
Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='TU '] ")).click();
	
Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='TU '] ")).click();
	
Thread.sleep(3000);
driver.findElement(By.id("mat-slide-toggle-1")).click();
	
Thread.sleep(3000);
driver.findElement(By.id("mat-slide-toggle-1")).click();
	
Thread.sleep(3000);
driver.findElement(By.xpath("(//input[@type='number'])[3]")).sendKeys("1");
	
Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='Save'])[5]")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='Save ']")).click();

driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.findElement(By.xpath(" //mat-select[@formcontrolname='system']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()=' Automated ']")).click();
	
Thread.sleep(3000);
driver.findElement(By.id("mat-select-133")).click();
	
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()=' Email']")).click();
		
Thread.sleep(3000);
driver.findElement(By.id("mat-select-134")).click();
	
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()=' Search ']")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='Delete'])[3]")).click();
	
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='+ Add New Step']")).click();
		
Thread.sleep(3000);
driver.findElement(By.xpath("(//input[@type='number'])[3]")).sendKeys("1");
	
Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='Save'])[5]")).click();
		
driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
driver.findElement(By.xpath(" //mat-select[@formcontrolname='system']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()=' Automated ']")).click();
	
Thread.sleep(3000);
driver.findElement(By.id("mat-select-136")).click();
	
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()=' Email']")).click();
	
Thread.sleep(3000);
driver.findElement(By.id("mat-select-137")).click();	
	
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()=' Search ']")).click();

Thread.sleep(3000);
driver.findElement(By.id("mat-select-137")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("//button[@class='newtempbtn']")).click();
	
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@placeholder='Template Name']")).sendKeys("Samsung Monbile");
	
Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='Select Content Type'])[2]")).click();
	
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='E-Mail']")).click();
	
Thread.sleep(3000);
driver.findElement(By.id("owner_Id")).click();
	
Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()=' James Rajesh '])[1]")).click();
	
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='Share With Team?']")).click();
	
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='My Account Only']")).click();
	
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@data-placeholder='Subject']")).sendKeys("email testing");
	
Thread.sleep(3000);
driver.findElement(By.xpath("(//div[@data-placeholder='Enter the Email template'])[2]")).sendKeys("Email testing for automation");
	
Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='Save'])[5]")).click();
	
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='Save ']")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='+ Add New Step']")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("(//input[@type='number'])[3]")).sendKeys("2");

Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()='Save'])[5]")).click();

Thread.sleep(2000);
driver.findElement(By.id("mat-select-138")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()=' Manual ']")).click();

Thread.sleep(2000);
driver.findElement(By.id("mat-select-139")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()=' Task']")).click();

Thread.sleep(2000);
driver.findElement(By.id("mat-select-140")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()=' Others Can View, Use and Edit '])[1]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()='Save '])[1]")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='Save'])[4]")).click();      
	
Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='10'])[2]")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()=' 200 ']")).click();

Thread.sleep(3000);
JavascriptExecutor raj = (JavascriptExecutor)driver;
WebElement scroll40 = driver.findElement(By.xpath("//*[text()=' Samsung ']"));
raj.executeScript("arguments[0].scrollIntoView();", scroll40);          

Thread.sleep(3000);
driver.findElement(By.xpath("//img[@alt='logo']")).click();

Thread.sleep(4000);
driver.findElement(By.xpath("(//input[@placeholder='Search'])[2]")).sendKeys("Testing automation 2");
	
Thread.sleep(4000);
driver.findElement(By.xpath("//*[text()='Testing automation 2']")).click(); 

Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='add_circle_outline' ])[4]")).click();
					  
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='Start']")).click();
					  
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='Select Sequence']")).click();
					  
Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()=' Samsung'])[1]")).click();
					  
Thread.sleep(3000);
driver.findElement(By.xpath("(//div[@class='ng-select-container'])[5]")).click();
					  					  
Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='Automation'])[1]")).click();
					  
Thread.sleep(3000);
driver.findElement(By.xpath("(//*[@formcontrolname='from'])[2]")).click();
					  					  
Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='james@zibtek.in'])[2]")).click();
					  
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='Start']")).click(); 

Thread.sleep(3000);
JavascriptExecutor script40=(JavascriptExecutor)driver;
script40.executeScript("window.scrollBy(0,250)", "");
					 					 
Thread.sleep(3000);
WebElement action40=driver.findElement(By.xpath("(//*[text()='Step 0/2'])[1]"));
Actions act40 = new Actions (driver);
act40.moveToElement(action40).build().perform();
driver.findElement(By.xpath("(//*[text()='more_vert'])[1]")).click();


Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()='View in sequences']")).click();  

Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='10'])[2]")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()=' 200 ']")).click();

Thread.sleep(3000);
JavascriptExecutor ja = (JavascriptExecutor)driver;
WebElement scroll1 = driver.findElement(By.xpath("//*[text()=' Samsung ']"));
ja.executeScript("arguments[0].scrollIntoView();", scroll1);

Thread.sleep(2000);
driver.findElement(By.xpath("(//td[@class='sequence-pos content-pos'])[41]")).click();

Thread.sleep(3000);
JavascriptExecutor jam = (JavascriptExecutor)driver;
WebElement scroll2 = driver.findElement(By.xpath("(//a[text()='james@zibtek.in'])[1]"));
jam.executeScript("arguments[0].scrollIntoView();", scroll2);

Thread.sleep(3000);
driver.findElement(By.xpath("(//label[@class='mat-checkbox-layout'])[44]")).click();
    	
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='Pause Sequence']")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("(//label[@class='mat-checkbox-layout'])[43]")).click();
	
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='Make Active']")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("(//label[@class='mat-checkbox-layout'])[44]")).click();
   
Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='Resend Campaign'])[1]")).click();
    
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='Select Sender']")).click();
    
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='james@zibtek.in ']")).click();
    
Thread.sleep(3000);
Actions act41=new Actions(driver);
WebElement ele=driver.findElement(By.xpath("//button[@class='green-btn mt-10 resendBtn wd-btn']"));
act41.moveToElement(ele).build().perform();
act41.click();

Thread.sleep(3000);
JavascriptExecutor jame = (JavascriptExecutor)driver;
WebElement scroll3 = driver.findElement(By.xpath("//*[text()=' Samsung ']"));
jame.executeScript("arguments[0].scrollIntoView();", scroll3);

Thread.sleep(3000);
driver.findElement(By.xpath("(//td[@class='sequence-pos content-pos'])[41]")).click();

//Thread.sleep(3000);
//JavascriptExecutor james = (JavascriptExecutor)driver;
//WebElement scroll21 = driver.findElement(By.xpath("(//*[text()='james@zibtek.in'])[1]"));
//james.executeScript("arguments[0].scrollIntoView();", scroll21);

Thread.sleep(3000);
WebElement action42=driver.findElement(By.xpath("//*[text()=' Samsung ']"));
Actions act42 = new Actions (driver);
act42.moveToElement(action42).build().perform();
driver.findElement(By.xpath("(//*[text()='more_vert'])[2]")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='Export'])[1]")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("(//input[@type='radio'])[3]")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='Cancel'])[7]")).click();

Thread.sleep(3000);
WebElement action30=driver.findElement(By.xpath("//*[text()=' Samsung ']"));
Actions act30 = new Actions (driver);
act30.moveToElement(action30).build().perform();
driver.findElement(By.xpath("(//*[text()='more_vert'])[2]")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='Export'])[1]")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("(//input[@type='radio'])[3]")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='Export'])[5]")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='Ok '])[2]")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("(//label[@class='mat-checkbox-layout'])[42]")).click();


Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='exit_to_app ']")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("(//input[@type='radio'])[5]")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='Export'])[8]")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='Ok '])[3]")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("//label[@for='mat-checkbox-106-input']")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='delete ']")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()=' DELETE ']")).click();   */

/*	
// CREATE TEMPLATES MODULES	
Thread.sleep(3000);
driver.findElement(By.xpath("//img[@mattooltip='Templates']")).click();


Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()=' Template']")).click();


Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()='Save'])[4]")).click();

Thread.sleep(3000);
driver.findElement(By.id("name")).sendKeys("Bottels");
	
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='Select Content Type']")).click();
	
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='E-Mail']")).click();
	
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='Share With Team?']")).click();
	
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='My Account Only']")).click();
	
Thread.sleep(3000);
driver.findElement(By.id("owner_Id")).click();
	
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()=' James Rajesh ']")).click();
	
Thread.sleep(3000);
driver.findElement(By.id("archived")).click();
	
Thread.sleep(3000);
driver.findElement(By.id("archived")).click();
	
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@data-placeholder='Subject']")).sendKeys("testing email");
	
Thread.sleep(3000);
driver.findElement(By.xpath("//div[@data-placeholder='Enter the E-Mail template']")).sendKeys("need juice on break time");
	
Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()='Save'])[4]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()='10'])[2]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()=' 200 ']")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("//input[@placeholder='Search Template']")).sendKeys("Bottels");
	
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='Bottels']")).click();
	
Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()=' Cancel '])[4]")).click();
	
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='Active']")).click();
	
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='InActive']")).click();
	
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='more_vert']")).click();
	
Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='Export'])[1]")).click();
	
Thread.sleep(3000);
driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
	
Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()=' Send ']")).click();
	
Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()= ' Ok '])[2]")).click();  
	
Thread.sleep(3000);
WebElement action43=driver.findElement(By.xpath("(//*[text()='Bottels'])[1]"));
Actions act43 = new Actions (driver);
act43.moveToElement(action43).build().perform();
driver.findElement(By.xpath("(//*[text()=' more_vert '])[43]")).click();


Thread.sleep(3000);
JavascriptExecutor james = (JavascriptExecutor)driver;
WebElement scroll21 = driver.findElement(By.xpath("(//*[text()='Delete'])[3]"));
james.executeScript("arguments[0].scrollIntoView();", scroll21);

Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()='Duplicate']")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()=' Duplicate '])[1]")).click();

Thread.sleep(4000);
driver.findElement(By.xpath("(//*[text()='Save'])[4]")).click();  


Thread.sleep(3000);
JavascriptExecutor raje = (JavascriptExecutor)driver;
WebElement scroll22 = driver.findElement(By.xpath("//*[text()='Bottels(Duplicate)']"));
raje.executeScript("arguments[0].scrollIntoView();", scroll22);

Thread.sleep(3000);
WebElement action32=driver.findElement(By.xpath("(//p[@title='James Rajesh'])[9]"));
Actions act32 = new Actions (driver);
act32.moveToElement(action32).build().perform();
driver.findElement(By.xpath("(//*[text()=' more_vert '])[44]")).click();


Thread.sleep(3000);
JavascriptExecutor james1 = (JavascriptExecutor)driver;
WebElement scroll23 = driver.findElement(By.xpath("(//*[text()='Delete'])[3]"));
james1.executeScript("arguments[0].scrollIntoView();", scroll23);

Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()='Delete'])[3]")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("//*[text()=' Delete ']")).click();     

//Thread.sleep(2000);
//driver.findElement(By.xpath("(//*[text()='10'])[2]")).click();
//
//Thread.sleep(2000);
//driver.findElement(By.xpath("//*[text()=' 200 ']")).click();

Thread.sleep(3000);
WebElement action33=driver.findElement(By.xpath("(//p[@title='James Rajesh'])[8]"));
Actions act33 = new Actions (driver);
act33.moveToElement(action33).build().perform();
driver.findElement(By.xpath("(//*[text()=' more_vert '])[43]")).click();

Thread.sleep(3000);
JavascriptExecutor james2 = (JavascriptExecutor)driver;
WebElement scroll24 = driver.findElement(By.xpath("(//*[text()='Delete'])[3]"));
james2.executeScript("arguments[0].scrollIntoView();", scroll24);

Thread.sleep(3000);
driver.findElement(By.xpath("//p[text()='Archive']")).click();

Thread.sleep(3000);
driver.findElement(By.id("archived")).click();

Thread.sleep(3000);
JavascriptExecutor james3 = (JavascriptExecutor)driver;
WebElement scroll25 = driver.findElement(By.xpath("//*[text()='Bottels']"));
james3.executeScript("arguments[0].scrollIntoView();", scroll25);

Thread.sleep(3000);
WebElement action34=driver.findElement(By.xpath("(//p[@title='James Rajesh'])[3]"));
Actions act34 = new Actions (driver);
act34.moveToElement(action34).build().perform();

Thread.sleep(3000);
driver.findElement(By.xpath("(//i[@class='material-icons more_vert'])[14]")).click();

Thread.sleep(3000);
JavascriptExecutor james4 = (JavascriptExecutor)driver;
WebElement scroll26 = driver.findElement(By.xpath("//p[text()='Delete']"));
james4.executeScript("arguments[0].scrollIntoView();", scroll26);

Thread.sleep(3000);
driver.findElement(By.xpath("//p[text()='Activate']")).click();


Thread.sleep(3000);
driver.findElement(By.id("archived")).click();

Thread.sleep(3000);
JavascriptExecutor james5 = (JavascriptExecutor)driver;
WebElement scroll27 = driver.findElement(By.xpath("//*[text()='Bottels']"));
james5.executeScript("arguments[0].scrollIntoView();", scroll27);


Thread.sleep(3000);
WebElement action35=driver.findElement(By.xpath("(//p[@title='James Rajesh'])[8]"));
Actions act35 = new Actions (driver);
act35.moveToElement(action35).build().perform();

Thread.sleep(3000);
driver.findElement(By.xpath("(//i[@class='material-icons more_vert'])[43]")).click();


Thread.sleep(3000);
JavascriptExecutor james6 = (JavascriptExecutor)driver;
WebElement scroll28 = driver.findElement(By.xpath("(//*[text()='Delete'])[3]"));
james6.executeScript("arguments[0].scrollIntoView();", scroll28);

Thread.sleep(3000);
driver.findElement(By.xpath("//p[text()='Edit']")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("(//*[text()='Save'])[4]")).click();

Thread.sleep(3000);
JavascriptExecutor james7 = (JavascriptExecutor)driver;
WebElement scroll29 = driver.findElement(By.xpath("//*[text()='Bottels']"));
james7.executeScript("arguments[0].scrollIntoView();", scroll29);

Thread.sleep(3000);
WebElement action36=driver.findElement(By.xpath("(//p[@title='James Rajesh'])[8]"));
Actions act36 = new Actions (driver);
act36.moveToElement(action36).build().perform();

Thread.sleep(3000);
driver.findElement(By.xpath("(//i[@class='material-icons more_vert'])[43]")).click();


Thread.sleep(3000);
JavascriptExecutor james8 = (JavascriptExecutor)driver;
WebElement scroll30 = driver.findElement(By.xpath("(//*[text()='Delete'])[3]"));
james8.executeScript("arguments[0].scrollIntoView();", scroll30);

Thread.sleep(3000);
driver.findElement(By.xpath("(//*[text()='Delete'])[3]")).click();

Thread.sleep(3000);
driver.findElement(By.xpath("//*[text()=' Delete ']")).click();     */






	}}