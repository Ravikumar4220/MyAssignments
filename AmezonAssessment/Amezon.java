package AmezonAssessment;

import java.time.Duration;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amezon {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("createAccountSubmit")).click();
		driver.findElement(By.xpath("//input[@name='customerName']")).sendKeys("Ravikumar");
		Thread.sleep(15);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("7373448254");
		Thread.sleep(15);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Ravim@99");
		Thread.sleep(15);
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

}
