package com.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Alert1 {

	//public static WebDriver driver;
	public static RemoteWebDriver driver;

	public static void verifySimpleAlert() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.testingshastra.com/simple-alert/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class=\"pum-close popmake-close\"]")).click();
		JavascriptExecutor jj = (JavascriptExecutor) driver;
		jj.executeScript("window.scrollBy(0,400)");
		driver.findElement(By.xpath("//input[@name=\"YourName\"]")).sendKeys("ravi");
		driver.findElement(By.xpath("//button[contains(text(),\"Click Me\")]")).click();
		Alert alert = driver.switchTo().alert();
		String alertinfo = alert.getText();
		System.out.println(alertinfo);
		alert.accept();
		driver.close();

	}

	public static void verifyPromptAlert() {

		 driver = new ChromeDriver();
		driver.get("https://www.testingshastra.com/prompt/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class=\"pum-close popmake-close\"]")).click();
		JavascriptExecutor jj = (JavascriptExecutor) driver;
		jj.executeScript("window.scrollBy(0,400)");
		driver.findElement(By.xpath("//button[contains(text(),'Click Me')]")).click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("rabi");
		alert.accept();
		String msg=driver.findElement(By.id("demo")).getText();
		System.out.println(msg);
		driver.close();

	}
	public static void verifyConfirmationAlert() {
	 driver=new ChromeDriver();
	 driver.get("https://www.testingshastra.com/confirmation-alert/");
	 driver.manage().window().maximize();
	 driver.findElement(By.xpath("//button[@class=\"pum-close popmake-close\"]")).click();
	 driver.executeScript("window.scrollBy(0,400)");
	 driver.findElement(By.xpath("//button[contains(text(),'Click Me')]")).click();
	 Alert alert=driver.switchTo().alert();
	 alert.dismiss();
	 String cancelmsg=driver.findElement(By.id("demo")).getText();
	 System.out.println(cancelmsg);
	 driver.close();
	

	}

	public static void main(String[] args) {

		//verifyPromptAlert();
		verifyConfirmationAlert();
	}

}
