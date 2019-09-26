package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import rs.itbootcamp.humanity.page.objects.HumanityHome;

public class HumanityLogInTest {
	


	@Test
	public static void LogInTest(WebDriver driver) {
		
		
		
		
		try {
			driver.get(HumanityHome.URL);
			driver.manage().window().fullscreen();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			HumanityHome.clickLogIn(driver);
			HumanityHome.clickEmailInLogIn(driver);
			HumanityHome.InputEmailInLogIn(driver, "lesovidi@temp-link.net");
			HumanityHome.clickPasswordInLogIn(driver);
			HumanityHome.InputPasswordInLogIn(driver, "qweasdzxc" );
			HumanityHome.clickLogInButton(driver);
			
			System.out.println(driver.getCurrentUrl());
			Assert.assertEquals(driver.getCurrentUrl(), "https://humanet.humanity.com/app/dashboard/");
			
			
	}catch(AssertionError error){
		Assert.fail();
		System.out.println(error.getMessage());
	}
		
	}
}
	
	
	
	
	
	
	//public static final String URLTEST_LOGIN= "https://humanet.humanity.com/app/dashboard/";

	//public static boolean testLogIn(WebDriver driver) {
	//	String url = driver.getCurrentUrl();
	//	if(url.equals(URLTEST_LOGIN)) {
	//		System.out.println("User is Loged In");
			
	//		return true;
	//	}else {
	//		System.out.println("User is not Loged In");
	//	}
	//	
	//	return false;
	//}
	

