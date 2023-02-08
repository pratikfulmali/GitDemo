package expectvsactual;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ifelse1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","J:\\selinium class\\softwear\\chromedriver.exe\\");
		WebDriver ss= new ChromeDriver(); 
		ss.get("https://unsplash.com/");
		ss.manage().window().maximize();
		String excepted="https://unsplash.com/";
		String actual=ss.getTitle();
		if(excepted.contentEquals(actual)) {
			System.out.println("pass");
		}
		else {
			
			System.out.println("fail");
		}
	}

}
