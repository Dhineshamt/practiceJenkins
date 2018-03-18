package org.jenkins.experiment.experiment;

import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class NewTest {
  @Test
  public void launchGoogle() {
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "");
	  ChromeDriver driver = new ChromeDriver();
  }

}
