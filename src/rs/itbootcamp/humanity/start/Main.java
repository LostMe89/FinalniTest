package rs.itbootcamp.humanity.start;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import rs.itbootcamp.humanity.page.objects.HumanityEditStaff;
import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanityProfile;
import rs.itbootcamp.humanity.page.objects.HumanityStaff;
import rs.itbootcamp.humanity.page.tests.AddnewEmployeeExcell;
import rs.itbootcamp.humanity.page.tests.LogInTestExcell;

public class Main {
	
	public static final String URL = "http://www.humanity.com";
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "chromedriver");
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.get(URL);
		
		LogInTestExcell.testLogInExcell(driver);
		AddnewEmployeeExcell.addNewEmployeeExcellTest(driver);
}
}