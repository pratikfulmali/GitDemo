package fbNavi;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navifb {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "J:\\selinium class\\softwear\\chromedriver.exe\\");
		WebDriver Un=new ChromeDriver();
		Un.get("https://unsplash.com/");     //first open unsplash website
		Thread.sleep(3000);					//Wait for 3000ms 
		Un.manage().window().maximize();	// Maximize current window
		Un.navigate().refresh();			//refresh unsplash website
		Un.navigate().to("https://zoom.us/");     //navigate to next page I.e. zoom 
		Thread.sleep(3000);						//Wait for 3000 ms
		Un.get("https://zoom.us/join");			//open join page using get method
		Thread.sleep(3000);						
		Un.navigate().back();       			//back to zoom home pahe (zoom.us)
		Un.navigate().back();					//Again back to unsplash page.
		System.out.println("Thank you");		//print the message i.e Thank you...
		
	}

}
