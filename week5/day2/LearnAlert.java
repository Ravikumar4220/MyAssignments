package week5.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node0jg5lnvgxcb5bx9r42bjn6s4981299.node0");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
		Alert simpleAlert = driver.switchTo().alert();
		Thread.sleep(3000);
		simpleAlert.accept();
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		Alert ConfirmAlert = driver.switchTo().alert();
		Thread.sleep(3000);
		ConfirmAlert.accept();
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert PromptAlert = driver.switchTo().alert();
		Thread.sleep(3000);
		PromptAlert.sendKeys("TestLeaf");
		PromptAlert.accept();
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		driver.findElement(By.xpath("//span[text()='No']")).click();
		driver.findElement(By.xpath("(//span[text()='Show'])[6]")).click();
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-minus']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[3]")).click();
	}

}
