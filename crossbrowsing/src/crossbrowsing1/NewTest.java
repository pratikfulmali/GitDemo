package crossbrowsing1;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class NewTest {
	
	WebDriver d;
	@BeforeMethod
	@Parameters("browser")
	@BeforeTest
	
	public void setUP(String browser) throws InterruptedException {
		if (browser.equalsIgnoreCase("chrome")) {
			 System.setProperty("webdriver.chrome.driver","J:\\selinium class\\softwear\\chromedriver.exe");
			  d= new ChromeDriver() ;
		
			
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver","J:\\selinium class\\softwear\\geckodriver.exe");
			 d= new FirefoxDriver();
		}
		else {
			System.out.println("browser not correct");
		}
	}
		
	
	@Test
	  public void f() throws InterruptedException {
			d.get("http://www.microlearning.org.in/");
			d.manage().window().maximize();
			d.findElement(By.name("username")).sendKeys("admin@gmail.com");
			d.findElement(By.name("password")).sendKeys("2002100");
			d.findElement(By.name("login")).click();

}
}
