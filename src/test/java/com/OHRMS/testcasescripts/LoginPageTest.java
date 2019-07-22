package com.OHRMS.testcasescripts;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.OHRMS.Pages.Dashboardpage;
import com.OHRMS.Pages.LoginPage;
import com.OHRMS.baseclass.Baseclass;
import com.OHRMS.util.Testutil;
import com.mongodb.diagnostics.logging.Loggers;

//import Academy.HomePage;

public class LoginPageTest extends Baseclass {

	
	com.OHRMS.Pages.HomePage hp;
	LoginPage lp;
	private String loginpageimg;
	
	// logger class declaration on current test case class name
Logger logger=Logger.getLogger(LoginPageTest.class);
	String configurepath=System.getProperty("C:\\Users\\sudheer\\git\\Mayselenium1030am\\OHRMS\\src\\main\\java\\log4j.properties");
   
	public LoginPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeTest
	public void setup() throws Exception{
		logger.info("initialization method started");
		initialization();
		lp=new LoginPage();	//login page initialization
		
	}
	
	@Test(priority=1)
	public void loginPageTitleTest(){
		logger.info("loginpagetitlevalidation started");
		String title=lp.validateloginPageTitle();
		Assert.assertEquals(title, "OrangeHRM");
		
		}
	

	@Test(priority=2)
	public void LoginTest() throws Exception{
		
		takescreenshot("loginpageimg");
		logger.info("screenshot captured");
		hp=lp.login(prop.getProperty("username"),prop.getProperty("password"));
		logger.info("login testcase completed");
	}
	

	@AfterTest
	public void teardown(){
		//driver.quit();
	}
}
