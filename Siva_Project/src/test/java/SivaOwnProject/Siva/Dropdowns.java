package SivaOwnProject.Siva;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dropdowns {
		WebDriver driver;
  @Test
  public void Login() {
	  System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  driver.get(" https://itera-qa.azurewebsites.net/home/automation");
	  
	  driver.findElement(By.id("name")).sendKeys("Siva");
	  driver.findElement(By.id("phone")).sendKeys("9885977184");
	  driver.findElement(By.id("email")).sendKeys("test.test@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("Password");
	  driver.findElement(By.id("address")).sendKeys("Hyderabad");
	  driver.findElement(By.name("submit")).click();
	  driver.close();
	  
  }
  
}
