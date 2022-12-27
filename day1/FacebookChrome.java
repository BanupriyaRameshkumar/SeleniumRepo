package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.close();
		
	}

	}


