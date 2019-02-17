package com.pagelibrery.com.ranfordhy;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Generic
{
	public static void screenshot(WebDriver driver ,String screenshotname) throws IOException
	{
		try
		{
		TakesScreenshot screen=(TakesScreenshot) driver;
		File src=screen.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\poject folder\\com.ranfordhy\\Folder\\"+screenshotname+".jpg"));
		}
		catch(Exception e)
		{
		e.printStackTrace();	
		}
	}
	public static void alert(WebDriver driver,String screenshotname) throws AWTException, IOException
	{
		Robot r=new Robot();
		Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rec=new Rectangle(d);
		BufferedImage br=r.createScreenCapture(rec);
		ImageIO.write(br, "jpg", new File("D:\\poject folder\\com.ranfordhy\\Folder\\"+screenshotname+".jpg"));
	}	
	
	
	
	
	
	

}
