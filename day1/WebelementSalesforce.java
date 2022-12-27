package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementSalesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ChromeDriver driver =new ChromeDriver();
driver.get("https://login.salesforce.com/");

WebElement eleUsername =driver.findElement(By.id("username"));
eleUsername.sendKeys("hari.radhakrishnan@qeagle.com");

WebElement elePassword=driver.findElement(By.id("password"));
elePassword.sendKeys("Testleaf$321");

WebElement eleLogIn= driver.findElement(By.id("Login"));
eleLogIn.click();

	}

}
