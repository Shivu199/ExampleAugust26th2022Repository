package ACTITIME_ASSIGNMENT;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimizeFlyOutwindow();
		addCustomer();
		creatProject();
		 ModifyProject();
		 DeleteProject();
		 logout();
		 closeApplication();

	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "G:\\GitRepository\\CurrentWorkSpace\\ExampleAugust26th2022Repository\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();       
		}
	}
	
	private static void minimizeFlyOutwindow()
	{
		try
		{
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void addCustomer()
	{                                                  
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr/td[3]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//div[text()='Add New'] ")).click();
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Rajesh");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"customerLightBox_commitBtn\"]/div/span")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
      private static void creatProject()                                 
      {
    	  try
    	  {
    		  oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[3]")).click();
    		  Thread.sleep(3000);
    		  oBrowser.findElement(By.xpath("//div[text()='Add New'] ")).click();
    		  oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
    		  Thread.sleep(3000);
    		  oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("Tiger");
    		  Thread.sleep(3000);
    		  oBrowser.findElement(By.xpath("//*[@id=\"projectPopup_commitBtn\"]/div/span")).click();
    		  Thread.sleep(3000);
    		  
    	  }catch(Exception e)
    	  {
    		  e.printStackTrace();
    	  }
      }
      
      private static void ModifyProject()
  	{
  		try
  		{
  			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
  			Thread.sleep(1000);
  			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[4]/div[2]/div[1]/div[1]/div[1]/div/div[1]/div[3]/div/div[1]")).click();
  			Thread.sleep(1000);
  			oBrowser.findElement(By.xpath("//div[text()='Archived']")).click();
  			Thread.sleep(1000);
  			
  			
  						
  		}catch(Exception e)

  		{
  			e.printStackTrace();
  		}
  	}
  	private static void DeleteProject()
  	{
  		try
  		{
  			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
  			Thread.sleep(2000);
  			
  			oBrowser.findElement(By.xpath("//div[text()='ACTIONS']")).click();
  			Thread.sleep(1000);
  			oBrowser.findElement(By.xpath("//div[text()='Delete']")).click();
  			Thread.sleep(1000);
  			oBrowser.findElement(By.xpath("//span[text()='Delete permanently']")).click();
  			Thread.sleep(1000);
  						
  		}catch(Exception e)

  		{
  			e.printStackTrace();
  		}
  	}
  	private static void logout()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void closeApplication()
	{
		try
		{
			oBrowser.quit(); 
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
