package com.testanc.methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


/*
 * test comment
 */
public class LogIn {
	
	public static void main(String[] args) throws InterruptedException {

		String driverPath = "C:\\Users\\pc\\Desktop\\AnnotaterData\\Selenium\\chromedriver_win32\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverPath);
		
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://www.google.com");
	    WebElement element = driver.findElement(By.name("q"));
	    element.sendKeys("Cheese!\n"); // send also a "\n"
	    Thread.sleep(2000);
	    element.submit();

	    // wait until the google page shows the result
	    WebElement myDynamicElement = (new WebDriverWait(driver, 10))
	              .until(ExpectedConditions.presenceOfElementLocated(By.id("resultStats")));

	    List<WebElement> findElements = driver.findElements(By.xpath("//*[@id='rso']//h3/a"));

	    // this are all the links you like to visit
	    for (WebElement webElement : findElements)
	    {
	        System.out.println(webElement.getAttribute("href"));
	    }
	}

}
