package Selenium;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateIssueJira {

	public static void main(String[] args) throws InterruptedException {
		// 3.141 Version
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\bhara\\Downloads\\chromedriver_win32\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.google.com/gmail/about/");
//		System.out.println(driver.getTitle());

		// 4.1 Version
		//WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://id.atlassian.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("bharathece15@gmail.com");
		driver.findElement(By.xpath("//button[@id=\"login-submit\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("ChennaiJira@123");
		driver.findElement(By.xpath("//button[@id=\"login-submit\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='Jira Software']")).click();
//     	WebElement ele = driver.findElement(By.xpath("//div[@data-testid=\"product-container\"]/a[2]/button"));
//     	ele.click();
		//Thread.sleep(10000);
//		JavascriptExecutor j = (JavascriptExecutor) driver;
//		j.executeScript("arguments[0].click();", ele);
		driver.findElement(By.xpath("//button[@id=\"createGlobalItem\"]")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@name=\"summary\"]")).sendKeys("SDET Selenium Assignment");
		Thread.sleep(2000);
		WebElement element = driver.findElement(By.xpath("//span[contains(text(),\"Automatic\")]"));
		element.click();
		Thread.sleep(2000);
		element.clear();
		List<String> myList = Arrays.asList("Aravind Swamy", "Bhuvanesh K A", "priyankabuvana3",
				"Vigneshkumar Tamilselvan");
		Random r = new Random();
		int randomitem = r.nextInt(myList.size());
		String randomElement = myList.get(randomitem);
		element.sendKeys(randomElement);
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(3000);
		
		
		
		
		

	}

}
