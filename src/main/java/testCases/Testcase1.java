package testCases;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.logging.Logger;


public class Testcase1 {
	
	
	
	@Test
	public void launchApp() {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");	
		String logo = driver.findElementById("hplogo").getText();
		System.out.println(logo);
		
	}
	
	
}

