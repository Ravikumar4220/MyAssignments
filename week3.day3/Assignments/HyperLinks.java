package week3.day3.Assignments;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLinks {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/pages/Link.html");
		driver.manage().window().maximize();
		System.out.println(driver.findElement(By.xpath("(//a[text()=\"Go to Home Page\"])[1]")).getAttribute("href"));
		System.out.println(driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href"));
		String title="Error 404 Not Found";
		String title2=driver.getTitle();
		System.out.println(title2);
		if (title.equals(title2)) {
			System.out.println("Verifired am I broken");
		}
		System.out.println(driver.findElement(By.xpath("(//a[text()=\"Go to Home Page\"])[2]")).getAttribute("href"));
		System.out.println(driver.findElement(By.linkText("How many links are available in this page?")).getSize());
		driver.close();
		}
       }
