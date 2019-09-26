package rs.itbootcamp.humanity.page.tests;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.objects.HumanityStaff;



public class HumanityAddNewEmployee {
	@Test
	public static void AddNewEmployeeTest(WebDriver driver) {
		
		
		
		
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
			
			HumanityMenu.clickStaff(driver);
			HumanityStaff.clickAddEmployees(driver);
			HumanityStaff.InputFirstName(driver, "Borivoje");
			HumanityStaff.InputLastName(driver, "Petrovic");
			HumanityStaff.InputEmail(driver, "asdqwe@email.com");
			HumanityStaff.clickSaveEmployee(driver);
			
			WebElement radnik = driver.findElement(By.xpath("//a[contains(text(),'" + "Borivoje Petrovic" + "')]"));
			Assert.assertEquals(radnik.getSize(), "No Employees");
		}catch(AssertionError error) {
			Assert.fail();
			System.out.println(error.getMessage());
			
			
		}finally {
			driver.quit();
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//public static final String URLTEST_ADDEMPLOYEE = "https://humanet.humanity.com/app/staff/assignstaff&new=1&first=5096524/";

	
	//public static boolean testAddEmployee (WebDriver driver) {
		//String url = driver.getCurrentUrl();
		//if(url.equals(URLTEST_ADDEMPLOYEE)) {
			//System.out.println("Employee is added");
			//return true;
		//}else {
			//System.out.println("Employee is not added");
			//return false;
		//}
	//}
	
	
}
