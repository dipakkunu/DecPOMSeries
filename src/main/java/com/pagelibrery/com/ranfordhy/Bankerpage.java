package com.pagelibrery.com.ranfordhy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Bankerpage 
{
	public static WebElement Home(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@src='images/admin_but_01.jpg']"));
		
	}
	public static WebElement changepassword(WebDriver driver)
	{
		return driver.findElement(By.xpath("//*[@src='images/admin_but_02.jpg']"));
		
	}
	public static WebElement logout(WebDriver driver)
	{
	return driver.findElement(By.xpath("//*[@src='images/admin_but_03.jpg']"));
	}
	public static WebElement customers(WebDriver driver)
	{
    return driver.findElement(By.xpath("//*[@src='images/Customer_but.jpg']"));	
	}
	public static WebElement receipts(WebDriver driver)
	{
	return driver.findElement(By.xpath("//*[@src='images/Receipts_but.jpg']"));
	}
	public static WebElement payments(WebDriver driver)
	{
	return driver.findElement(By.xpath("//*[@src='images/Pay_but.jpg']"));
		
	}
	
	
}
