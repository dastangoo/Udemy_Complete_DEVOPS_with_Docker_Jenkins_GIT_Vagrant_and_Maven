import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Selenium_Automation_web {

	@Test
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\UC Client\\Downloads");
		WebDriver driver = new ChromeDriver();
		System.out.println("Hi, Welcome to Jenkins automated testing");
		
		driver.navigate().to("https://amazon.in");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nike Shoes");
		driver.findElement(By.xpath("/html/body/div[1]/header/div/div/[1]/div[3]/div/form/div[2]/div/input")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.navigate().back();
		String title = driver.getTitle();
		System.out.println("Page Title is:-" + title);
		
		driver.navigate().to("https://www.facebook.com");
		driver.findElement(By.name("email")).sendKeys("abcd@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("1234");
		driver.findElement(By.id("loginbutton")).click();
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.quit();
	}

}
