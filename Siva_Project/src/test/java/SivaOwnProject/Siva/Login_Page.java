package SivaOwnProject.Siva;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Login_Page {
	
	WebDriver driver;
	
  @Test
  public void Login() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.saucedemo.com/");
	  
	  driver.findElement(By.id("user-name")).sendKeys("standard_user");
	  Thread.sleep(1000);
	  driver.findElement(By.id("password")).sendKeys("secret_sauce");
	  Thread.sleep(1000);
	  driver.findElement(By.id("login-button")).click();
	   
  }
} 
