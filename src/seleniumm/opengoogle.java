package seleniumm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class opengoogle {

	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gurram Ramya\\Desktop\\chrome78\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	
    
	WebElement user=driver.findElement(By.id("username"));
     user.sendKeys("hello mani");
  
     WebElement passwd=driver.findElement(By.id("password"));
     passwd.sendKeys("admin123");
  
     WebElement btn=driver.findElement(By.id("login"));
     btn.click();
     
     String b=driver.getTitle();
     System.out.println(b);
     
     WebElement S=driver.findElement(null);
     
     
	} 	
}
