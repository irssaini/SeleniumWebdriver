package SeleniumWebdriver.SeleniumWebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
	//lauch chrome browser
			System.setProperty("webdriver.chrome.driver", "C:\\Data\\Selenium\\chromedriver_win32 (4)\\chromedriver.exe");
			WebDriver driver =new ChromeDriver();
			//Launch google.in
			driver.navigate().to("https://www.google.co.in/");
			
			//capture tittle of webpage and print
			String tittle = driver.getTitle();
			System.out.println("Page Tittle : "+ tittle);
			
			//capture url of page
			System.out.println("URL : "+ driver.getCurrentUrl());
			
			//Capture page source
			System.out.println("Page Source : "+ driver.getPageSource());
		}

	}

