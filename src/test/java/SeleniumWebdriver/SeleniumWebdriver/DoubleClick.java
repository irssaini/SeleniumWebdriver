package SeleniumWebdriver.SeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {
public static void main(String args[]) {
	
	WebDriverManager.chromedriver().setup();
	ChromeOptions options = new ChromeOptions();
	WebDriver driver = new ChromeDriver(options);
	
	//open url
	driver.get("https://demoqa.com/buttons");
	
	//find webelement
	WebElement button = driver.findElement(By.xpath("//button[@id=\"doubleClickBtn\"]"));
	
	Actions act = new Actions(driver);
	act.doubleClick(button).perform();
	
	
	
}
}
