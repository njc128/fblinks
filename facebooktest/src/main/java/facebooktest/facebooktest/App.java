package facebooktest.facebooktest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class App 
{
	public static WebDriver driver;
    public static void main( String[] args ) throws InterruptedException
    {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\nadia\\eclipse-workspace\\seleniumproject1\\Driver\\chromedriver.exe");
        driver=new ChromeDriver(); 
    	
    	driver.get("https://www.facebook.com/");
    
    	driver.manage().window().maximize();
    	Thread.sleep(5000);
    	
  List<WebElement> Links=	driver.findElements(By.tagName("a"));
       

    
}

}