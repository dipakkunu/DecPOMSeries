package com.pagelibrery.com.ranfordhy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import Base.Testbase;

public class RanfordHomepage extends Testbase
{
public static WebElement username(WebDriver driver)
{
	return driver.findElement(By.id(locators("username")));
}
public static WebElement password(WebDriver driver)	
{
	return driver.findElement(By.id(locators("password")));
}
public static WebElement login(WebDriver driver)	
{
	return driver.findElement(By.id(locators("login")));
	
}
public static Select branchname(WebDriver driver)
{
 return new Select (driver.findElement(By.id("drlist" )));
}

	
}

