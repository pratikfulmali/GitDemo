package xmleditor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class NewTest {
  @Test
  @Parameters({"username","password"})
  public void f(String username, String password) throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver","J:\\selinium class\\softwear\\chromedriver.exe");
		WebDriver d= new ChromeDriver() ;
		d.get("http://www.microlearning.org.in/");
		d.manage().window().maximize();
		d.findElement(By.name("username")).sendKeys(username);
		d.findElement(By.name("password")).sendKeys(password);
		d.findElement(By.name("login")).click();
  }
}
