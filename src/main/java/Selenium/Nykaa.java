package Selenium;

import org.openqa.selenium.chrome.ChromeDriver;

public class Nykaa {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		//Launch URL
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();

	}

}
