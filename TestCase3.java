package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestCase3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./src/main/java/chromedriver_win32/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();		
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();	
	driver.findElement(By.className("inputLogin")).sendKeys("DemoCSR");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.partialLinkText("CRM/SFA")).click();	
	driver.findElement(By.partialLinkText("Leads")).click();
	//Create Lead
	Thread.sleep(2000);
	driver.findElement(By.partialLinkText("Create Lead")).click();
	Thread.sleep(2000);
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jagan");
	Thread.sleep(2000);
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Shanmugan");
	Thread.sleep(2000);
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Accenture");
	Thread.sleep(2000);
	
	//Dropdown for source
	WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
	//create object
	Select dd1 = new Select(source);
	// select option by visible text
	dd1.selectByVisibleText("Partner");
	Thread.sleep(2000);

	//dd for marketingCampaign
		WebElement marketingCampaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		//create object
		Select dd2 = new Select(marketingCampaign);
		// select option by visible text for Automobile
		dd2.selectByVisibleText("Automobile");
		Thread.sleep(2000);
		//createLeadForm_firstNameLocal
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Jaga");
		//createLeadForm_description
		driver.findElement(By.id("createLeadForm_description")).sendKeys("This is sample Test");
	
	//Contact information
		//createLeadForm_primaryPhoneAreaCode
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("38017");
		Thread.sleep(2000);
		//createLeadForm_primaryEmail
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("jagansound@yahoo.co.in");
		Thread.sleep(2000);
	//Primary information
		//createLeadForm_generalToName
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("jagansound");
		Thread.sleep(2000);
		//smallSubmit
		driver.findElement(By.className("smallSubmit")).click();	
}
}