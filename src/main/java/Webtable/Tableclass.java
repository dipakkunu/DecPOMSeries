package Webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Tableclass
{
	public static void WebTable(WebDriver driver,By prop,String id,String operation)
	{
		
			try {
				boolean flag=false;
				boolean status=false;
				WebElement table=driver.findElement(prop);
				
				List<WebElement>rows=table.findElements(By.tagName("tr"));
				
				String[] pagelinks=rows.get(rows.size()-1).getText().split(" ");
				
				for(int l=2;l<pagelinks.length;l++)
				{
					table=driver.findElement(prop);
					rows=table.findElements(By.tagName("tr"));
					for(WebElement r:rows)
					{
						List<WebElement>columns=r.findElements(By.tagName("td"));
						
						for(WebElement c:columns)
						{
							if(c.getText().matches(id))
							{
							 if(operation.equalsIgnoreCase("edit"))
							 {
								columns.get(columns.size()-2).findElement(By.tagName("a")).click();
							 }
							 else if(operation.equalsIgnoreCase("delete"))
							 {
								 columns.get(columns.size()-1).findElement(By.tagName("a")).click();
							 }
							 else
							 {
								 System.out.println("opertion is failed");
							 }
							 
							 flag=true;
							 break;
							 }
						   }
							if(flag==true)
							{
							break;
							}
					     }
					if(flag==true)
					{
						break;
					}
					try{
					if(pagelinks[l].contains("...") && status==true)
					{
					driver.findElement(By.xpath("//a[text()='...'][2]")).click();
					}
					else
					{
					table.findElement(By.linkText(pagelinks[1])).click();
					}
					}catch(Exception e)
					{
					e.printStackTrace();			
					}
				    if(pagelinks[l].contains("..."))
				    {
					 status=true;
					 WebTable(driver,prop,id,operation);	
					}
				
				}
			} catch (Exception e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}


}



	
	
