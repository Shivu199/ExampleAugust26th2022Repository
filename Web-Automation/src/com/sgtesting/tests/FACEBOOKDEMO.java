package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


  public class FACEBOOKDEMO {
 	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		lunch();
		navigation();
		login();
	}
	
	private static void lunch() 
	{
		try 
		{
			System.setProperty("webdriver.chrome.driver","G:\\ECLIPSETOOL\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	public static void navigation()
	{
		try
		{
			oBrowser.get("https://www.facebook.com/login/");
			Thread.sleep(3000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
      private static void login() {
		 {
			try 
			{
				oBrowser.findElement(By.id("email")).sendKeys("smk.jwl@gmail.com");
				oBrowser.findElement(By.className("pass")).sendKeys("Shivu@123");
				oBrowser.findElement(By.xpath("//*[@id=\"facebook\"]/body")).click();
			}catch (Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
}



