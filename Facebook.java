package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			// Step 1: Download and set the path 
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Soooo");
		driver.findElement(By.name("lastname")).sendKeys("yaaaa");
		driver.findElement(By.name("reg_email__")).sendKeys("2198823108");
		driver.findElement(By.id("password_step_input")).sendKeys("Sai.Lid-43");
		WebElement date = driver.findElement(By.id("day"));
		Select dat = new Select(date);
		dat.selectByVisibleText("25");
		WebElement mon = driver.findElement(By.id("month"));
		Select mn1 = new Select(mon);
		mn1.selectByIndex(5);
		WebElement yer = driver.findElement(By.id("year"));
		Select yr = new Select(yer);
		yr.selectByVisibleText("1989");
		driver.findElement(By.className("_58mt")).click();
		
		
	}

}
