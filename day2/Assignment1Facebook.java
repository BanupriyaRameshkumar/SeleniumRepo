package week2.day2;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(2000);
		
driver.get(" https://en-gb.facebook.com/");
WebElement eleOpenRegis = driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
eleOpenRegis.click();

WebElement eleFirstname = driver.findElement(By.xpath("//input[@aria-label='First name']"));
eleFirstname.sendKeys("Banu");

WebElement eleSurname = driver.findElement(By.xpath("//input[@aria-label='Surname']"));
eleSurname.sendKeys("Priya");

driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("9487772208");

driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("Banu@123");

WebElement eleDay = driver.findElement(By.xpath("//select[@id='day']"));
Select dropDown1=new Select(eleDay);
dropDown1.selectByValue("27");


WebElement eleMonth = driver.findElement(By.xpath("//select[@id='month']"));
Select dropDown2=new Select(eleMonth);
dropDown2.selectByVisibleText("Sep");


WebElement eleyear = driver.findElement(By.xpath("//select[@id='year']"));
Select dropDown3=new Select(eleyear);
dropDown3.selectByValue("2022");

WebElement eleSex = driver.findElement(By.xpath("//label[text()='Female']"));
eleSex.click();






	}

	
	}


