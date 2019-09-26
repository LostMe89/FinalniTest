package rs.itbootcamp.humanity.page.tests;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;

import rs.itbootcamp.humanity.page.objects.HumanityHome;
import rs.itbootcamp.humanity.page.utility.ExcelUtils;
public class LogInTestExcell {
	@Test
	public static boolean testLogInExcell(WebDriver driver) {
		
		String DATA_SOURCE ="Data.xls";
		
		
		
		HumanityHome.clickLogIn(driver);
		if(driver.getCurrentUrl().contains(HumanityHome.LOG_IN_URL) == false) {
			return false;
		}
		
		ExcelUtils.setExcell(DATA_SOURCE);
		ExcelUtils.setWorkSheet(0);
		
		
		String username, password;
		username = ExcelUtils.getDataAt(1,0);
		password = ExcelUtils.getDataAt(1, 1);
		
		HumanityHome.InputEmailInLogIn(driver, username);
		HumanityHome.InputPasswordInLogIn(driver, password);
		
		HumanityHome.clickLogInButton(driver);
		
		
		return true;
		
	}
	
	

}
