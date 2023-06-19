package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NewSprintCreation {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//ChromeOptions options = new ChromeOptions();
		//options.addArguments("--incognito");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://id.atlassian.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("bharathece15@gmail.com");
		driver.findElement(By.xpath("//button[@id=\"login-submit\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("ChennaiJira@123");
		driver.findElement(By.xpath("//button[@id=\"login-submit\"]")).click();
		Thread.sleep(10000);
		
}
}