

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest2 {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","J:\\selinium class\\softwear\\chromedriver.exe");
		WebDriver I = new ChromeDriver();
		I.get("http://www.microlearning.org.in/");
		I.manage().window().maximize();
		Thread.sleep(3000);	
  }
}
