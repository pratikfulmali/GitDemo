
package com.introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author ANUJ
 *
 */
public class IntroDuctionClass {

	
	public static void main(String[] args) {
	
		// Invoking Browser
		//chrome -chromeDriver-->Methods --click--close
		//firefox- 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANUJ\\Desktop\\Test\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.get("https://mvnrepository.com/artifact/org.testng/testng/7.6.1");
		
		
		
		
		
	
	}

}
