package Company_TestScripts;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.awt.AWTException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import POM_Company.Profile;
import base.BaseTest;
import utils.ExcelUtilityReg;
import utils.TestListener;
import org.testng.Assert;


@Listeners(TestListener.class)

public class TC_ID_02_Profile extends BaseTest {
	
	//Profile profile;
	
	  @Test
	  //To check that toggle closed and open the left panel
	    public void TC_ID_02_01 () throws InterruptedException, IOException {
		 	    	
		openCompanybrowser();
			
		loginCompany();
		  
		Profile Profile = new Profile(driver);
		
	    companydriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	        
	    Profile.ToggleButtonAction();
	      
	    System.out.println("Toggle button is working fine, and It is able to close nd Open sidebar");
	                
	    }
	    
	  @Test
	    //To check that notification icon working fine and Clear all button should be working Properly
	    public void TC_ID_02_02 () throws InterruptedException {
		  
	        Profile Notification = new Profile(companydriver);
		  
		  if (Notification.CheckNotificationIconDisplayed()) {
	            System.out.println("The notification icon is displayed.");
	        } else {
	            System.out.println("The notification icon is not displayed.");
	        }

	        // Check if the icon is enabled
	        if (Notification.CheckNotificationIconEnabled()) {
	            System.out.println("The notification icon is enabled.");
	        } else {
	            System.out.println("The notification icon is not enabled.");
	        }

	        Notification.CheckNotificationIconClick();
	        
//	        //click on anyone notification	
//	        
//	         Notification.ClickonRecentNotifications();  
//	        
//	         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	         
	         companydriver.navigate().refresh();
	         
//	         //To check Clear All button displayed
//
//	         Notification.CheckNotificationIconClick();
//	         
//	         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	         
//	        Notification.ClickClearAllButton();
	         	         
          }
	  
	  
	    @Test
	    //To click on the Profile name and check option available there 
	    public void TC_ID_02_03 () throws InterruptedException, IOException {
	    	
	    	Profile ProfileList = new Profile(companydriver);
	    	
	    	ProfileList.SelectProfileIcon();
	    		        
	        Thread.sleep(5000);
	    	
	      	ProfileList.SelectDashboardicon();
	    	
	      	companydriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    	
	   	   ProfileList.SelectProfileIcon();
	    		    	
	    	ProfileList.SelectAboutUs();
	    		    	
	    	ProfileList.SelectProfileIcon();
	    		    	
	    	ProfileList.SelectContactUs();
	    		    	
	    	ProfileList.SelectProfileIcon();
	    		    	
	    	ProfileList.SelectProfile();
	    	
	    	ProfileList.SelectProfileIcon();
	    	
	    	ProfileList.SelectLogoutIcon();
	    	
	    	loginCompany();
	       	
	        companydriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	            
	        }	 
	    
	    @Test
	    //To click on dashboard and check the all the menus working there 
	    public void TC_ID_02_04 () throws InterruptedException {
	    	    	
	    	Profile Home = new Profile(companydriver);
	    	
	    	Home.Click_Job_Posted();
	    	
	    	Home.Click_Home();
	    	
	    	Home.Click_Pending_Applications();
	    	
	    	Home.Click_Home();
	    	
	    	Home.Click_Accepted_Applications();
	    	
	    	Home.Click_Home();
	    	
	    	Home.Click_Shortlisted_Applications();
	    	
	    	Home.Click_Home();

	    	Home.Click_Latest_Candidate_Applications();	   
	    	
	    	Home.Click_Home();

	    	
             }
	    @Test
	    //Select the Profile and check the tab displayed  
	    public void TC_ID_02_05 () throws InterruptedException {
	    	
            Profile ProfileList = new Profile(companydriver);
	    	
	    	ProfileList.SelectProfileIcon();
	    	
	    	ProfileList.SelectProfile();
	    		        
	        Thread.sleep(5000);
	        
	        ProfileList.Check_About_Tab();
	        
	        ProfileList.Check_Edit_Profile_Tab();
	        
	        ProfileList.Check_Security_Tab();
	                
         }
	    
