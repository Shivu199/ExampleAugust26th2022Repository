package com.Assignments.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment2 {
	public static WebDriver oBrowser =null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		login();
		minimize();
		creatuser();
		modifyuser();
		logout();
		closeApplication();
		
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver" ,
					"C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser = new ChromeDriver();
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
			oBrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimize()
	 {
		 try
		 {
		 oBrowser.findElement(By.xpath("//*[@id='gettingStartedShortcutsPanelId']/div[1]")).click();
		
		 }catch(Exception e)
		 {
			 e.printStackTrace();
		 }
	 }
	private static void creatuser()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")).click();
			oBrowser.findElement(By.xpath("//div[text()='Add User'] ")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.name("firstName")).sendKeys("vishwa");
			oBrowser.findElement(By.name("middleName")).sendKeys("R");
			oBrowser.findElement(By.name("lastName")).sendKeys("Korimath");
			oBrowser.findElement(By.name("email")).sendKeys("korimathvr@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("demoUserY");
			oBrowser.findElement(By.name("password")).sendKeys("1234");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("1234");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(5000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void modifyuser()                                                     
	{
		try
		{
			oBrowser.findElement(By.xpath("//span[text()='Korimath, vishwa R.']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("password")).sendKeys("4567");
			Thread.sleep(3000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("4567");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(5000);
			
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
