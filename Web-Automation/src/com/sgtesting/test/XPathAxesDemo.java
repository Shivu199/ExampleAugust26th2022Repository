package com.sgtesting.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathAxesDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
	//	enterSalaryBasedOnPersonSachinTendulkar();
	//	enterSalaryfor2ndPersonBasedOnRahulDravid();
	//	makeStatusAsActiveForIndianFreedomFighter();
	//	makeStatusAsActiveForPersonWhoIsPreviousToRahul();
	//	basedOnChildElementIdentifyParent();
		basedOnParentElementIdentifyChild();
	}
	
	private static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
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
			oBrowser.get("file:///E:/HTML/WebTableHTML.html");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * Case 1: following-sibling
	 * Description: Based On Person Sachin Tendulkar,Enter the Salary
	 */
	private static void enterSalaryBasedOnPersonSachinTendulkar()
	{
		oBrowser.findElement(By.xpath("//td[text()='Sachin Tendulkar']/following-sibling::td[4]/input")).sendKeys("25000");
	}

	/**
	 * Case 2: following
	 * Description: Based On Person Rahul Dravid,Enter the Salary for 2nd Person
	 */
	private static void enterSalaryfor2ndPersonBasedOnRahulDravid()
	{
		oBrowser.findElement(By.xpath("//td[text()='Rahul Dravid']/following::tr[2]/td[6]/input")).sendKeys("25000");
	}
	
	/**
	 * Case 3: preceding-sibling
	 * Description: Make the status as Active for Indian Freedom Fighter
	 */
	private static void makeStatusAsActiveForIndianFreedomFighter()
	{
		oBrowser.findElement(By.xpath("//td[text()='Indian Freedom Fighter']/preceding-sibling::td[1]/preceding::td[1]/input")).click();
	}
	
	/**
	 * Case 4: preceding
	 * Description: Make the status as Active for Person Who is Previous to Rahul Dravid
	 */
	private static void makeStatusAsActiveForPersonWhoIsPreviousToRahul()
	{
		oBrowser.findElement(By.xpath("//td[text()='Rahul Dravid']/preceding::tr[1]/td[1]/input")).click();
	}
	
	/**
	 * Case 5: ancestor
	 * Description: Based on Salary Text Field of Sachin Tendulkar Record, 
	 * get the id attribute value of table
	 * 
	 */
	private static void basedOnChildElementIdentifyParent()
	{
		WebElement oEle=oBrowser.findElement(By.xpath("//input[@id='edit4']/ancestor::td/ancestor::tr/ancestor::table"));
		String attributevalue=oEle.getAttribute("id");
		System.out.println(attributevalue);
	}
	
	/**
	 * Case 6: descendant
	 * Description: Based on Parent Element[table] Enter Salary for 5th Record
	 * get the id attribute value of table
	 * 
	 */
	private static void basedOnParentElementIdentifyChild()
	{
		oBrowser.findElement(By.xpath("//table[@id='tbl1']/descendant::tr[5]/td[6]/input")).sendKeys("25000");
		
	}
}
