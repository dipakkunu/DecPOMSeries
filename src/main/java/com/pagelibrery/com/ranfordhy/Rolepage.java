package com.pagelibrery.com.ranfordhy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Rolepage 
{
	public static WebElement newrole(WebDriver driver)
	{
		return driver.findElement(By.id("btnRoles" ));
	}
	

}
