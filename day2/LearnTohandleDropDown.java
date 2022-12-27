package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnTohandleDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("http://leaftaps.com/opentaps");
		
		WebElement eleUser = driver.findElement(By.id("username"));
		eleUser.sendKeys("DemoCsr");
		
		WebElement elePassword = driver.findElement(By.id("password"));
		elePassword.sendKeys("crmsfa");
		
		WebElement eleLogin =driver.findElement(By.className("decorativeSubmit"));
		eleLogin.click();
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		WebElement elesource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select dropDown1=new Select(elesource);
		dropDown1.selectByVisibleText("Conference");

		WebElement eleIndustry = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dropDown2=new Select(eleIndustry);
		dropDown2.selectByVisibleText("Finance");
		
		WebElement eleOwnership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select dropDown3=new Select(eleOwnership);
		dropDown3.selectByIndex(5);
		
		
		
		
		
	}

}
