package week2.day2;

import java.time.Duration;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XpathLearnTohandleDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("http://leaftaps.com/opentaps");

		WebElement eleUser = driver.findElement(By.xpath("//input[@id='username']"));
		eleUser.sendKeys("DemoCsr");

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

		WebElement eleCreateLeadForm = driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']"));	
		Select dropDown1=new Select(eleCreateLeadForm);
		dropDown1.selectByVisibleText("Conference");

		WebElement eleIndustry = driver.findElement(By.xpath("//select[@id='createLeadForm_industryEnumId']"));
		Select dropDown2 = new Select(eleIndustry);
		dropDown2.selectByValue("IND_FINANCE");

		WebElement eleOwnership = driver.findElement(By.xpath("//select[@id='createLeadForm_ownershipEnumId']"));
		Select dropDown3=new Select(eleOwnership);
		dropDown3.selectByIndex(5);

		WebElement eleMarketing = driver.findElement(By.xpath("//select[@id='createLeadForm_marketingCampaignId']"));
		Select dropDown4=new Select(eleMarketing);
		dropDown4.selectByVisibleText("Automobile");
		WebElement StateProvince = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		Select dropDown5=new Select(StateProvince);
		dropDown5.selectByIndex(2);



	}

}
