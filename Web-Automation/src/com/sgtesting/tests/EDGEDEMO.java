package com.sgtesting.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EDGEDEMO {
	public static WebDriver oBrowser=null;
	
	public static void main(String[] args) {
		lanchBrowser();
		navigate();
		closeApplication();

	}
	private static void lanchBrowser()
	{
		try
		{

			System.setProperty("webdriver.edge.driver","G:\\ECLIPSETOOL\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\msedgedriver.exe");
			oBrowser=new EdgeDriver();

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