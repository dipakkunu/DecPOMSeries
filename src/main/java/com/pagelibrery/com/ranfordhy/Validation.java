package com.pagelibrery.com.ranfordhy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Validation 
{
	public static boolean IsTextIsPresent(WebDriver driver,String exp)
	{
		return driver.findElement(By.tagName("tbody")).getText().contains(exp);
	}
	public static boolean IsTitleIsPresent(WebDriver driver,String exp)
	{
		return driver.getTitle().contains(exp);
	}
	public static boolean IsAlertIsPresent(WebDriver driver,String exp)
	{
		return driver.switchTo().alert().getText().contains(exp);
	}
	
	
	

}
