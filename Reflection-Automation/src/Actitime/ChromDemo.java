package Actitime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromDemo {
	public static WebDriver oBrowser=null;

	public static void main(String[] args) {
		lanchBrowser();
		navigate();
		closeApplication();

	}
	public static void lanchBrowser()
	{
		try
		{

			System.setProperty("webdriver.chrome.driver","G:\\GitRepository\\CurrentWorkSpace\\ExampleAugust26th2022Repository\\Reflection-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void navigate()
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
	public static void closeApplication()
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