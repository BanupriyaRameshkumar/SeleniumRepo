package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextCreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps");
		
		WebElement eleUser = driver.findElement(By.xpath("//input[@id='username']"));
		eleUser.sendKeys("DemoCsr");
		
		WebElement elePassword = driver.findElement(By.id("password"));
		elePassword.sendKeys("crmsfa");
		
		WebElement eleLogin =driver.findElement(By.className("decorativeSubmit"));
		eleLogin.click();
		driver.manage().window().maximize();
		WebElement eleLeads = driver.findElement(By.linkText("CRM/SFA"));
		eleLeads.click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		
		
		
	
	}

}
