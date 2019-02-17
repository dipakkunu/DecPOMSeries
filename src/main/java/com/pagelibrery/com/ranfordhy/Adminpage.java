package com.pagelibrery.com.ranfordhy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Base.Testbase;

public class Adminpage extends Testbase
{
	public static WebElement Homeoption(WebDriver driver)
	{
		return driver.findElement(By.xpath(locators("Home")));
		
	}
	public static WebElement changepasswordoption(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@src='images/admin_but_02.jpg']"));
		
	}
	public static WebElement logout(WebDriver driver)
	{
	return driver.findElement(By.xpath("//*[@src='images/admin_but_03.jpg']"));
	}
	public static WebElement branches(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@src='images/Branches_but.jpg']"));
		
	}
	public static WebElement Role(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@src='images/Roles_but.jpg']"));
		
	}
	public static WebElement users(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@src='images/Users_but.jpg']"));
		
	}
	public static WebElement Employee(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@src='images/emp_btn.jpg']"));
		
	}
	
	
}
