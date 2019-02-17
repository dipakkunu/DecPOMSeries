package com.pagelibrery.com.ranfordhy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Newemployeepage 
{
public static WebElement employername(WebDriver driver)
{
	return driver.findElement(By.id("txtUname"));
}
public static WebElement loginpassword(WebDriver driver)
{
	return driver.findElement(By.id("txtLpwd" ));
}
public static WebElement role(WebDriver driver)
{
	return driver.findElement(By.id("lst_Roles"));
}
public static WebElement branch(WebDriver driver)
{
	return driver.findElement(By.id("lst_Branch"));
}
public static WebElement submit15(WebDriver driver)
{
	return driver.findElement(By.id("BtnSubmit"));
	
}
}
