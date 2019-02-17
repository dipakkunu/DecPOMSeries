package com.pagelibrery.com.ranfordhy;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

import Base.Testbase;
import Datadriven.Excel;
import Webtable.Tableclass;

public class Reprository1 extends Testbase
{
WebDriver driver;
public void launch(String browser,String url) throws InterruptedException, IOException{
	
if(browser.equalsIgnoreCase("chrome"))
{

	System.setProperty("webdriver.chrome.driver","D:\\poject folder\\chromedriver_win32\\chromedriver.exe");
	driver=new ChromeDriver();
	
}
else if(browser.equalsIgnoreCase("firefox"))
{
   System.setProperty("webdriver.gecko.driver","D:\\poject folder\\geckodriver-v0.19.0-win64\\geckodriver.exe");
	driver=new FirefoxDriver();                 
	
}
driver.get("http://srssprojects.in/");
Thread.sleep(5000);
driver.manage().window().maximize();



	
	
	
	
	
	
	
	
//	System.setProperty(locator1("chromedrivername"),locator1("chromepath"));
//	driver=new ChromeDriver();
//	driver.get(locator1("urlbuild1"));
//	Thread.sleep(5000);
//	driver.manage().window().maximize();



/*if(Validation.IsTextIsPresent(driver ,"acquire a further 35%"))
{
    Reporter.log("test is passed");
}
else
{
    Reporter.log("test is failed");
    Generic.screenshot(driver,"launch");
   
}*/
}
private void ifelse(boolean equalsIgnoreCase) {
	// TODO Auto-generated method stub
	
}
public void login() throws InterruptedException, IOException
{
	RanfordHomepage.username(driver).sendKeys(locator1("username"))  ;
	RanfordHomepage.password(driver) .sendKeys(locator1("password"))  ;
	RanfordHomepage.login(driver).click();
//if(Validation.IsTitleIsPresent(driver,"RANFORD BANK"))
//{
//    Reporter.log("test is passed");
//}
//else
//{
//    Reporter.log("test is failed");
//   
//}  
}
public void branches()
{
Adminpage.branches(driver).click();

}
public void newbranch(String branchname,String address1,String address2,String zipcode,String country,String state,String city) throws InterruptedException, IOException
{
	Branchpage.newbranch(driver).click();
  
    Newbranchpage.branchname1(driver).sendKeys(branchname);
    Thread.sleep(5000);   
    Newbranchpage.Address1(driver).sendKeys(address1);
    Thread.sleep(5000);   
    Newbranchpage.Address2(driver).sendKeys(address2);
    Thread.sleep(5000);   
    Newbranchpage.zipcode(driver).sendKeys(zipcode);
       
    Newbranchpage.country(driver).selectByVisibleText(country);
      
    Newbranchpage.state(driver).selectByVisibleText(state);
    Thread.sleep(5000);   
    Newbranchpage.city(driver).selectByVisibleText(city);
       
    Newbranchpage.submit(driver).click();
  /*  if(Validation.IsAlertIsPresent(driver,"new branch"))
    {
    Reporter.log("test is passed");   
    }
    else
    {
    Reporter.log("test is failed");   
    Generic.screenshot(driver,"newbranch");
    }*/
   // driver.switchTo().alert().dismiss();
    Thread.sleep(5000);   
}
//store data in object array format from excel sheet
	public Object[][] excelcontent(String filename,String sheetname)
	{
		Excel.excelconnection(filename, sheetname);
		int rc=Excel.rcount();
		int cc=Excel.ccount();
		
		String[][] data=new String[rc-1][cc];
		
		for(int r=1;r<rc;r++)
		{
			for(int c=0;c<cc;c++)
			{
				data[r-1][c]=Excel.readdata(c, r);
			}
		}
		return data;
	}

public void branches1() throws InterruptedException
{
    Adminpage.branches(driver).click();
    Branchpage.country123(driver).selectByVisibleText("INDIA");
    Thread.sleep(5000);   
    Branchpage.state123(driver).selectByVisibleText("Karnataka");
    Branchpage.city123(driver).selectByVisibleText("BANGLORE");
    Thread.sleep(5000);   
    Branchpage.search12(driver).click();
    Thread.sleep(5000);    
}

public void Employee()
{
Adminpage.Employee(driver).click();
}
public void Newemployee(String employeename,String loginpassword,String role,String branch) throws InterruptedException, IOException
{
Employeepage.newemployee(driver).click();
Newemployeepage.employername(driver).sendKeys(employeename);
Thread.sleep(5000);   
Newemployeepage.loginpassword(driver).sendKeys( loginpassword);
Newemployeepage.role(driver).sendKeys( role);
Thread.sleep(5000);   
Newemployeepage.branch(driver).sendKeys(branch);
Thread.sleep(5000);
Newemployeepage.submit15(driver).click();
/*if(Validation.IsAlertIsPresent(driver,"new employee"))
{
 Reporter.log("test is passed");   
}
else
{
Reporter.log("test is failed");
Generic.screenshot(driver,"Newemployee");
}*/
//driver.switchTo().alert().accept();
}
public void Role()
{
Adminpage.Role(driver).click();
}
public void newrole(String rolename,String roledesc,String roletype) throws InterruptedException, IOException
{
Adminpage.Role(driver).click();
Rolepage.newrole(driver).click();   
Newrole.rolename(driver).sendKeys(rolename);
Thread.sleep(5000);   
Newrole.roledesc(driver).sendKeys(roledesc);
Thread.sleep(5000);   
Newrole.roletype(driver).selectByVisibleText(roletype);
Newrole.submit(driver).click();
//if(Validation.IsAlertIsPresent(driver,"new role"))
//{
//Reporter.log("test is passed");   
//}
//else
//{
//Reporter.log("test is failed");   
//Generic.screenshot(driver,"newrole");
//}
//driver.switchTo().alert().accept();
Thread.sleep(5000); 
}
public void logout() throws InterruptedException
{
Adminpage.logout(driver).click();   
Thread.sleep(5000);
}
public void login1() throws InterruptedException    
    {
    RanfordHomepage.branchname(driver).selectByVisibleText("marthali");
    RanfordHomepage.username(driver).sendKeys("deepak");   
    RanfordHomepage.password(driver).sendKeys("9821860848");   
    RanfordHomepage.login(driver).click();
    Thread.sleep(5000);   
   }
public void banker()
{
Bankerpage.customers(driver).click();   
}
public void newcustomer()
{
Customerpage.newcustomer(driver).click();
Newcustomerpage.customertype(driver).selectByVisibleText("Accounts");
}
public void customertype() throws IOException
{
Newcustomerpage.lastname(driver).sendKeys("Sahoo");
Newcustomerpage.midname(driver).sendKeys("Kumar");
Newcustomerpage.firsttname(driver).sendKeys("Deepak");
Newcustomerpage.dob(driver).sendKeys("06/06/1993");
Newcustomerpage.Address(driver).sendKeys("Marthali");
Newcustomerpage.city(driver).sendKeys("BANGLORE");
Newcustomerpage.zipcode(driver).sendKeys("45612");
Newcustomerpage.Emailid(driver).sendKeys("deepak.sahoo436@gmail.com");
Newcustomerpage.Phoneno(driver).sendKeys("06784244566");
Newcustomerpage.mobilenumber(driver).sendKeys("8178452066");
Newcustomerpage.openingbalance(driver).sendKeys("5000");
Newcustomerpage.submit21(driver).click();
if(Validation.IsAlertIsPresent(driver,"new role"))
{
Reporter.log("test is passed");   
}
else
{
Reporter.log("test is failed");   
Generic.screenshot(driver,"customertype");
}
driver.switchTo().alert().accept();
 }
//public void branchupdate()
//{
//	Tableclass.WebTable(driver,By.id("DG_bankdetails"),"66","edit");
//}












 }  
