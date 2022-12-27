package week2.day1;


import org.openqa.selenium.edge.EdgeDriver;

public class LeaftapsEdge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EdgeDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
	
	}

}
