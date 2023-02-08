package myregistaration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;

public class Registration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver","C:\\Users\\ANUJ\\Desktop\\chromedriver.exe");
			WebDriver obj = new ChromeDriver();
			obj.get("https://www.w3schools.com/");
			obj.findElement(By.xpath("//*[@id=\"w3loginbtn\"]")).click();
			System.out.println("ok");
	
		
					
	}

}
