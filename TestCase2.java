package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase2 {
	
	// Find Contacts
	
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
		//Find Contacts
		driver.findElement(By.partialLinkText("Find Contacts")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Email")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("emailAddress")).sendKeys("babu@testleaf.com");
		Thread.sleep(2000);
		//Find Contacts
		driver.findElement(By.className("x-btn-text")).click();
//		String emailid = "babu@testleaf.com";
//		if(emailid.equals("babu@testleaf.com")){
//			System.out.println("The emailid:babu@testleaf.com is in the Find Contacts page");
//		}
//		else {
//				System.out.println("The emailid:babu@testleaf.com is not in the Contacts page\"");
//			}
		}
	}


