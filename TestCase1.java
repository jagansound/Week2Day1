package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {
	
	// Create Contacts
	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./src/main/java/chromedriver_win32/chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();		
			driver.get("http://leaftaps.com/opentaps/");
			driver.manage().window().maximize();	
		driver.findElement(By.className("inputLogin")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();	
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Contacts")).click();
		//Create Contact
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Create Contact")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Create Contact"));
		String label= "Create Contact";
		if(label.equals("Create Contact")){
			System.out.println("This is the Create Contact page");
		}
		else {
				System.out.println("This is not Create Contact page");
			}
		Thread.sleep(2000);
		driver.findElement(By.id("firstNameField")).sendKeys("Jagadish");
		Thread.sleep(2000);
		driver.findElement(By.id("lastNameField")).sendKeys("Shanmuganandu");		
		Thread.sleep(2000);
		//smallSubmit
		driver.findElement(By.className("smallSubmit")).click();
		//
		String firstname = driver.findElement(By.id("viewContact_firstName_sp")).getText();
		System.out.println(firstname);
		
		//driver.close();
		}
	}


