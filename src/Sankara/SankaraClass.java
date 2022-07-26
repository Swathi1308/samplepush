package Sankara;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SankaraClass {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUp() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver\\chromedriver.exe");
		 driver = new ChromeDriver();	
		driver.get("https://test-sankarapoly.p7devs.com/web/login");
		driver.manage().window().maximize();
      System.out.println("The app setup process is completed");
      
	}
	
  @Test(description="Login")
  public void fun() 
  {
		
	driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys("admin");
	WebElement Password = driver.findElement( By.xpath("//*[@id=\"password\"]"));
	Password.sendKeys("@dmin$123"); 
	WebElement LogIN = driver.findElement( By.xpath("//*[@id=\"wrapwrap\"]/main/div/form/div[3]/button"));
	LogIN.click();
	  }
  
  @Test(description="Move to Admission")
  public void admission() throws InterruptedException
  {
	  driver.findElement(By.xpath("/html/body/header/nav/ul[1]/li/a")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("/html/body/header/nav/ul[1]/li/div/a[9]")).click();
	  
  }
}
