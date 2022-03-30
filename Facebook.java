package week2.Assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();	
		driver.findElement(By.xpath("//input[@placeholder='First name']")).sendKeys("Harini");
		driver.findElement(By.name("lastname")).sendKeys("Ganesh");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9042149723");
		driver.findElement(By.id("password_step_input")).sendKeys("Vikasini@21");
		WebElement day = driver.findElement(By.id("day"));
		Select dropDown1 = new Select(day);
		dropDown1.selectByVisibleText("14");
		WebElement month = driver.findElement(By.id("month"));
		Select dropDown2 = new Select(month);
		dropDown2.selectByVisibleText("Nov");
		WebElement year = driver.findElement(By.id("year"));
		Select dropDown3 = new Select(year);
		dropDown3.selectByVisibleText("1995");
		driver.findElement(By.xpath("//input[@name='sex'][1]")).click();
	}

}
