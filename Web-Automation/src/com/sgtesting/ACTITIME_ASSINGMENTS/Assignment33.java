package com.Assignments.programs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment33 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		LaunchBrowser();
		Navigate();
		Login();
		Minimize();
		User1();
		User2();
		User3();
		Logout();
		LoginUser1();
		Logoutuser1();
		LoginUser2();
		Logoutuser2();
		LoginUser3();
		Logoutuser3();
		SecontimeLoginUser1();
		Modifyuser1();
		SecondtimeLogoutuser1();
		SecondtimeLoginUser2();
		Modifyuser2();
		SecondtimeLogoutuser2();
		SecondtimeLoginUser3();
		Modifyuser3();
		SecondtimeLogoutuser3();
		SecondtimeadminLogin();
		AdminModifyuser1();
		SecondtimeAdminlogout();
		ThirdtimeLoginUser1();
		Thirdtimeuser1logout();
		ThirdtimeLoginUser2();
		Thirdtimeuser2logout();
		ThirdtimeLoginUser3();
		Thirdtimeuser3logout();
		thirdtimeadminLogin();
		DeleteUesers();
		ThirdtimeAdminlogout();
		CloseBrowser();

	}
	private static void LaunchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","C:\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void Navigate()
	{
		try
		{
			oBrowser.get("http://localhost/login.do");

			Thread.sleep(1000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	private static void Login()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void Minimize()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='gettingStartedShortcutsPanelId']")).click();
			Thread.sleep(1000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void User1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("firstName")).sendKeys("demo");
			oBrowser.findElement(By.name("middleName")).sendKeys("A");
			oBrowser.findElement(By.name("lastName")).sendKeys("User1");
			oBrowser.findElement(By.name("email")).sendKeys("demoA@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("Demouser1");
			oBrowser.findElement(By.name("password")).sendKeys("1231");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("1231");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void User2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("firstName")).sendKeys("demo");
			oBrowser.findElement(By.name("middleName")).sendKeys("B");
			oBrowser.findElement(By.name("lastName")).sendKeys("User2");
			oBrowser.findElement(By.name("email")).sendKeys("DemoB@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("Demouser2");
			oBrowser.findElement(By.name("password")).sendKeys("1232");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("1232");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void User3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("firstName")).sendKeys("demo");
			oBrowser.findElement(By.name("middleName")).sendKeys("C");
			oBrowser.findElement(By.name("lastName")).sendKeys("User3");
			oBrowser.findElement(By.name("email")).sendKeys("DemoC@gmail.com");
			oBrowser.findElement(By.name("username")).sendKeys("Demouser3");
			oBrowser.findElement(By.name("password")).sendKeys("1233");
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("1233");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
			Thread.sleep(2000);
			
			
		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void Logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void LoginUser1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Demouser1");
			oBrowser.findElement(By.name("pwd")).sendKeys("1231");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void Logoutuser1()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void LoginUser2()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Demouser2");
			oBrowser.findElement(By.name("pwd")).sendKeys("1232");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void Logoutuser2()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void LoginUser3()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Demouser3");
			oBrowser.findElement(By.name("pwd")).sendKeys("1233");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Start exploring actiTIME']")).click();

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void Logoutuser3()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void SecontimeLoginUser1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Demouser1");
			oBrowser.findElement(By.name("pwd")).sendKeys("1231");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void Modifyuser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='User1, demo A.']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("4567");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("4567");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
			

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void SecondtimeLogoutuser1()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(1000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void SecondtimeLoginUser2()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Demouser2");
			oBrowser.findElement(By.name("pwd")).sendKeys("1232");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
			
		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void Modifyuser2()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='User2, demo B.']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("7890");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("7890");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
			

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void SecondtimeLogoutuser2()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void SecondtimeLoginUser3()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Demouser3");
			oBrowser.findElement(By.name("pwd")).sendKeys("1233");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
			

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void Modifyuser3()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='User3, demo C.']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("4321");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("4321");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
			

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void SecondtimeLogoutuser3()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void SecondtimeadminLogin()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void AdminModifyuser1()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='User1, demo A.']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("vis");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("vis");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='User2, demo B.']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("raj");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("raj");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='User3, demo C.']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.name("password")).sendKeys("vij");
			Thread.sleep(1000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("vij");
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='Save Changes']")).click();
			Thread.sleep(2000);
			

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void SecondtimeAdminlogout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}	
	private static void ThirdtimeLoginUser1()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Demouser1");
			oBrowser.findElement(By.name("pwd")).sendKeys("vis");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void Thirdtimeuser1logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void ThirdtimeLoginUser2()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Demouser2");
			oBrowser.findElement(By.name("pwd")).sendKeys("raj");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
			
		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void Thirdtimeuser2logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void ThirdtimeLoginUser3()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("Demouser3");
			oBrowser.findElement(By.name("pwd")).sendKeys("vij");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);
			

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void Thirdtimeuser3logout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void thirdtimeadminLogin()
	{
		try
		{
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(1000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void DeleteUesers()
	{
		try
		{
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='User1, demo A.']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(1000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='User2, demo B.']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(1000);
			oAlert.accept();
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.xpath("//span[text()='User3, demo C.']")).click();
			Thread.sleep(1000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
			Thread.sleep(1000);
			oAlert.accept();

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void ThirdtimeAdminlogout()
	{
		try
		{
			oBrowser.findElement(By.linkText("Logout")).click();
			Thread.sleep(2000);

		}catch(Exception e)

		{
			e.printStackTrace();
		}
	}
	private static void CloseBrowser()
	{
		try
		{
			oBrowser.close();
			Thread.sleep(3000);


		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}


}
