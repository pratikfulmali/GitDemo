package myassertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "J:\\selinium class\\softwear\\chromedriver.exe\\");
		WebDriver Un=new ChromeDriver();
		Un.get("https://elearningindustry.com/post-here");     //first open unsplash website
		Thread.sleep(3000);					//Wait for 3000ms 
		Un.manage().window().maximize();
		Un.findElement(By.xpath("//*[@id=\'mobile-nav\']/div[2]/div/ul[1]/li[1]/a[1]/strong")).click();
		String actualtitle=Un.getTitle();
		String exceptedtitle="Publish an eLearning Article - eLearning Industry";
		assertEquals(actualtitle,exceptedtitle);
		System.out.println("Thank You");
  }
}
