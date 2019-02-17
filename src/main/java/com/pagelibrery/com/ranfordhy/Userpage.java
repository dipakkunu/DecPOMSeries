package com.pagelibrery.com.ranfordhy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Userpage 
{
public static WebElement newuser(WebDriver driver)
{
	return driver.findElement(By.xpath("\\*[src='images/Users_but.jpg]"));
	
}
}
