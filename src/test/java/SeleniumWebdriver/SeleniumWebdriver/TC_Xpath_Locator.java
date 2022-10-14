package SeleniumWebdriver.SeleniumWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC_Xpath_Locator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver","C:\\Data\\RSSaini\\x\\SeleniumWebdriver\\Drivers\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();

				WebDriverManager.chromedriver().setup();

				ChromeOptions options = new ChromeOptions();

				WebDriver driver = new ChromeDriver(options);
				
		// open sauce demo web page
		driver.get("https://www.saucedemo.com/");

		// Locate username
		driver.findElement(By.id("user-name")).sendKeys("standard_user");

		// Locate password
		driver.findElement(By.name("password")).sendKeys("secret_sauce");

		// Locate Login button
		driver.findElement(By.className("submit-button")).click();

		// Switch to product page
		String currWindowshandle = driver.getWindowHandle();
		driver.switchTo().window(currWindowshandle);

		// driver.findElement(By.linkText("Sauce Labs Backpack")).click(); //Click on product name
		//driver.findElement(By.partialLinkText("Bike")).click();

		List <WebElement> elementsList = driver.findElements(By.partialLinkText("Sauce"));
		System.out.println("Element Size : "+ elementsList.size());
	}

}
