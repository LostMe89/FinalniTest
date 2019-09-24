package rs.itbootcamp.humanity.page.tests;

import org.openqa.selenium.WebDriver;

public class HumanityAddNewEmployee {
	
	public static final String URLTEST_ADDEMPLOYEE = "https://humanet.humanity.com/app/staff/assignstaff&new=1&first=5096524/";

	
	public static boolean testAddEmployee (WebDriver driver) {
		String url = driver.getCurrentUrl();
		if(url.equals(URLTEST_ADDEMPLOYEE)) {
			System.out.println("Employee is added");
			return true;
		}else {
			System.out.println("Employee is not added");
			return false;
		}
	}
	
	
}
