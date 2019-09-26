package rs.itbootcamp.humanity.page.tests;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.Test;

import rs.itbootcamp.humanity.page.objects.HumanityMenu;
import rs.itbootcamp.humanity.page.utility.ExcelUtils;
import rs.itbootcamp.humanity.page.objects.HumanityStaff;;

public class AddnewEmployeeExcell {
	@Test
	public static boolean addNewEmployeeExcellTest(WebDriver driver) throws InterruptedException {

		String DATA_SOURCE = "Data.xls";

		HumanityMenu.clickStaff(driver);

		HumanityStaff.clickAddEmployees(driver);

		ExcelUtils.setExcell(DATA_SOURCE);
		ExcelUtils.setWorkSheet(1);

		String name, lastname, email;
		name = ExcelUtils.getDataAt(1, 0);
		lastname = ExcelUtils.getDataAt(1, 1);
		email = ExcelUtils.getDataAt(1, 2);

		HumanityStaff.InputFirstName(driver, name);
		HumanityStaff.InputLastName(driver, lastname);
		HumanityStaff.InputEmail(driver, email);
		HumanityStaff.clickSaveEmployee(driver);
		
		Thread.sleep(3000);
		
		HumanityStaff.clickAddEmployees(driver);

		name = ExcelUtils.getDataAt(2, 0);
		lastname = ExcelUtils.getDataAt(2, 1);
		email = ExcelUtils.getDataAt(2, 2);

		HumanityStaff.InputFirstName(driver, name);

		HumanityStaff.InputLastName(driver, lastname);

		HumanityStaff.InputEmail(driver, email);

		HumanityStaff.clickSaveEmployee(driver);
		
		Thread.sleep(3000);
		
		HumanityStaff.clickAddEmployees(driver);

		name = ExcelUtils.getDataAt(3, 0);
		lastname = ExcelUtils.getDataAt(3, 1);
		email = ExcelUtils.getDataAt(3, 2);

		HumanityStaff.InputFirstName(driver, name);

		HumanityStaff.InputLastName(driver, lastname);

		HumanityStaff.InputEmail(driver, email);

		HumanityStaff.clickSaveEmployee(driver);

		Thread.sleep(3000);
		
		HumanityStaff.clickAddEmployees(driver);

		name = ExcelUtils.getDataAt(4, 0);
		lastname = ExcelUtils.getDataAt(4, 1);
		email = ExcelUtils.getDataAt(4, 2);

		HumanityStaff.InputFirstName(driver, name);

		HumanityStaff.InputLastName(driver, lastname);

		HumanityStaff.InputEmail(driver, email);

		HumanityStaff.clickSaveEmployee(driver);
		
		
		Thread.sleep(3000);
		
		HumanityStaff.clickAddEmployees(driver);

		name = ExcelUtils.getDataAt(5, 0);
		lastname = ExcelUtils.getDataAt(5, 1);
		email = ExcelUtils.getDataAt(5, 2);

		HumanityStaff.InputFirstName(driver, name);

		HumanityStaff.InputLastName(driver, lastname);

		HumanityStaff.InputEmail(driver, email);

		HumanityStaff.clickSaveEmployee(driver);
		
		Thread.sleep(3000);
		
		HumanityStaff.clickAddEmployees(driver);

		name = ExcelUtils.getDataAt(6, 0);
		lastname = ExcelUtils.getDataAt(6, 1);
		email = ExcelUtils.getDataAt(6, 2);

		HumanityStaff.InputFirstName(driver, name);

		HumanityStaff.InputLastName(driver, lastname);

		HumanityStaff.InputEmail(driver, email);

		HumanityStaff.clickSaveEmployee(driver);
		
		Thread.sleep(3000);
		
		HumanityStaff.clickAddEmployees(driver);

		name = ExcelUtils.getDataAt(7, 0);
		lastname = ExcelUtils.getDataAt(7, 1);
		email = ExcelUtils.getDataAt(7, 2);

		HumanityStaff.InputFirstName(driver, name);

		HumanityStaff.InputLastName(driver, lastname);

		HumanityStaff.InputEmail(driver, email);

		HumanityStaff.clickSaveEmployee(driver);

			
		Thread.sleep(3000);
		
		HumanityStaff.clickAddEmployees(driver);

		name = ExcelUtils.getDataAt(8, 0);
		lastname = ExcelUtils.getDataAt(8, 1);
		email = ExcelUtils.getDataAt(8, 2);

		HumanityStaff.InputFirstName(driver, name);

		HumanityStaff.InputLastName(driver, lastname);

		HumanityStaff.InputEmail(driver, email);

		HumanityStaff.clickSaveEmployee(driver);


		HumanityMenu.clickStaff(driver);

		return true;

	}

}
