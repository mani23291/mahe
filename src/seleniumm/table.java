package seleniumm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class table {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Gurram Ramya\\Downloads\\79\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.adactin.com/HotelApp/BookedItinerary.php");
		
	java.util.List<WebElement> data=driver.findElements(By.xpath("//table//tr//tr"));
	for(WebElement e1:data)  {
		java.util.List<WebElement> table=e1.findElements(By.xpath(".//input"));
		for(WebElement y:table) {
			System.out.println(y.getAttribute("value"));
		}
	}

}
}