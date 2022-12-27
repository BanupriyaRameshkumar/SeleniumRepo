package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps");

		WebElement eleUser = driver.findElement(By.xpath("//input[@id='username']"));
		eleUser.sendKeys("Demosalesmanager");

		WebElement elePassword = driver.findElement(By.xpath("//input[@id='password']"));
		elePassword.sendKeys("crmsfa");
		WebElement eleLogin = driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
		eleLogin.click();
		WebElement eleCRMLink = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]"));
		eleCRMLink.click();
		WebElement eleLeads= driver.findElement(By.xpath("//a[contains(text(),'Leads')]"));
		eleLeads.click();
		WebElement eleCreateLead = driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]"));
		eleCreateLead.click();



	}

}
