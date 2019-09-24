package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityProfile {
	
	public static final String ARROW_XPATH = "//img[@id='tr_avatar']";
	public static final String PROFILE_XPATH = "//a[contains(text(),'Profile')]";
	public static final String SETTINGS_XPATH = "//div[@class='userm userm-mainPage']//a[contains(text(),'Settings')]";
	public static final String AVAILABILITY_XPATH = "//div[@class='userm userm-mainPage']//a[contains(text(),'Availability')]";
	public static final String SIGNOUT_XPATH = "//a[contains(text(),'Sign Out')]";
	public static final String VERSION_XPATH = "//b[contains(text(),'9.5.5')]";
	
	public static WebElement getArrow(WebDriver driver) {
		return driver.findElement(By.xpath(ARROW_XPATH));
	}
	public static void clickArrow(WebDriver driver) {
		getArrow(driver).click();
	}
	
	public static WebElement getProfile(WebDriver driver) {
		return driver.findElement(By.xpath(PROFILE_XPATH));
	}
	public static void clickProfile(WebDriver driver) {
		getProfile(driver).click();
	}
	public static WebElement getSettings(WebDriver driver) {
		return driver.findElement(By.xpath(SETTINGS_XPATH));
	}
	public static void clickSettings(WebDriver driver) {
		getSettings(driver).click();
	}
	public static WebElement getAvailability(WebDriver driver) {
		return driver.findElement(By.xpath(AVAILABILITY_XPATH));
	}
	public static void clickAvailability(WebDriver driver) {
		getAvailability(driver).click();
	}
	public static WebElement getSignout(WebDriver driver) {
		return driver.findElement(By.xpath(SIGNOUT_XPATH));
	}
	public static void clickSignout(WebDriver driver) {
		getSignout(driver).click();
	}
	public static WebElement getVersion(WebDriver driver) {
		return driver.findElement(By.xpath(VERSION_XPATH));
	}

}
