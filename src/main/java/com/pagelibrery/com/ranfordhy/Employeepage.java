package com.pagelibrery.com.ranfordhy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Employeepage 
{
public static WebElement newemployee(WebDriver driver)
{
	return driver.findElement(By.id("BtnNew"));
	
}
}
