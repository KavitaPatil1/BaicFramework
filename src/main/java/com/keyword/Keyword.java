package com.keyword;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.CustomizeErrorExc.BrowserError;

public class Keyword {
	
	
	public static WebDriver driver;
	public void openBrowser(String browsername) {
		
		if(browsername.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
		}else if(browsername.equalsIgnoreCase("Edge")) {
			driver=new EdgeDriver();
		}else if(browsername.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
		}else {
			throw new BrowserError();
		}

	}
	
	

}
