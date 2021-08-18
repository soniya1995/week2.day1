package week2.day1;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.name("UserFirstName")).sendKeys("Soniya");
		driver.findElement(By.name("UserLastName")).sendKeys("N");
		driver.findElement(By.name("UserEmail")).sendKeys("soni.123@dxc.com");
		driver.findElement(By.name("CompanyName")).sendKeys("DXC");
		driver.findElement(By.name("UserPhone")).sendKeys("9134276121");
		WebElement Job = driver.findElement(By.name("UserTitle"));
		Select jo = new Select(Job);
		jo.selectByIndex(6);
		WebElement Employe = driver.findElement(By.name("CompanyEmployees"));
		Select Emp = new Select(Employe);
		Emp.selectByIndex(4);
		WebElement Coutry = driver.findElement(By.name("CompanyCountry"));
		Select co = new Select(Coutry);
		co.selectByVisibleText("Argentina")	;
		driver.findElement(By.className("checkbox-ui")).click();
		driver.close();
		
		
		

	
	
	}

}
