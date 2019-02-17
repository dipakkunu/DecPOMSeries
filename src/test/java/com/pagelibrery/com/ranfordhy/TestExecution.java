package com.pagelibrery.com.ranfordhy;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Datadriven.Excel;

public class TestExecution extends Reprository1
	{
	@Parameters({"browser","url"})
	@BeforeTest
	public void Verifylaunch(String browser,String url) throws InterruptedException, IOException
	{
		launch(browser,url);
	}
	@Test(priority=0)
	public void Verifylogin() throws InterruptedException, IOException
	{
	login();
	}
	@Test(priority=1)
	public void Verifybranches() throws IOException, InterruptedException
	{
	branches();
	}
	/*@DataProvider(name="branchdata")
	public Object[][] verifyexcelcontent()
	{
	return excelcontent("data.xls","Sheet4");
	}
	
	@Test(priority=2,dataProvider="branchdata")
	public void verifynewbranch(String branchname,String address1, String address2,String zipcode,String country,String state,String city) throws IOException, InterruptedException, AWTException
	{
		newbranch(branchname,address1,address2,zipcode,country,state,city);
	}*/
	
	
//	@Test(priority=2)
//	public void Verifybranches1() throws InterruptedException
//	{
//	branches1();
//	}
//	@Test(priority=3)
//	public void excelcontent1() throws InterruptedException, IOException
//	{
//		Excel.excelconnection("data.xls", "Sheet4");
//		Excel.outputexcelconnection("data.xls", "output1.xls","Sheet4");
//		
//		for(int r=1;r<Excel.rcount();r++)
//		{
//			newbranch(Excel.readdata(0, r),Excel.readdata(1, r),Excel.readdata(2,r),Excel.readdata(3, r),Excel.readdata(4, r),Excel.readdata(5,r),Excel.readdata(6,r));
//			String text=driver.switchTo().alert().getText();
//			driver.switchTo().alert().accept();
//			int j=Excel.ccount();
//			if(text.contains("created susses"))
//			{
//				Excel.writedata(j++, r,"test passed");
//			}
//			else if(text.contains("already Exit"))
//			{
//				Excel.writedata(j++, r,"test failed");
//			}
//			else
//			{
//				Excel.writedata(j++, r,"n/a");
//			}
//		}
//		Excel.saveworkbook();
//	}
//	
//	@Test(priority=4)
//	public void VerifyEmployee() throws IOException
//	{
//	Employee();
//	}
//	@Test(priority=5)
//	public void excelcontent2() throws InterruptedException, IOException
//	{
//		Excel.excelconnection("data.xls", "Sheet2");
//		Excel.outputexcelconnection("data.xls", "output2.xls","Sheet2");
//		
//		for(int r=1;r<Excel.rcount();r++)
//		{
//			Newemployee(Excel.readdata(0, r),Excel.readdata(1, r),Excel.readdata(2,r),Excel.readdata(3, r));
//			String text=driver.switchTo().alert().getText();
//			driver.switchTo().alert().accept();
//			int j=Excel.ccount();
//			if(text.contains("created susses"))
//			{
//				Excel.writedata(j++, r,"test passed");
//			}
//			else if(text.contains("already Exit"))
//			{
//				Excel.writedata(j++, r,"test failed");
//			}
//			else
//			{
//				Excel.writedata(j++, r,"n/a");
//			}
//		}
//		Excel.saveworkbook();
//	}
////	@DataProvider(name="employeedata")
////	public Object[][] verifyexcelcontent1()
////	{
////	return excelcontent("data.xls","Sheet2");
////	}
////	
////	@Test(priority=5,dataProvider="employeedata")
////	
////	public void VerifyNewemployee(String employeename,String loginpassword,String role,String branch) throws InterruptedException, IOException, AWTException
////	{
////	Newemployee(employeename,loginpassword,role,branch);
////	}
//	@Test(priority=6)
//	public void VerifyRole() throws IOException
//	{
//	Role();
//	}
//	@Test(priority=7)
//	public void excelcontent() throws InterruptedException, IOException
//	{
//		Excel.excelconnection("data.xls", "Sheet3");
//		Excel.outputexcelconnection("data.xls", "output.xls","Sheet3");
//		
//		for(int r=1;r<Excel.rcount();r++)
//		{
//			newrole(Excel.readdata(0, r),Excel.readdata(1, r),Excel.readdata(2,r));
//			String text=driver.switchTo().alert().getText();
//			driver.switchTo().alert().accept();
//			int j=Excel.ccount();
//			if(text.contains("created susses"))
//			{
//				Excel.writedata(j++, r,"test passed");
//			}
//			else if(text.contains("already Exit"))
//			{
//				Excel.writedata(j++, r,"test failed");
//			}
//			else
//			{
//				Excel.writedata(j++, r,"n/a");
//			}
//		}
//		Excel.saveworkbook();
//	}
////	@DataProvider(name="roledata")
////	public Object[][] verifyexcelcontent2()
////	{
////	return excelcontent("data.xls","Sheet3");
////	}
////	
////	@Test(priority=7,dataProvider="roledata")
////	public void Verifynewrole(String rolename,String roledesc,String roletype) throws  InterruptedException, IOException, AWTException
////	{
////		newrole(rolename,roledesc,roletype);	
////	}
//	@Test(priority=8)
//	public void Verifylogout() throws InterruptedException
//	{
//	logout();
//	}
//	@Test(priority=9)
//	public void Verifylogin1() throws InterruptedException
//	{
//	login1();
//	}
//	@Test(priority=10)
//	public void Verifybanker()
//	{
//	banker();	
//	}
//	@Test(priority=11)
//	public void Verifynewcustomer() throws IOException
//	{
//	 newcustomer();
//	}
//	@Test(priority=12)
//	public void Verifycustomertype() throws IOException, AWTException
//	{
//	customertype();
//	}
//	@Test(priority=2)
//	public void Verifybranchupdate()
//	{
//	branchupdate();
//	}
	}

	
	
	
	
	
	

