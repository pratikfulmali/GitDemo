package snapshot1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Snapshot1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","J:\\selinium class\\softwear\\chromedriver.exe\\");
		WebDriver ss= new ChromeDriver(); 
		ss.get("https://unsplash.com/");
		ss.manage().window().maximize();
		TakesScreenshot ts= (TakesScreenshot)ss;
		File p =ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(p, new File("./SnapShot/Filename.png"));
		Thread.sleep(3000);
		
		WebDriver pp= new ChromeDriver();
		pp.get("https://www.w3schools.com/");
		TakesScreenshot qs= (TakesScreenshot)pp;
		File q =qs.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(q, new File("./SnapShot/file1.png"));
		System.out.println("Screen shot taken successfully");
		//ss.close();
	}

}
