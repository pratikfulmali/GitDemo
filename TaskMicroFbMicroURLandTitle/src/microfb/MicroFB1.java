package microfb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class MicroFB1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ANUJ\\Desktop\\pratik data\\chromedriver.exe\\");
		WebDriver I = new ChromeDriver();
		I.get("http://www.microlearning.org.in/");
		I.manage().window().maximize();
		Thread.sleep(3000);	
		I.navigate().to("https://www.facebook.com/r.php");
		I.findElement(By.name("firstname")).sendKeys("Elon");
		I.findElement(By.name("lastname")).sendKeys("Musk");
		I.findElement(By.name("reg_email__")).sendKeys("ElonMusk123@gmail.com");
		I.findElement(By.name("reg_passwd__")).sendKeys("qwertyuio");
		Select day=new Select(I.findElement(By.name("birthday_day")));
		day.selectByValue("2");
		
		Select Bm=new Select(I.findElement(By.name("birthday_month")));
		Bm.selectByValue("10");
		
		Select BY=new Select(I.findElement(By.name("birthday_year")));
		BY.selectByVisibleText("1983");
		
		//I.findElement(By.className("_8esa")).click(); //for select gender
		I.findElement(By.cssSelector("input[value='2'")).click();
		Thread.sleep(3000);	
		
		I.findElement(By.name("websubmit")).click();
		Thread.sleep(3000);	

		I.navigate().back();
		Thread.sleep(4000);
		System.out.println("title is="+I.getTitle());	
		System.out.println("Current Page Url= "+I.getCurrentUrl());
		I.close();		
	}

}
