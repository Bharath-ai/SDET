package Selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import junit.framework.Assert;

public class ValidateIssue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		ChromeDriver driver = new ChromeDriver(options);
        //driver.get("https://id.atlassian.com/login");
		driver.get("https://bhuvaneshkvp.atlassian.net/jira/software/projects/S2/boards/1");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("bharathece15@gmail.com");
		driver.findElement(By.xpath("//button[@id=\"login-submit\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("ChennaiJira@123");
		driver.findElement(By.xpath("//button[@id=\"login-submit\"]")).click();
		Thread.sleep(10000);
		
		//Click on the Projects
        driver.findElement(By.xpath("//span[text()='Projects']")).click();
        Thread.sleep(5000);
        //Click on "View All Projects"
        driver.findElement(By.xpath("//span[text()='View all projects']")).click();
        Thread.sleep(5000);
        //Enter wrong Project Name
        WebElement element = driver.findElement(By.xpath("//input[@id=\"keyword\"]"));
        element.sendKeys("TESTLEAF");
        Thread.sleep(5000);
        //Validating the text
        String value = driver.findElement(By.tagName("h4")).getText();
        Thread.sleep(5000);
        Assert.assertEquals("No projects were found that match your search", value);
        //Entering correct Project Details
        element.sendKeys(Keys.ESCAPE);
        element.sendKeys("SDET 23");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//span[contains(text(),\"SDET 23\")]")).click();
        Thread.sleep(3000);
        //Taking Total Issue Count
        List<WebElement> findElements = driver.findElements(By.xpath("//*[@alt='Task']"));

		List<String> task_List = new ArrayList<String>();
		for (int i = 1; i < (findElements.size() + 1); i++) {
			WebElement iteam = driver.findElement(By.xpath("(//span[@class=\"sc-15cfu5s-1 fKpSAB\"])[" + i + "]"));
			JavascriptExecutor je = (JavascriptExecutor) driver;
			je.executeScript("arguments[0].scrollIntoView(true);", iteam);
            String card_text = iteam.getText();
            task_List.add(card_text);
			System.out.println(card_text);
		}
		String currentURL = driver.getCurrentUrl();

		// Open a new tab and Create a new issues
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> windowHandles = driver.getWindowHandles();
		for (String handle : windowHandles) {

			driver.switchTo().window(handle);
		}
		driver.navigate().to(currentURL);

		// Create issue
		driver.findElement(By.xpath("//button[@id=\"createGlobalItem\"]")).click();

		// Summary*
		String created_Bug = "Test case - New tab";
		driver.findElement(By.xpath("//input[@name='summary']")).sendKeys(created_Bug);
		driver.findElement(By.xpath("//span[text() = 'Assign to me']")).click();
		driver.findElement(By.xpath("(//button/span[text() ='Create'])[2]")).click();
		System.out.println("Issue created");
		driver.close();

		// Refresh and validate does the board has newly created issue
		driver.switchTo().window(windowHandles.iterator().next());
		driver.navigate().refresh();
		Assert.assertFalse(task_List.contains(created_Bug));

		// Create a bug with blocked by newly created issue
		driver.findElement(By.xpath("//span[text()='Create']")).click();
		driver.findElement(By.xpath("//input[@name='summary']")).sendKeys("Create - New Issue");
		driver.findElement(By.xpath("//*[text()='blocks']")).click();
		driver.findElement(By.xpath("//*[text()='is blocked by']")).click();
		driver.findElement(By.xpath("//*[text()='Select Issue']")).sendKeys("AutomateJira");
		driver.findElement(By.xpath("(//span[text()='Create'])[2]")).click();
		driver.findElement(By.xpath("//*[text()='linkedIssue']")).click();
		driver.findElement(By.xpath("//*[text()='To Do']")).click();
		driver.findElement(By.xpath("//*[text()='Done']")).click();
		driver.findElement(By.xpath("//button[@aria-label='Close']")).click();
		if (driver.findElement(By.xpath("//span[text()='tes']/following::span[2]")).isDisplayed())
			System.out.println("Passed");

		driver.close();

	}
	
	

}
