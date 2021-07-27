package Aptumo.Aptumo_UK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Hello world!
 *
 */
public class App {

@Test
public void test(){

    {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Hp\\Documents\\New folder\\chromedriver_win32\\chromedriver_win32 (2)\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver();
    	  /*driver.get("https://ssplc-mail.com/owa/auth/logon.aspx?replaceCurrent=1&url=https%3a%2f%2fssplc-mail.com%2fowa%2f");
        driver.findElement(By.id("username")).sendKeys("ems\\sharmo");
        driver.findElement(By.id("password")).sendKeys("Best@2029");
        //driver.findElement(By.className("btn"))
      this steps are written for the web email
        * driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td[2]/table/tbody/tr[7]/td/table/tbody/tr[3]/td/input")).click();
        
        driver.findElement(By.xpath("html/body/div[13]/div[3]/div[3]/div/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[3]/div//div[2]/div/div/div/div[2]/div/div/div[4]")).click();
        */
        
    	//navigate to the URL and enter the credentials
    	driver.get("https://aptumoaupoc1-dev-ed.my.salesforce.com/");
    	
    		driver.findElement(By.id("username")).sendKeys("mohitsharma@echo.com.aupoc1");
    		driver.findElement(By.id("password")).sendKeys("Best@2021");
    		driver.findElement(By.id("Login")).click();
    	
    	
    	
    	System.out.println( "Hello World!" );
    }   }
}
