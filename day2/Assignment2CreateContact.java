package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps");

		WebElement eleUser = driver.findElement(By.xpath("//input[@id='username']"));
		eleUser.sendKeys("DemoCsr");

		WebElement elePassword = driver.findElement(By.xpath("//input[@id='password']"));
		elePassword.sendKeys("crmsfa");

		WebElement eleLogin = driver.findElement(By.xpath("//input[@class='decorativeSubmit']"));
		eleLogin.click();

		WebElement eleCRMLink = driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]"));
		eleCRMLink.click();

		WebElement eleContacts = driver.findElement(By.xpath("//a[contains(text(),'Contacts')]"));
		eleContacts.click();

		WebElement eleCreateContacts = driver.findElement(By.xpath("//a[contains(text(),'Create Contact')]"));
		eleCreateContacts.click();
		
		WebElement eleForeName = driver.findElement(By.xpath("//input[@id='firstNameField']"));
		eleForeName.sendKeys("Priya");
		
		WebElement eleSurName = driver.findElement(By.xpath("//input[@id='lastNameField']"));
		eleSurName.sendKeys("Banu");
		
		
		WebElement eleFirstName = driver.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']"));
		eleFirstName.sendKeys("Banu");

		WebElement eleLastName = driver.findElement(By.xpath("//input[@id='createContactForm_lastNameLocal']"));
		eleLastName.sendKeys("Priya");

		WebElement eleDepartment = driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']"));
		eleDepartment.sendKeys("ECE");

		WebElement eleDescription = driver.findElement(By.xpath("//textarea[@name='description']"));
		eleDescription.sendKeys("Nothing");


		WebElement eleEmail = driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']"));
		eleEmail.sendKeys("banukbe@gmail.com");
		
		
		WebElement eleState = driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']"));
		Select dropDown1=new Select(eleState);
		dropDown1.selectByVisibleText("New York");
		
		WebElement elesButton = driver.findElement(By.xpath("//input[@name='submitButton']"));
		elesButton.click();
		
		WebElement eleEdit = driver.findElement(By.xpath("//a[contains(text(),'Edit')]"));
		eleEdit.click();
		
		WebElement eleNothing = driver.findElement(By.xpath("//textarea[contains(text(),'Nothing')]"));
		eleNothing.clear();
		
		WebElement eleImportant = driver.findElement(By.xpath("//textarea[@id='updateContactForm_importantNote']"));
		eleImportant.sendKeys("Not Working");
		
		WebElement eleUpdate = driver.findElement(By.xpath("//input[@value='Update']"));
		eleUpdate.click();
		
		
		String title=driver.getTitle();
		System.out.println(title);
		
		
	}
	
	
}

