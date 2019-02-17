package com.pagelibrery.com.ranfordhy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Customertype 
{
	public static WebElement lastname(WebDriver driver) 
	{
		return driver.findElement(By.id("txtCLname"));
	}
	public static WebElement midname(WebDriver driver)
	{
		return driver.findElement(By.id("txtCMname"));
	}
	public static WebElement firsttname(WebDriver driver)
	{
		return driver.findElement(By.id("txtCFname"));
	}
	public static WebElement dob(WebDriver driver)
	{
		return driver.findElement(By.id("txtDOB"));
	}
	public static WebElement Address(WebDriver driver)
	{
		return driver.findElement(By.id("txtAddress"));
	}
	public static WebElement city(WebDriver driver)
	{
		return driver.findElement(By.id("txtcity" ));
	}
	public static WebElement zipcode(WebDriver driver)
	{
		return driver.findElement(By.id("txtZcode"));
	}
	public static WebElement Emailid(WebDriver driver)
	{
		return driver.findElement(By.id("txtEID"));
	}
	public static WebElement Phoneno(WebDriver driver)
	{
		return driver.findElement(By.id("txtPno"));
	}
	public static WebElement mobilenumber(WebDriver driver)
	{
		return driver.findElement(By.id("txtMno"));
	}
	public static WebElement openingbalance(WebDriver driver)
	{
		return driver.findElement(By.id("txtopnbal"));
	}
	public static WebElement submit21(WebDriver driver)
	{
		return driver.findElement(By.id("btnSubmit"));

}
}