	    @Test
	    //To check that profile image and added email address 
	    public void TC_ID_02_06 () throws InterruptedException {

            Profile About = new Profile(companydriver);
            
            About.Check_Profile_Picture();
            
           // About.Check_Email_Address();

	    	}
	    
	    @Test
	    //To check Logo and cover photo menu working fine.
	    public void TC_ID_02_07 () throws InterruptedException {
	    	
            Profile Edit_Profile = new Profile(companydriver);

            Edit_Profile.Check_Edit_Profile_Tab();
            
            // Verify if the Check_Upload_Logo is displayed
            if (Edit_Profile.Check_Upload_Logo()) {
            	
                System.out.println("The Upload_Logo is displayed.");

                // Verify if the Check_Upload_Logo is enabled
                if (Edit_Profile.Check_Upload_Logo()) {
                	
                    System.out.println("The Upload_Logo is enabled.");

                } else {
                    System.out.println("The Upload_Logo is not enabled.");
                }
            } else {
                System.out.println("The Upload_Logo is not displayed.");
            }
	    	 		    
            // Verify if the View_button_upload_Logo is displayed
            if (Edit_Profile.Check_View_button_upload_Logo()) {
            	
                System.out.println("The View_button_upload_Logo is displayed.");

                // Verify if the View_button_upload_Logo is enabled
                if (Edit_Profile.Check_View_button_upload_Logo()) {
                	
                    System.out.println("The View_button_upload_Logo is enabled.");

                } else {
                    System.out.println("The View_button_upload_Logo is not enabled.");
                }
            } else {
                System.out.println("The View_button_upload_Logo is not displayed.");
            }
            
            // Verify if the Upload_Cover_Photo is displayed
            if (Edit_Profile.Check_Upload_Cover_Photo()) {
            	
                System.out.println("The Upload_Cover_Photo is displayed.");

                // Verify if the Upload_Cover_Photo is enabled
                if (Edit_Profile.Check_Upload_Cover_Photo()) {
                	
                    System.out.println("The Upload_Cover_Photo is enabled.");

                } else {
                    System.out.println("The Upload_Cover_Photo is not enabled.");
                }
            } else {
                System.out.println("The Upload_Cover_Photo is not displayed.");
            }
            
            // Verify if the Check_View_button_Upload_Cover_Photo is displayed
            if (Edit_Profile.Check_View_button_Upload_Cover_Photo()) {
            	
                System.out.println("The Upload_Cover_Photo is displayed.");

                // Verify if the Upload_Cover_Photo is enabled
                if (Edit_Profile.Check_View_button_Upload_Cover_Photo()) {
                	
                    System.out.println("The Upload_Cover_Photo is enabled.");

                } else {
                    System.out.println("The Upload_Cover_Photo is not enabled.");
                }
            } else {
                System.out.println("The Upload_Cover_Photo is not displayed.");
            }
        }
	    @Test
	   // To check that all the fields/dropdown available 
	    public void TC_ID_02_08 () throws InterruptedException {
	    	
            Profile Edit_Profile_Page = new Profile(companydriver);
	    	
	        AssertJUnit.assertEquals(Edit_Profile_Page.Check_Company_Name_field(), "The Company_Name_field is not enabled.");
	        
	        AssertJUnit.assertEquals(Edit_Profile_Page.Check_CIN_NO_field(), "The CIN_NO_field is not enabled.");

	        AssertJUnit.assertEquals(Edit_Profile_Page.Check_Country_dropdown(), "The Country_dropdown is not enabled.");

	        AssertJUnit.assertEquals(Edit_Profile_Page.Check_State_dropdown(), "The State_dropdown is not enabled.");

	        AssertJUnit.assertEquals(Edit_Profile_Page.Check_City_dropdown(), "The City_dropdown is not enabled.");

	        AssertJUnit.assertEquals(Edit_Profile_Page.Check_Website_field(), "The Website_field is not enabled.");

	        AssertJUnit.assertEquals(Edit_Profile_Page.Check_Email_field(), "The Email_field is not enabled.");

	        AssertJUnit.assertEquals(Edit_Profile_Page.Check_PhoneNo_field(), "The PhoneNo_field is not enabled.");

	        AssertJUnit.assertEquals(Edit_Profile_Page.Check_Foundation_Date_field(), "The Foundation_Date_field is not enabled.");

	        AssertJUnit.assertEquals(Edit_Profile_Page.Check_Industry_field(), "The Industry_field is not enabled.");

	        AssertJUnit.assertEquals(Edit_Profile_Page.Check_SocialMedia_field(), "The SocialMedia_field is not enabled.");

	        AssertJUnit.assertEquals(Edit_Profile_Page.Check_Description_field(), "The Description_field is not enabled.");

	       // Assert.assertTrue(Edit_Profile_Page.Check_Update_Button(), "The Update_Button is not enabled.");	        

        }
	   
