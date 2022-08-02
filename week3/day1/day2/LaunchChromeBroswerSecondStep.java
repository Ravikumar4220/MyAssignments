package week3.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchChromeBroswerSecondStep {
	
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
		WebElement dropDown1 = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropdown1=new Select(dropDown1);
		dropdown1.selectByVisibleText("Employee");
		WebElement dropDown2 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select dropdown2=new Select(dropDown2);
		dropdown2.selectByValue("CATRQ_AUTOMOBILE");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ravi");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Kumar");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Good Morning to all");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("AutoMobileImportance");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("AutoMobile");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("5Lakhs/Annum");
		WebElement dropDown3 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dropdown3=new Select(dropDown3);
		dropdown3.selectByIndex(2);
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("85");
		WebElement dropDown4 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dropdown4=new Select(dropDown4);
		dropdown4.selectByVisibleText("Public Corporation");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("366201");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("Auto");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("AutoMobile gave more personal freedom and access to jobs and services");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Enabled People to travel and relocate more reasily");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("621212");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("7373448254");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("910-805-9864");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Ravikumar");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ravimani10599@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Sridhar");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Ravikumar Sridhar");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Perungudi");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Thoraipakkam");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
		WebElement dropDown5 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select dropdown5=new Select(dropDown5);
		dropdown5.selectByVisibleText("Indiana");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600096");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("0096");
		//click the create lead button
		driver.findElement(By.className("smallSubmit")).click();
		//get title in current page
		String title="View Lead | opentaps CRM";
		//get another string
		String title2 = driver.getTitle();
		System.out.println(title2);
		//check both strings
		if (title.equals(title2)) {
		System.out.println("CreateLead created successfully");
		}
		else {
		System.out.println("CreateLead not created successfully");
		}
		}
		}

