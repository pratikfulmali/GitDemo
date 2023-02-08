package abc;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Starz {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
	    driver.get("http://3.96.254.254/login");
	    driver.findElement(By.xpath("//*[@id=\"login-form\"]/section/form/div[1]/input")).sendKeys("pluto");
	    driver.findElement(By.xpath("//*[@id=\"inputPassword\"]")).sendKeys("starzlink");
	    driver.findElement(By.xpath("//*[@id=\"login-form\"]/section/form/button")).click();
/*	    driver.findElement(By.xpath("//*[@id=\"nav\"]/section/section/div/div[1]/nav/ul/li[3]/a/span")).click();
//	    driver.findElement(By.xpath(""))
	    driver.findElement(By.xpath("//*[@id=\"content\"]/section/aside/section/header/a")).click();
	    Thread.sleep(2000);
	    driver.findElement(By.name("company_name")).sendKeys("Amit Manoj Giri");
	    driver.findElement(By.name("company_email")).sendKeys("abcd@gmail.com");
	    driver.findElement(By.xpath("//*[@id=\"ajaxModal\"]/div/div/form/div[2]/button")).click();
*/
	    driver.findElement(By.xpath("//*[@id=\"nav\"]/section/section/div/div[1]/nav/ul/li[7]/a/span")).click();
	    driver.findElement(By.xpath("//*[@id=\"content\"]/section/aside/section/section/section/header/a[1]")).click();
	    Thread.sleep(2000);
	    WebElement dep=driver.findElement(By.xpath("//*[@id=\"content\"]/section[1]/aside[2]/section[1]/section[1]/div[1]/section[1]/div[1]/form[1]/div[1]/div[1]/div[1]/select[1]"));
		Select dep1=new Select(dep);
		Thread.sleep(2000);
		dep1.selectByVisibleText("BROADBAND");		
		driver.findElement(By.xpath("//*[@id=\"content\"]/section/aside[2]/section/section/div/section/div/form/button")).click();
	
		
		//driver.findElement(By.className("priority")).click();		
//		driver.findElement(By.className("form-control")
		 WebElement pri=driver.findElement(By.xpath("//*[@id=\"content\"]/section[1]/aside[2]/section[1]/section[1]/div[1]/section[1]/div[1]/form[1]/div[4]/div[1]/div[1]/select[1]"));
			Select pri1=new Select(pri);
			Thread.sleep(2000);
			pri1.selectByVisibleText("High");
			driver.findElement(By.xpath("//*[@id=\"content\"]/section/aside[2]/section/section/div/section/div/form/div[2]/div/input")).sendKeys("Internet not working from morning");

			System.out.println("Almost done");
			driver.findElement(By.xpath("//*[@id=\"content\"]/section[1]/aside[2]/section[1]/section[1]/div[1]/section[1]/div[1]/form[1]/div[5]/div[1]/div[1]/div[3]/div[2]/p[1]")).sendKeys("Detail message");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"content\"]/section[1]/aside[2]/section[1]/section[1]/div[1]/section[1]/div[1]/form[1]/button[1]")).click();
			System.out.println("Ticket Generate successfully");
	}

}
