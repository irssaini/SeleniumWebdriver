package SeleniumWebdriver.SeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_Xpath_Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Data\\RSSaini\\x\\SeleniumWebdriver\\Drivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		// open sauce demo web page
		driver.get("https://www.saucedemo.com/");

		// Locate username
		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		// Locate password
		driver.findElement(By.name("password")).sendKeys("secret_sauce");

		// Locate Login button
		driver.findElement(By.className("submit-button")).click();

	}

}
