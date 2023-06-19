package selenium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTaps {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		//Launch URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
        driver.get("https://leafground.com/table.xhtml;jsessionid=node01bgpqj4687no513hpn97c0rvgb272959.node0#");

        int pages = driver.findElements(By.xpath("//a[contains(@class,'ui-paginator-page ui-state-default')]")).size();

        HashMap<String, List<List<String>>> hashMap = new HashMap<String, List<List<String>>>();

        String nameColumnName = "Name";
        String joiningDateColumnName = "Join Date";
        String representativeColumnName = "Representative";
        String statusColumnName = "Status";
        String countryColumnName = "Country";

        for (int page = 1; page <= pages; page++) {
            WebElement pageLink = driver.findElement(By.xpath("(//a[contains(@class,'ui-paginator-page ui-state-default')])[" + page + "]"));
            pageLink.click();

            int rowCount = driver.findElements(By.xpath("(//table[@role='grid'])[2]/tbody/tr")).size();

            for (int row = 1; row <= rowCount; row++) {
                String country = driver.findElement(By.xpath("(//table[@role='grid']/tbody/tr[" + row + "]/td[" + getColumnNumber(driver, countryColumnName) + "])")).getText();

                List<String> values = new ArrayList<String>();
                values.add(driver.findElement(By.xpath("(//table[@role='grid']/tbody/tr[" + row + "]/td[" + getColumnNumber(driver, nameColumnName) + "])")).getText());
                values.add(driver.findElement(By.xpath("(//table[@role='grid']/tbody/tr[" + row + "]/td[" + getColumnNumber(driver, joiningDateColumnName) + "])")).getText());
                values.add(driver.findElement(By.xpath("(//table[@role='grid']/tbody/tr[" + row + "]/td[" + getColumnNumber(driver, representativeColumnName) + "])")).getText());
                values.add(driver.findElement(By.xpath("(//table[@role='grid']/tbody/tr[" + row + "]/td[" + getColumnNumber(driver, statusColumnName) + "])")).getText());

                
                if (hashMap.containsKey(country)) {
                    
                    List<List<String>> countryValues = hashMap.get(country);
                    
                    countryValues.add(values);
                } else {
                    
                    List<List<String>> countryValues = new ArrayList<List<String>>();
                    countryValues.add(values);
                    hashMap.put(country, countryValues);
                }
            }
        }

        for (String country : hashMap.keySet()) {
            System.out.println("Country: " + country);
            System.out.println("Values: " + hashMap.get(country));
           
        }

        driver.quit();
		
		

	}

	private static int getColumnNumber(ChromeDriver driver, String countryColumnName) {
		List<WebElement> columnHeaders = driver.findElements(By.xpath("(//table[@role='grid'])[2]/thead/tr/th"));

        for (int i = 1; i <= columnHeaders.size(); i++) {
            WebElement columnHeader = driver.findElement(By.xpath("(//table[@role='grid'])[2]/thead/tr/th[" + i + "]"));
            if (columnHeader.getText().equals(countryColumnName)) {
                return i;
            }
	}

        return -1;
    }
}
