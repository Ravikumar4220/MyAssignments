package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Instagram {
	public static void main(String[] args) {
		
		//download the driver and set the path
		WebDriverManager.chromedriver().setup();
		//launch chrome browser
		ChromeDriver driver=new ChromeDriver();
		//load appilication url
		driver.get("https://www.instagram.com/accounts/login/");
		//maximize the browser
		driver.manage().window().maximize();
		//enter the username as ravimani56
		driver.findElement(By.name("username")).sendKeys("ravimani56");
		//enter the password as 04022000
		driver.findElement(By.name("password")).sendKeys("04022000");
		}
	    }
