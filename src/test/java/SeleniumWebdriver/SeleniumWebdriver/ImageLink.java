package SeleniumWebdriver.SeleniumWebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageLink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperty("webdriver.chrome.driver", "D:\\Users\\ramin\\eclipse-workspace\\SeleniumWebdriver\\Drivers\\chromedriver.exe");
		//WebDriver driver =new ChromeDriver();
		//Launch google.in
		//driver.navigate().to("https://www.google.co.in/");
		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();

		WebDriver driver = new ChromeDriver(options);
		
	//maximize the browser
	driver.manage().window().maximize();
	
	//open the url
	driver.get("https://www.opencart.com/");
	
	//find web element of image link
	driver.findElement(By.xpath("//img[@title='OpenCart - Open Source Shopping Cart Solution']")).click();
   
	//verify the title of page
	if(driver.getTitle().equals("OpenCart - Open Source Shopping Cart Solution"))
	{
		System.out.println("Test Passed");
	}
	else {
		System.out.println("Test Failed");
	}
	driver.quit();
	
			
	
	
		
	
	}

}
