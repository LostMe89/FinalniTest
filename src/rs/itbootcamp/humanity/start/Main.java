package rs.itbootcamp.humanity.start;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityEditStaff;
import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanityProfile;
import rs.itbootcamp.humanity.page.objects.HumanityStaff;

public class Main {
	
	public static final String URL = "http://www.humanity.com";
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get(URL);
		
	HumanityHome.clickLogIn(driver);
	HumanityHome.InputEmailInLogIn(driver,"lesovidi@temp-link.net" );
	HumanityHome.InputPasswordInLogIn(driver, "qweasdzxc");
	HumanityHome.clickLogInButton(driver);
	HumanityMenu.clickStaff(driver);
	HumanityStaff.clickAddEmployees(driver);
	HumanityStaff.clickFirstName(driver);
	HumanityStaff.InputFirstName(driver, "Natali");
	HumanityStaff.clickLastName(driver);
	HumanityStaff.InputLastName(driver, "Imbrulja");
	HumanityStaff.clickEmail(driver);
	HumanityStaff.InputEmail(driver, "testtest@hotmail.com");
	HumanityStaff.clickSaveEmployee(driver);
	
	HumanityProfile.clickArrow(driver);
	HumanityProfile.clickSettings(driver);
	HumanityEditStaff.imageUpload(driver);
	}

}
