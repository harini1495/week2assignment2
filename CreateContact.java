package week2.Assignment2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Harini");
		driver.findElement(By.id("lastNameField")).sendKeys("Ganesh");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Hari");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Gani");
		driver.findElement(By.name("departmentName")).sendKeys("Automationtester");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Selenium using web application");
		driver.findElement(By.name("primaryEmail")).sendKeys("harini1495@gmail.com");
		WebElement state = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select dropDown = new Select(state);
		dropDown.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Selenium Study Important Notes");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		System.out.println(driver.getTitle());
	}

}
