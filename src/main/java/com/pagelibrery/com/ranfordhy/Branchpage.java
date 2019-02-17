package com.pagelibrery.com.ranfordhy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Branchpage
{
	public static WebElement newbranch(WebDriver driver)
	{
	return driver.findElement(By.id("BtnNewBR" ));
	}
	public static Select country123(WebDriver driver) 
	{
	return new Select (driver.findElement(By.id("lst_countryS")));
	}
	public static Select state123(WebDriver driver)
	{
		return new Select (driver.findElement(By.id("lst_stateS" )));
	}
	public static Select city123(WebDriver driver)
	{
		return new Select (driver.findElement(By.id("lst_cityS")));
	}
	public static WebElement search12(WebDriver driver)
	{
		return driver.findElement(By.id("btn_search"));
	}
	
}
