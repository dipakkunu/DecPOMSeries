package com.pagelibrery.com.ranfordhy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Customerpage 
{
public static WebElement newcustomer(WebDriver driver)
{
	return driver.findElement(By.id("btnNEW"));
}
}
