package titleandsource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SourceAndTitle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","J:\\selinium class\\softwear\\chromedriver.exe");
		WebDriver ts= new ChromeDriver();
		ts.get("https://www.stjosephytl.net/");
		ts.getPageSource();
		System.out.println("Title is =   "+ts.getTitle());
		Thread.sleep(3000);
		System.out.println("Get current url= "+ts.getCurrentUrl());
		Thread.sleep(3000);
		ts.close();
	}

}
