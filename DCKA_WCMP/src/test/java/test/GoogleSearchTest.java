package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchpage;

public class GoogleSearchTest {
	public static void main(String[] args) {
		GoogleSearch();
	}
	
	private static WebDriver driver = null;
		public static void GoogleSearch(){
			
			String dirpath = System.getProperty("user.dir");
			System.out.println("Usr directory path is: "+dirpath);
			
			System.setProperty("webdriver.chrome.driver",dirpath+"\\Drivers\\chromedriver.exe");
			
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://google.com");
			
			GoogleSearchpage.textbox(driver).sendKeys("Hi");
			GoogleSearchpage.searchbox(driver).sendKeys(Keys.ENTER);
			
				
			
		}

}
