package rs.itbootcamp.humanity.page.tests;

import org.openqa.selenium.WebDriver;

public class HumanityLogInTest {
	public static final String URLTEST_LOGIN= "https://humanet.humanity.com/app/dashboard/";

	
	public static boolean testLogIn(WebDriver driver) {
		String url = driver.getCurrentUrl();
		if(url.equals(URLTEST_LOGIN)) {
			System.out.println("User is Loged In");
			
			return true;
		}else {
			System.out.println("User is not Loged In");
		}
		
		return false;
	}
	
}
