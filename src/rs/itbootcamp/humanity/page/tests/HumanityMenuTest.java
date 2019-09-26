package rs.itbootcamp.humanity.page.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanitySettings;

public class HumanityMenuTest {
	@Test
	public static void settingsTest(WebDriver driver) {
		
		
		
		
		try {
			driver.get(HumanityHome.URL);
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			HumanityHome.clickLogIn(driver);
			HumanityHome.clickEmailInLogIn(driver);
			HumanityHome.InputEmailInLogIn(driver, "lesovidi@temp-link.net");
			HumanityHome.clickPasswordInLogIn(driver);
			HumanityHome.InputPasswordInLogIn(driver, "qweasdzxc" );
			HumanityHome.clickLogInButton(driver);
			
			HumanityMenu.clickSettings(driver);
			HumanitySettings.inputCountry(driver, "Serbia");
			HumanitySettings.inputDefaultLanguage(driver, "Serbian (machine)");
			HumanitySettings.inputTimeFormat(driver, "24 hour");
			String s = HumanitySettings.getCountry(driver).getFirstSelectedOption().getText();
			SoftAssert sa = new SoftAssert();
			sa.assertEquals (s, "Serbia");
			
			
			
			
		}catch(AssertionError error){
			Assert.fail();
			System.out.println(error.getMessage());
		}
	}
	

}
