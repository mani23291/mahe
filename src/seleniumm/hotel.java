package seleniumm;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class hotel {

	
	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Gurram Ramya\\Downloads\\79\\chromedriver.exe" );
			WebDriver driver = new ChromeDriver();
			// driver.get("https://www.adactin.com/HotelApp/");
			driver.navigate().to("https://www.adactin.com/HotelApp/");
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			

			WebElement user = driver.findElement(By.id("username"));
			user.sendKeys("Akilambal");

			WebElement pass = driver.findElement(By.id("password"));
			pass.sendKeys("nopassword@95");

			WebElement btn = driver.findElement(By.id("login"));
			btn.click();

			// String name=driver.findElement(By.id("username_show")).getAttribute("value");
			// String name1=name.getAttribute("value");
			// System.out.println(name);

			// String title=driver.getTitle();
			// System.out.println(title);

			// String url=driver.getCurrentUrl();
			// System.out.println(url);

			// String pgsrc=driver.getPageSource();
			// System.out.println(pgsrc);

			WebElement a = driver.findElement(By.id("location"));
			Select sel = new Select(a);
			sel.selectByIndex(2);

			WebElement b = driver.findElement(By.id("hotels"));
			Select sel2 = new Select(b);
			sel2.selectByIndex(1);

			WebElement c = driver.findElement(By.id("room_type"));
			Select sel3 = new Select(c);
			sel3.selectByIndex(3);

			WebElement d = driver.findElement(By.id("room_nos"));
			Select sel4 = new Select(d);
			sel4.selectByIndex(1);

			WebElement e = driver.findElement(By.id("datepick_in"));
			e.sendKeys("21/12/2019");

			WebElement f = driver.findElement(By.id("datepick_out"));
			f.sendKeys("22/12/2019");

			WebElement g = driver.findElement(By.id("adult_room"));
			Select sel5 = new Select(g);
			sel5.selectByIndex(1);

			WebElement h = driver.findElement(By.id("child_room"));
			Select sel6 = new Select(h);
			sel6.selectByIndex(1);

			WebElement i = driver.findElement(By.id("Submit"));
			i.click();

			WebElement j = driver.findElement(By.id("radiobutton_0"));
			j.click();

			WebElement k = driver.findElement(By.id("continue"));
			k.click();

			WebElement l = driver.findElement(By.id("first_name"));
			l.sendKeys("Vijay");

			WebElement m = driver.findElement(By.id("last_name"));
			m.sendKeys("V");

			WebElement n = driver.findElement(By.id("address"));
			n.sendKeys("Chennai");

			WebElement o = driver.findElement(By.id("cc_num"));
			o.sendKeys("1234567899632548");

			WebElement p = driver.findElement(By.id("cc_type"));
			Select sel7 = new Select(p);
			sel7.selectByIndex(1);

			WebElement q = driver.findElement(By.id("cc_exp_month"));
			Select sel8 = new Select(q);
			sel8.selectByIndex(5);

			WebElement r = driver.findElement(By.id("cc_exp_year"));
			Select sel9 = new Select(r);
			sel9.selectByIndex(10);

			WebElement s = driver.findElement(By.id("cc_cvv"));
			s.sendKeys("332");

			WebElement t = driver.findElement(By.id("book_now"));
			t.click();
			
			WebDriverWait wait = new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("order_no")));
			
			String v = driver.findElement(By.id("order_no")).getAttribute("value");
			System.out.println(v);
			driver.findElement(By.id("my_itinerary")).click();
			
			
			java.util.List<WebElement> data=driver.findElements(By.xpath("//table//tr//tr"));
			for(WebElement e1:data)  {
				java.util.List<WebElement> table=e1.findElements(By.xpath(".//input"));
				for(WebElement y:table) {
					System.out.println(y.getAttribute("value"));
				}
			}
			// driver.navigate().back();
			// driver.navigate().forward();
			// driver.navigate().refresh();

			//driver.close();
		
		}

	}

