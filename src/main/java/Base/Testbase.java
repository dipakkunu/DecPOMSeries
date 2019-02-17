package Base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Testbase 
{
	static Properties p;
	public static void loadproperty()
	{
		try {
			File f=new File(System.getProperty("user.dir")+"\\src\\main\\java\\Interface\\Or.properties");
			FileReader fr=new FileReader(f);
			p=new Properties();
			p.load(fr);
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static String locators(String loc)
	{
		loadproperty();
		String x=p.getProperty(loc);
		return x;
		
				
	}
	static Properties p1;
	public static void loadproperty1()
	{
		try {
			File f=new File(System.getProperty("user.dir")+"\\src\\main\\java\\Interface\\configuration.properties");
			FileReader fr=new FileReader(f);
			p1=new Properties();
			p1.load(fr);
	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static String locator1(String loc1)
	{
		loadproperty1();
		String x=p1.getProperty(loc1);
		return x;
		
				
	}
	
}
