package tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {
	
	public WebDriver driver;
	
	
	@BeforeClass
	  public void beforeClass() {
	   
	   System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   
	  }
	
	 
	  @Test
	  public void openMyBlog() {
		//driver.get("https://google.co.in");
		driver.get("http://www.way2sms.com");
		
	  }
	  
	  @Test
	  public void test2() {  		  
		 
		  	WebDriverWait wait = new WebDriverWait(driver, 5);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
		  
		    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("xxxxs");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("xxx");
			driver.findElement(By.xpath("//input[@id='loginBTN']")).click();	
			
	  }
	  
	  
	  //@Test
	  public void test3() {  
		  		  	
		  try {
		        WebDriverWait wait = new WebDriverWait(driver, 5);
		        wait.until(ExpectedConditions.alertIsPresent());
		        Alert alert = driver.switchTo().alert();
		        alert.accept();
		    } catch (Exception e) {
		        //exception handling
		    }
			
	  }
	 
	  @AfterClass
	  public void afterClass() {
		  //driver.close();
		  driver.quit();
	  }

}
