package com.sgtesting.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FACEBOOK {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","G:\\ECLIPSETOOL\\ExampleAutomation\\Automation\\Web-Automation\\Library\\drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("smk.jwl@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Shivu@123");
		driver.findElement(By.name("login")).click();
		
	}

}
