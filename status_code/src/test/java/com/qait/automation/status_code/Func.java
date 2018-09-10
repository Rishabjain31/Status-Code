package com.qait.automation.status_code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Func {
	WebDriver driver;
	get_code obj;
    
	@BeforeClass
	public void openUrl() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rishabh.jain1\\Documents\\chromedriver.exe");
		driver=new ChromeDriver();
		obj=new get_code(driver) ;
		driver.get("http://10.0.31.161:9292/");
		driver.findElement(By.cssSelector("a[href='/tinymce']")).click();
	}
	@Test
	public void firstCase() {
		int str=obj.Box();
		
	}
}
