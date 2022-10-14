package SeleniumWebdriver.SeleniumWebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountRadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.setProperty("webdriver.chrome.driver","D:\\Users\\ramin\\eclipse-workspace\\SeleniumWebdriver\\Drivers\\chromedriver.exe");
//WebDriver driver = new ChromeDriver();

		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();

		WebDriver driver = new ChromeDriver(options);

		driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");

//find the radio button web element on webpage
		List<WebElement> radioButtonList = driver.findElements(By.xpath("//input[@type='radio']"));

//print total button of radio button
		System.out.println("Total number of radio button : " + radioButtonList.size());

		driver.quit();

	}

}
