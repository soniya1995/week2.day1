package week2.day1;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leaftapslogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("DXC Technology");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Soniya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("N");
		WebElement drop1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drpDwn = new Select(drop1);
		drpDwn.selectByIndex(4);
		WebElement drop2 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select drpDwn1 = new Select(drop2);
		drpDwn1.selectByIndex(3);
		WebElement drop3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select drpDwn2 = new Select(drop3);
		drpDwn2.selectByVisibleText("Corporation");
		WebElement prim = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
		prim.clear();
		prim.sendKeys("5");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("AA");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("No:1/4,s-type,allur camp");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("chennai");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Minjur");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600120");
		WebElement drop4 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select drpDwn3 = new Select(drop4);
		drpDwn3.selectByVisibleText("India");
	    driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("06/25/95");
        driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("60");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("44");
		driver.findElement(By.name("submitButton")).click();
		String fs = driver.findElement(By.id("createLeadForm_firstName")).getAttribute("value");
		System.out.println("FS:" + fs);
		
		
		
		/*
		 * String title = "My Home | opentaps CRM"; 
		 * String homeTitle = driver.getTitle();
		 * 
		 * if(title.equals(homeTitle)) { System.out.println(" In the Home Page"); } else
		 * System.out.println(" Not in the Home page");
		 */

	}

}
