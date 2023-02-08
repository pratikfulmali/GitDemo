package Myfirstpropackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","J:\\selinium class\\softwear\\chromedriver.exe");
		WebDriver w= new ChromeDriver() ;
		w.get("https://www.facebook.com/");
		w.findElement(By.name("email")).sendKeys("fulmalipratik79@gmail.com");
		String str=("hellow how are you");
		System.out.println(str);
		
	}

}
