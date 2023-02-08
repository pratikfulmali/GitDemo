package cssselector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Csselector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","J:\\selinium class\\softwear\\chromedriver.exe");
		WebDriver f= new ChromeDriver();
		f.get("https://www.facebook.com/");
		f.manage().window().maximize();
		f.findElement(By.cssSelector("input[data-testid='royal_email']")).sendKeys("Fulmalipratik79@gmail.com");
		f.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("123QWEASDzxc@");
		f.findElement(By.cssSelector("button[name='login']")).click();
		
		
		
		
	}

}
