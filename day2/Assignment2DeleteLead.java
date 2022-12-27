package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2DeleteLead {

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
		
		WebElement elePhone = driver.findElement(By.xpath("//span[contains(text(),'Phone')]"));
		elePhone.click();
		
		
		WebElement elePhoneNum = driver.findElement(By.xpath("//input[@name='phoneNumber']"));
		elePhoneNum.sendKeys("9487772208");
		
		WebElement eleLeads = driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]"));
		eleLeads.click();
		
		
		Thread.sleep(2000);
		
		String store=driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).getText();
		System.out.println(store);
		
		
		
		WebElement eleLinkText = driver.findElement(By.xpath("(//a[@class='linktext'])[4]"));
		eleLinkText.click();
		
		
		WebElement eleDelete = driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']"));
		eleDelete.click();
		
		WebElement eleFindLeads1 = driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]"));
		eleFindLeads1.click();
		
		WebElement eleLeadId = driver.findElement(By.xpath("//input[@name='id']"));
		eleLeadId.sendKeys(store);
		
		
		
		
		WebElement eleLeads1 = driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]"));
		eleLeads1.click();
		
		Thread.sleep(2000);
		
		WebElement text = driver.findElement(By.xpath("//div[text()='No records to display']"));
		String message = text.getText();
		String message1 = "No records to display";
		if(message.contains(message1))
		{
			System.out.println("Lead successfully deleted");
		}
		else
		{
			System.out.println("Lead not deleted");
		}
		
driver.close();

		}

}



