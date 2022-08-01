package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchChromeBrowser {
	public static void main(String[] args) {
		
		//download the driver and set the path
		WebDriverManager.chromedriver().setup();
		//launch chrome browser
		ChromeDriver driver=new ChromeDriver();
		//load appilication url
		driver.get("http://leaftaps.com/opentaps/control/main");
		//maximize the browser
		driver.manage().window().maximize();
		//enter the username as demosalesmanager
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//enter the password as crmsfa
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//click login button
		driver.findElement(By.className("decorativeSubmit")).click();
		//get the text
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		//click crm/sfa button
		driver.findElement(By.linkText("CRM/SFA")).click();
		//click leads button
		driver.findElement(By.linkText("Leads")).click();
		//click create lead button
		driver.findElement(By.linkText("Create Lead")).click();
		//enter the companyname as TestLeaf
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		//enter the firstname as RaviKumar
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Ravikumar");
		//enter the lastName as Mookkan
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mookkan");
		//click the create lead button
		driver.findElement(By.className("smallSubmit")).click();
	   }
	   }
