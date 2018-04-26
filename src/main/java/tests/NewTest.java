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

import SubPackage.JSON_Reader;

public class NewTest {
	
	public WebDriver driver;
	
	JSON_Reader obj_JSON_Reader = new JSON_Reader();
	
	
	/*String uname1 = obj_JSON_Reader.uname ;	
	String pwd1 = obj_JSON_Reader.pwd;*/
	
	@BeforeClass
	  public void beforeClass() {
	   
	   System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   
	  }
	
	 
	  @Test
	  public void openMyBlog() {
		//driver.get("https://google.co.in");
		driver.get("http://www.way2sms.com");
		
	  }
	  
	  @Test
	  public void test2() throws Throwable {  		  
		 
		  	WebDriverWait wait = new WebDriverWait(driver, 5);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
		  
		    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("uname1");
		    Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("pwd1");
			Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@id='loginBTN']")).click();	
			Thread.sleep(2000);
			
	  }
	  
	  
	  @Test
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
