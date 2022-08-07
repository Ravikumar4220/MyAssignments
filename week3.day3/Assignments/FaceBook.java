package week3.day3.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Ravikumar");
		driver.findElement(By.name("lastname")).sendKeys("Mookkan");
		driver.findElement(By.name("reg_email__")).sendKeys("7373448254");
		driver.findElement(By.id("password_step_input")).sendKeys("Ravim@99");
		WebElement dropDown1 = driver.findElement(By.name("birthday_day"));
        Select dd1=new Select(dropDown1);
        dd1.selectByVisibleText("30");
        WebElement dropDown2 = driver.findElement(By.name("birthday_month"));
	    Select dd2=new Select(dropDown2);
	    dd2.selectByIndex(3);
	    WebElement dropDown3 = driver.findElement(By.name("birthday_year"));
	    Select dd3=new Select(dropDown3);
	    dd3.selectByValue("1999");
	    driver.findElement(By.xpath("//label[text()=\"Male\"]")).click();
	    
	    }
	   }
