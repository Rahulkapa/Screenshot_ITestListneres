package com.Base;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BaseClass {

	public static WebDriver driver;

	public void setup() {
	    driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}
	
	
    public void Screenshot(String Filename) {
    	String dateName = new SimpleDateFormat("yyyyMMddmmss").format(new Date());
		File srcfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcfile, new File(System.getProperty("user.dir")+"\\Screenshot\\"+Filename+"_"+dateName+".png"));
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	
   
}

}