	    @Test
	   // Add company with name of "Test Toyata Cars Ltd"
	    public void TC_ID_02_09 () throws InterruptedException, IOException, AWTException {
	    
	    	 String filePath = data.getdata("filePath");   
			  String SheetName = data.getdata("sheetName_3");	
    	       	
    	// Initialize Excel utility
        ExcelUtilityReg excel = new ExcelUtilityReg(filePath, SheetName);
        Profile Register_Company = new Profile(companydriver);

        // Iterate through rows in Excel
        int rowCount = excel.getRowCount();
        for (int i = 1; i <= rowCount; i++) { // Assuming row 0 is the header
        	String ProfilePicfilePath = excel.getCellData(i, 12);
        	String CoverPicfilePath = excel.getCellData(i, 13);
            String AddCompanyName1 = excel.getCellData(i, 0);
            String  CIN_Number1 = excel.getCellData(i, 1);
            String Country1= excel.getCellData(i, 2);
            String State1 = excel.getCellData(i, 3);
            String City1 = excel.getCellData(i, 4);
            String Website1= excel.getCellData(i, 5);
         //   String Email1= excel.getCellData(i, 6);
            String PhoneNo1= excel.getCellData(i, 7);
           // String FoundationDate1= excel.getCellData(i, 8);
            String Industry1 = excel.getCellData(i, 9);
            String SocialMedia1 = excel.getCellData(i, 10);
            String Description1 = excel.getCellData(i, 11);
       

            // Fill the registration form
            Register_Company.Enter_Data(ProfilePicfilePath,CoverPicfilePath,AddCompanyName1,
            		CIN_Number1, 
            		Country1,
            		State1,
            		City1,	
  	                   Website1,
	               //    Email1,
	                   PhoneNo1,
//	                 FoundationDate, 
	                   Industry1,
	                   SocialMedia1,
	                   Description1);
            
            break;
        }
        
        Thread.sleep(3000);
        
        Profile foundation_Date = new Profile(companydriver);
        
        foundation_Date.send_Foundation_Date();
        
        Thread.sleep(3000);

    	        
    }
	    @Test
	   // Click on update button and check the about section 
	    public void TC_ID_02_10 () throws InterruptedException {
	    	
	        Profile Update = new Profile(companydriver);
	        Thread.sleep(3000);
	        Update.Check_Update_Button_1();  
            
            Thread.sleep(2000);
            Profile ProfileList = new Profile(companydriver);
	    	
            ProfileList.Check_About_Tab();
            Thread.sleep(2000);
	        
	        Update.Check_About_Description();
	        
	        Update.Check_About_Address();
	        
	        Update.Check_About_Email();
	        
	        Update.Check_About_Phone_No();
	        
        }
	   	 
	  }