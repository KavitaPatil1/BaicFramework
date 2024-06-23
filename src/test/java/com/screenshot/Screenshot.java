package com.screenshot;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Screenshot {
	
	
	public static RemoteWebDriver driver;
	
	public static void usingSeleniumTakeScreenshot() {
		
		driver=new ChromeDriver();
		driver.get("https://www.testingshastra.com/assignments/");
		
		driver.manage().window().maximize();
		
		//abstarct class
		DateFormat df= new SimpleDateFormat("ddMMyyyy-HH");
		String time=df.format(new Date());
		
		String filepath="Screenshot/"+"_"+time+".jpg";
		
		
		
		File f=driver.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(f,new File(filepath) );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}
	public static void main(String[] args) {
		
		
		usingSeleniumTakeScreenshot();
		
	}

}
