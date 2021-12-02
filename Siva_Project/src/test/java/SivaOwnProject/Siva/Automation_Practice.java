package SivaOwnProject.Siva;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;



public class Automation_Practice {
	WebDriver driver;
  @Test
  public void practice() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32\\chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://automationpractice.com/index.php");
	  driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	  
	  driver.findElement(By.xpath("//a[@class='login']")).click();
	  driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("automation100@gmail.com");
	  driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
	  
	  driver.findElement(By.xpath("//div[@id='uniform-id_gender1']")).click();
	  driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("siva");
	  driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("K");
	  driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("Password@123");
	  
	  Select Dropdown= new Select(driver.findElement(By.xpath("//select[@id='days']")));
	  Dropdown.selectByValue("23");
	 
	  
	 // Thread.sleep(3000);
	  Select Dropdown1= new Select(driver.findElement(By.xpath("//select[@id='months']")));
	  Dropdown1.selectByValue("11");
	  
	  
	  
	  Select Dropdown2= new Select(driver.findElement(By.xpath("//select[@id='years']")));
	  Dropdown2.selectByValue("2020");
	  
	  driver.findElement(By.xpath("//div[@id='uniform-newsletter']")).click();
	  
	  WebElement Special = driver.findElement(By.xpath("//input[@id='optin']"));
	  
	  Special.click();   //check
	  if(Special.isSelected())
		  Special.click();   //uncheck
	  
	  driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("Bhiswas");
	  driver.findElement(By.xpath("//input[@id='lastname']")).sendKeys("Sai");
	  driver.findElement(By.xpath("//input[@id='company']")).sendKeys("SeleniumJAVA");
	  driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("Miyapur");
	  driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("Nandini Hostel");
	  driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Hyderabad");
	  
	  Select Dropdown4= new Select(driver.findElement(By.xpath("//select[@id='id_state']")));
	  Dropdown4.selectByVisibleText("Indiana");
	  
	  driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("00000");
	  
	  Select Dropdown5= new Select(driver.findElement(By.xpath("//select[@id='id_country']")));
	  Dropdown5.selectByVisibleText("United States");
	  
	  driver.findElement(By.xpath("//textarea[@id='other']")).sendKeys("Testing Tools");
	  driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("1234567890");
	  driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("9885977184");
	  driver.findElement(By.xpath("//input[@id='alias']")).sendKeys("hi_hi@gmail.com");
	  driver.findElement(By.xpath("//button[@id='submitAccount']")).click();
	  
	  //System.out.println(driver.findElement(By.xpath("//p[@class='info-account']")).getText());
	  
String mes="Welcome to your account";
String actualmes=driver.findElement(By.xpath("//p[@class='info-account']")).getText();
if(mes.contains(actualmes))
{
	System.out.println("Account created successfully");
	Assert.assertTrue(true);
}
else
{
	System.out.println("account not created");
	Assert.assertTrue(false);
  }}
}
