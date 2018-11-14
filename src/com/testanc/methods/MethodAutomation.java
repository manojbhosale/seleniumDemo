package com.testanc.methods;

import java.util.Enumeration;
import java.util.Locale;
import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MethodAutomation {
	
	public static void main(String[] args) {
		
		ResourceBundle properties = ResourceBundle.getBundle("com.testanc.resources.config",new Locale(""));
		//ResourceBundle.get
		Enumeration<String> props = properties.getKeys();
		while(props.hasMoreElements()) {
			System.out.println(properties.getString(props.nextElement()));
		}
		/*String driverPath = "C:\\Users\\pc\\Desktop\\AnnotaterData\\Selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverPath);
		WebDriver driver = new ChromeDriver();
		
		String baseUrl = "https://int52-rc1.test.alissa.agilent.com/";
		String userName = "mbhosale";
		String password = "Agilent!@#007";
        String expectedTitle = "Alissa Interpret";
        String actualTitle = "";
        String portalTitle = "Portal";

        //get drivers base url page
        driver.get(baseUrl);
        WebDriverWait wait;
        actualTitle = driver.getTitle();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 20);
        //wait until the username field become available
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
        
      //put username and password
       driver.findElement(By.id("username")).sendKeys(userName);
       driver.findElement(By.id("password")).sendKeys(password);
       //click submit(login) button
       driver.findElement(By.name("submit")).click();
      
       //check name of the portal application
       String portalName = driver.getTitle();
       
       if(portalTitle.equals(portalName)) {
    	   System.out.println(" Pass");
       }else {
    	   System.out.println(" Fail");
       }
       
        
        if(actualTitle.contentEquals(expectedTitle)) {
        	System.out.println("Test passed !!");
        	
        }else {
        	System.out.println("Test failed !!");
        }
        
        driver.close();
*/	}

}
