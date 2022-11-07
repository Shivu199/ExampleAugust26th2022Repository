package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FIREFOXDEMO {
	
	public static WebDriver oBrowser=null;	
	public static void main(String[] args) 
	{
		lanchBrowser();
		navigate();
		closeApplication();	
		}
	private static void lanchBrowser()
	{
		try
		{
			System.setProperty("webdriver.gecko.driver","G:\\ECLIPSETOOL\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\geckodriver.exe");
			oBrowser=new FirefoxDriver();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
		private static void navigate()
		{
			try
			{
				oBrowser.get("http://localhost/user/submit_tt.do");
	            Thread.sleep(5000);
			}catch(Exception e)
			{
				e.printStackTrace();
			  }
			}
			private static void closeApplication()
			{
				try
				{
					oBrowser.close();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
	      }
	}
