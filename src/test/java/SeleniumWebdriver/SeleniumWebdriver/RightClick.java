package SeleniumWebdriver.SeleniumWebdriver;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//launch chrome browser
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver(options);
		
		//open url
		driver.get("https://demoqa.com/buttons");
		
		//web ellement
		WebElement button = driver.findElement(By.xpath("//button[@id=\"rightClickBtn\"]"));
		
		//Action class used to mouse operation .Action class ka object create karege.
		//Parenthesis mein hum argument pass karege driver ka object
		Actions action = new Actions(driver);
		action.contextClick(button).perform();
		
		
		
	}

}
