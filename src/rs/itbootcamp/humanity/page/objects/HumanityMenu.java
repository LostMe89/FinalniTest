package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityMenu {
	public static final String DASHBOARD_XPATH = "//p[contains(text(),'Dashboard')]";
	public static final String SHIFTPLANING_XPATH = "//a[@id='sn_schedule']//span[@class='primNavQtip__inner']";
	public static final String TIMECLOCK_XPATH = "//a[@id='sn_timeclock']//span[@class='primNavQtip__inner']";
	public static final String LEAVE_XPATH = "//a[@id='sn_requests']//span[@class='primNavQtip__inner']";
	public static final String TRAINING_XPATH = "//i[@class='primNavQtip__icon icon-education']";
	public static final String STAFF_XPATH = "//a[@id='sn_staff']//span[@class='primNavQtip__inner']";
	public static final String PAYROLL_XPATH = "//a[@id='sn_payroll']//span[@class='primNavQtip__inner']";
	public static final String REPORTS_XPATH = "//a[@id='sn_reports']//span[@class='primNavQtip__inner']";

	
	//Dashboard
	public static WebElement getDashboard(WebDriver driver) {
		return driver.findElement(By.xpath(DASHBOARD_XPATH));
		
	}
	public static void clickDashboard(WebDriver driver) {
		getDashboard(driver).click();
	}
	//ShiftPlaning
	public static WebElement getShiftPlaning(WebDriver driver) {
		return driver.findElement(By.xpath(SHIFTPLANING_XPATH));
		
	}
	public static void clickShinftPlaning(WebDriver driver) {
		getShiftPlaning(driver).click();
	}
	//TimeClock
	public static WebElement getTimeClock(WebDriver driver) {
		return driver.findElement(By.xpath(TIMECLOCK_XPATH));
		
	}
	public static void clickTimeClock(WebDriver driver) {
		getTimeClock(driver).click();
	}
	//Leave
	public static WebElement getLeave(WebDriver driver) {
		return driver.findElement(By.xpath(LEAVE_XPATH));
		
	}
	public static void clickLeave(WebDriver driver) {
		getLeave(driver).click();
	}
	//Training
	public static WebElement getTraining(WebDriver driver) {
		return driver.findElement(By.xpath(TRAINING_XPATH));
		
	}
	public static void clicktraining(WebDriver driver) {
		getTraining(driver).click();
	}
	//Staff
	public static WebElement getStaff(WebDriver driver) {
		return driver.findElement(By.xpath(STAFF_XPATH));
		
	}
	public static void clickStaff(WebDriver driver) {
		getStaff(driver).click();
	}
	//PayRoll
	public static WebElement getPayRoll(WebDriver driver) {
		return driver.findElement(By.xpath(PAYROLL_XPATH));
		
	}
	public static void clickPayRoll(WebDriver driver) {
		getPayRoll(driver).click();
	}
	//Reports
	public static WebElement getReports(WebDriver driver) {
		return driver.findElement(By.xpath(REPORTS_XPATH));
		
	}
	public static void clickReports(WebDriver driver) {
		getDashboard(driver).click();
	}
	
}
