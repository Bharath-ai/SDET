
package selenium;

import java.time.Duration;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Map.Entry;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateNewSprintAndProject {

	@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//WebDriverManager.chromedriver().setup();
		
		
		ChromeDriver driver = new ChromeDriver();
		//1. Log in to JIRA
		driver.get("https://id.atlassian.com/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.findElement(By.xpath("//input[@id=\"username\"]")).sendKeys("bharathece15@gmail.com");
		driver.findElement(By.xpath("//button[@id=\"login-submit\"]")).click();
		driver.findElement(By.xpath("//input[@id=\"password\"]")).sendKeys("ChennaiJira@123");
		driver.findElement(By.xpath("//button[@id=\"login-submit\"]")).click();
		
		//2. Click on the menu icon on the left top corner and
		driver.findElement(By.xpath("//div[@role=\"presentation\"]//button[@data-testid=\"switcher-btn\"]")).click();
		
		//3.Verify the Jira Software is present in the menu and click it.
		WebElement jiraSoftware = driver.findElement(By.xpath("//span[contains(text(),'Jira Software')]"));
		boolean element = jiraSoftware.isDisplayed();
		if(element) jiraSoftware.click();
		
		//Deleting the existing Project if any:
		//driver.findElement(By.xpath("//div[@data-testid=\"global-pages.directories.projects-directory-v3.ui.page-layout.projects-list.container\"]/table/tbody/tr/td[7]")).click();
	
		//4.Verify the icon present in the page and text as "You don't have any software projects" and 
		//click on Create Project, before clicking verify the button is enabled.
		driver.findElement(By.xpath("//h4[text()=\"You currently have no projects\"]")).isDisplayed();
		WebElement createProject = driver.findElement(By.xpath("//span[text()=\"Create project\"]"));
		createProject.isEnabled();
		createProject.click();
		
		//5.Click on the Scrum option and select use template in next page
		
		driver.findElement(By.xpath("//button[@aria-label=\"Scrum\"]")).click();
		driver.findElement(By.xpath("//span[text()=\"Use template\"]")).click();
		driver.findElement(By.xpath("//span[text()='Select a team-managed project']")).click();
		
		//6.Give the project details and create a new project, now verify project Key and 3 Types of JIRA 
		//status pane present (To Do, In-progress, Done).
		
		String key = "SDET";
		driver.findElement(By.id("project-create.create-form.name-field.input")).sendKeys("Selenium-DSA");
		driver.findElement(By.id("project-create.create-form.advanced-dropdown.key-field.input")).sendKeys(key);
		driver.findElement(By.xpath("//span[text()='Next']")).click();
		WebElement goToProject = driver.findElement(By.xpath("//span[text()='Go to project']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10000));
		wait.until(ExpectedConditions.visibilityOfElementLocated((By) goToProject));
		goToProject.click();
		String keyBoard = driver.findElement(By.xpath("//h1[text()='SDET board']")).getText();
		if (keyBoard.contains(key)) {
			String[] values = { "To Do", "In Progress", "Done" };
			int count = 0;
			for (int i = 0; i < values.length; i++) {
				if (driver.findElement(By.xpath("//div[text()=" + values[i] + "]")).isDisplayed()) {
					count++;
				}
			}
			if(count==3) System.out.println("All status are Present");
}
		
		
		//7.Now star the project using the top right corner icon and verify it is starred.
		WebElement createSprint = driver.findElement(By.xpath("//button[@aria-label='Add to Starred']"));
		createSprint.click();
		driver.findElement(By.xpath("//button[@aria-label='Remove from Starred']")).isEnabled();
		
		//8.Now Click on Backlog and Verify there is No Sprit have started.
		driver.findElement(By.xpath("//span[text()='Backlog']")).click();
		String issue = driver.findElement(By.xpath("//div[@role='button']//div[text()='Backlog']/following::div")).getText();
		if(issue.contains("0 issues")) {
			System.out.println("No Sprint have started");
		}
		
		//9.Now click on Add date in the sprint 1(Default sprint pane) and click add dates, verify add 
		//dates text before clicking.
		
		driver.findElement(By.xpath("//span[text()='Add dates']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Edit sprint: SDET Sprint 1']")));
		WebElement fromDate = driver.findElement(By.xpath("//div[@class=' css-hkzqy0-singleValue'][2]"));
		fromDate.click();
		fromDate.clear();
		Date date = new Date();
		String startDate = date.toString();
		fromDate.sendKeys(startDate,Keys.ENTER);
		
		WebElement toDate = driver.findElement(By.xpath("//div[@class=' css-hkzqy0-singleValue'][2]"));
		toDate.click();
		toDate.clear();
		fromDate.sendKeys(startDate,Keys.ENTER);
		
		//10.Click on Update Button
		driver.findElement(By.xpath("//span[text()='Update']")).click();
		
		//11.Verify Create sprint button is disabled
		//12.Click on Add issue and Add 2 Story and 2 Bugs, after adding verify the project name with bug 
		//id, JIRA status as Todo and Assignee as Unassigned.
		if(!createSprint.isDisplayed()) {
			driver.findElement(By.xpath("//button[@id=\"createGlobalItem\"]")).click();
			driver.findElement(By.xpath("//input[@name=\"summary\"]")).sendKeys("SDET Selenium Assignment");
			WebElement assignee = driver.findElement(By.xpath("//span[contains(text(),\"Automatic\")]"));
			assignee.click();
			assignee.clear();
			List<String> myList = Arrays.asList("Aravind Swamy", "Bhuvanesh K A", "priyankabuvana3",
					"Vigneshkumar Tamilselvan");
			Random r = new Random();
			int randomitem = r.nextInt(myList.size());
			String randomElement = myList.get(randomitem);
			assignee.sendKeys(randomElement);
			driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			
			//drag&drop
			WebElement source = driver.findElement(By.xpath("//span[text()='SDET Selenium Assignment']"));
			WebElement target = driver.findElement(By.xpath("//div[contains(@data-test-id,software-backlog.card-list.empty-card-list)]"));
			Actions action = new Actions(driver);
			action.dragAndDrop(source, target).build().perform();
			
			//13.Click on Start Sprint and Verify Start button is present and enabled and click it
			driver.findElement(By.xpath("//span[text()='Start sprint']")).click();
			
			//14. Verify the Sprint Started dialog at the left bottom and close it.
			//
			driver.findElement(By.xpath("@id=\"modal-dialog-title")).isDisplayed();
			driver.findElement(By.xpath("//span[text()='Cancel']")).click();
			
			
			
		}
		
		
		
		}

	}


