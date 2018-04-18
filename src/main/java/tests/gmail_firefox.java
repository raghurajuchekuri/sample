package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class gmail_firefox {
	
	
	public WebDriver driver;
	
	@BeforeClass
	  public void beforeClass() {
	   
		
	   System.setProperty("webdriver.gecko.driver", "src\\\\main\\\\resources\\geckodriver.exe");
	   driver = new FirefoxDriver();
	    driver.manage().window().maximize();
	   
	  }
	
	 
	  @Test
	  public void googleopen() throws Throwable {
		  
		  Thread.sleep(5000);
		  driver.get("https://google.co.in");	
		  
		  //Test
		  
		
	  }
	   
	  
	 
	  @AfterClass
	  public void afterClass() {
		  //driver.close();
		  driver.quit();
	  }


}
