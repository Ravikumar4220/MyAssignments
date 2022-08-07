package week3.day3.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
	public static void main(String[] args) throws InterruptedException {
		
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver=new ChromeDriver();
				driver.get("http://leaftaps.com/opentaps/control/main");
				driver.manage().window().maximize();
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				driver.findElement(By.id("password")).sendKeys("crmsfa");
				driver.findElement(By.className("decorativeSubmit")).click();
				String text = driver.findElement(By.tagName("h2")).getText();
				System.out.println(text);
				driver.findElement(By.linkText("CRM/SFA")).click();
				driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.linkText("Find Leads")).click();
				driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Ravikumar");
				driver.findElement(By.xpath("//button[text()=\"Find Leads\"]")).click();
				Thread.sleep(5000);
                driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[text()=\"16809\"]")).click();
                String title="View Lead | opentaps CRM";
        		String title2 = driver.getTitle();
        		System.out.println(title2);
        		if (title.equals(title2)) {
        		System.out.println("CreateLead created successfully");
        		}
        		else {
        		System.out.println("CreateLead not created successfully");
	}
	}
}