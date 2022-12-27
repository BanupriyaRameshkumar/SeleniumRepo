package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3Acme {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(2000);
		
driver.get("https://acme-test.uipath.com/login");

WebElement eleEmail = driver.findElement(By.xpath("//input[@id='email']"));
eleEmail.sendKeys("kumar.testleaf@gmail.com");

WebElement elePassword = driver.findElement(By.xpath("//input[@id='password']"));
elePassword.sendKeys("leaf@12");

WebElement eleSubmit = driver.findElement(By.xpath("//button[@type='submit']"));
eleSubmit.click();

System.out.println("The title is:"+ driver.getTitle());
String title = driver.getTitle();
WebElement eleLogOut = driver.findElement(By.xpath("//a[text()='Log Out']"));
eleLogOut.click();
driver.close();






//String title1 = "ACME1 System";

//if(title.contains(title1))
{
//System.out.println("Title is verified");

}
//else
	//System.out.println("Title is not verified");

	}

}
