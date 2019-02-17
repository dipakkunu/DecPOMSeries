package com.pagelibrery.com.ranfordhy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Newuserpage
{
	public static WebElement role(WebDriver driver)
	{
		return driver.findElement(By.id("lst_Roles"));
		
	}
	public static WebElement branch(WebDriver driver)
	{
		return driver.findElement(By.id("lst_Branch"));
		
	}
	public static WebElement customerid(WebDriver driver)
	{
		return driver.findElement(By.id("DrCName"));
		
	}

}
