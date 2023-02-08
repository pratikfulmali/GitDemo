package InfodealTechnologies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AboutSection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ANUJ\\Desktop\\chromedriver.exe");
		WebDriver I = new ChromeDriver();
		I.get("https://infodealtechnologies.com/contact.html");
		I.findElement(By.name("first_name")).sendKeys("Pratik");
		I.findElement(By.name("last_name")).sendKeys("Fulmali");
		I.findElement(By.name("email")).sendKeys("fulmalipratik79@gmail.com");
		I.findElement(By.name("phone")).sendKeys("+918888331273");
		I.findElement(By.name("comments")).sendKeys("You can start your comments here.......thanks");
	}

}
