package SivaOwnProject.Siva;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Testautomation_Practice {
	static WebDriver driver;
	
	
  @Test
  public void Practice() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	  driver= new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://testautomationpractice.blogspot.com/");
	  
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	  driver.findElement(By.id("Wikipedia1_wikipedia-search-input")).sendKeys("www.google.com");
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
	  //driver.findElement(null)
	  
	  driver.findElement(By.xpath("//button[text()='Click Me']")).click();    //Alert
	  System.out.println(driver.switchTo().alert().getText());
	  driver.switchTo().alert().accept();
	  
	    
	  driver.findElement(By.xpath("//button[text()='Click Me']")).click();
	  System.out.println(driver.switchTo().alert().getText());
	  driver.switchTo().alert().dismiss();
	  
	  /* driver.findElement(By.xpath("//button[text()='Click Me']")).click();
	  System.out.println(driver.switchTo().alert().getText());
	  driver.switchTo().alert().sendKeys("Siva");                //enter text in popup//
	  driver.switchTo().alert().accept();
	  driver.switchTo().alert().dismiss();  */
	  
	  driver.findElement(By.id("datepicker")).click();			//method 1 Calendar
	 // driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()=29]")).click();
	  driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[3]/a")).click();

	//*[@id="ui-datepicker-div"]/table/tbody/tr[5]/td[2]/a
	  //int day = 23;
	  
	 // driver.findElement(By.id("datepicker")).click();	//use method 2 date change with int//
	 // driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()="+day+"]")).click();
	  
	  Select dropdown = new Select(driver.findElement(By.id("speed")));
	  dropdown.selectByVisibleText("Fast");
	  
	  Select dropdown1 = new Select(driver.findElement(By.xpath("//select[@id='files']")));
	  dropdown1.selectByVisibleText("PDF file");
	  
	 Select dropdown2 = new Select(driver.findElement(By.xpath("//select[@id='number']")));
	 dropdown2.selectByIndex(1);
	 
	 Select dropdown3 = new Select(driver.findElement(By.id("products")));
	 dropdown3.selectByIndex(1);
	 
	 Select dropdown4 = new Select(driver.findElement(By.xpath("//select[@id='animals']")));
	 dropdown4.selectByVisibleText("Baby Cat");
	 
	 
	 //part 3
	 
	 Actions actions = new Actions(driver);
	 actions.doubleClick(driver.findElement(By.xpath("//button[text()='Copy Text']"))).perform();
	 
	 WebElement Source_Drag_Button = driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
	 WebElement Target_Drag_Button = driver.findElement(By.xpath("//div[@id='droppable']"));
	 actions.dragAndDrop(Source_Drag_Button, Target_Drag_Button).perform();
	 
	 WebElement Source_Drag_Button1 = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[1]/img"));
	 WebElement Target_Drag_Button1 = driver.findElement(By.xpath("//*[@id=\"trash\"]"));
	 actions.dragAndDrop(Source_Drag_Button1, Target_Drag_Button1).perform();
	  
	 WebElement Source_Drag_Button2 = driver.findElement(By.xpath("//*[@id=\"gallery\"]/li[2]/img"));
	 WebElement Target_Drag_Button2 = driver.findElement(By.xpath("//*[@id=\"trash\"]"));
	 actions.dragAndDrop(Source_Drag_Button2, Target_Drag_Button2).perform();
	 
	 //part 2
	 Thread.sleep(2000)
;	 driver.findElement(By.xpath("//input[@id='RESULT_TextField-1']")).sendKeys("Bhiswas");
	 driver.findElement(By.id("RESULT_TextField-2")).sendKeys("Sai");
	 driver.findElement(By.id("RESULT_TextField-3")).sendKeys("9949055841");
	 driver.findElement(By.id("RESULT_TextField-4")).sendKeys("India");
	 driver.findElement(By.id("RESULT_TextField-5")).sendKeys("Vijayawada");
	 driver.findElement(By.id("RESULT_TextField-6")).sendKeys("automation2000@gmail.com");
	 
	 driver.findElement(By.id("//td[@class='highlight']")).click();     //radio button
	 
	 WebElement Checkbox = driver.findElement(By.id("RESULT_CheckBox-8_2"));
	 Checkbox.click();
	 if (Checkbox.isSelected());
	 Checkbox.click();
	 
	 WebElement Checkbox1 = driver.findElement(By.id("RESULT_CheckBox-8_5"));
	 Checkbox1.click();
	 
	 Select dropdown5 = new Select(driver.findElement(By.id("RESULT_RadioButton-9")));
	 dropdown5.selectByVisibleText("Evening");
	 
	 Thread.sleep(2000);
	 
	 String str = "C:\\HTML Report\\Selenium.txt" ;
			 
			 // Create object of Robot class
			 Robot robot = new Robot();
			 Thread.sleep(2000);
			      
			 
			  // Press CTRL+V
			 robot.keyPress(KeyEvent.VK_CONTROL);
			 robot.keyPress(KeyEvent.VK_V);
			 
			// Release CTRL+V
			 robot.keyRelease(KeyEvent.VK_CONTROL);
			 robot.keyRelease(KeyEvent.VK_V);
			 Thread.sleep(2000);
			        

		       //  Press Enter 
			 robot.keyPress(KeyEvent.VK_ENTER);
			 robot.keyRelease(KeyEvent.VK_ENTER);
	 
	 
	 
	 
  }
}
	  
