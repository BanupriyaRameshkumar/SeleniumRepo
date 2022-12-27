package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");

		WebElement eleUser = driver.findElement(By.xpath("//input[@id='username']"));
		eleUser.sendKeys("DemoCsr");

		WebElement elePassword = driver.findElement(By.xpath("//input[@id='password']"));
		elePassword.sendKeys("crmsfa");

		WebElement eleLogin = driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
		eleLogin.click();

		WebElement eleCRMLink = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]"));
		eleCRMLink.click();

		driver.findElement(By.linkText("Leads")).click();

		WebElement eleFindLeads = driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]"));
		eleFindLeads.click();
		
		WebElement eleEmailActive = driver.findElement(By.xpath("//span[contains(text(),'Email')]"));
		eleEmailActive.click();

		WebElement eleEmailAddress = driver.findElement(By.xpath("(//input[@type='text'])[28]"));
		eleEmailAddress.sendKeys("banukbe@gmail.com");
		
		WebElement eleEmailActive1 = driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]"));
		eleEmailActive1.click();
		
		Thread.sleep(2000);
		
		
		WebElement eleLeadId = driver.findElement(By.xpath("(//a[@class='linktext'])[6]"));
		String leadId= eleLeadId.getText();
		
		
		System.out.println(leadId);
		
		driver.findElement(By.xpath("(//a[@class='linktext'])[6]")).click();
		
		WebElement eleDuplicate = driver.findElement(By.xpath("//a[contains(text(),'Duplicate Lead')]"));
		eleDuplicate.click();
		
		String title=driver.getTitle();
		String title1="Duplicate Lead";
if (title.contains(title1))
	System.out.println("Displayed is valid");
else
	System.out.println("Displayed is not valid");

 driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();

WebElement eleName = driver.findElement(By.id("viewLead_firstName_sp"));
String name1=eleName.getText();
if(leadId.contains(name1))
	
		
System.out.println("Name is duplicate");
else
	System.out.println("Name is not duplicate");
driver.close();



		
			}

}