package week5.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrame {
	public static void main(String[] args) throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframeResult");
		WebElement frame1 = driver.findElement(By.xpath("//button[text()='Try it']"));
		Thread.sleep(3000);
		frame1.click();
		Alert PromptAlert = driver.switchTo().alert();
		Thread.sleep(3000);
		PromptAlert.sendKeys("Ravikumar");
		PromptAlert.accept();
		String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(text); 
		driver.switchTo().defaultContent();
	}
}
