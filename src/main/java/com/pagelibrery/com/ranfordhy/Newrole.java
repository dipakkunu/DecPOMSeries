package com.pagelibrery.com.ranfordhy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Newrole
{
	
public static WebElement rolename(WebDriver driver)
{
	return driver.findElement(By.id("txtRname"));
	
}
public static WebElement roledesc(WebDriver driver)
{
	return driver.findElement(By.id("txtRDesc"));
	
}
public static Select roletype(WebDriver driver)
{
	return  new Select(driver.findElement(By.id("lstRtypeN")));
	
}
public static WebElement submit(WebDriver driver)
{
 return driver.findElement(By.id("btninsert"));
}
/*public static WebElement reset(WebDriver driver)
{
return driver.findElement(By.id("Btn_Reset"));
}
public static WebElement cancel(WebDriver driver)
{
return driver.findElement(By.id("Btn_cancel"));
	
}*/
}
