package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HumanitySettings {
	
	public static final String COUNTRY_XPATH = "//select[@id='country']";
	public static final String DEFAULTLANGUAGE_XPATH = "//td[@class='nowrap']//select[@name='language']";
	public static final String TIMEFORMAT_XPATH = "//select[@name='pref_24hr']";
	public static final String SAVESETTINGS_XPATH = "//button[@id='_save_settings_button']";
	
	//Country select
	
	public static Select getCountry(WebDriver driver) {
		return new Select (driver.findElement(By.xpath(COUNTRY_XPATH)) );
	}
	public static void inputCountry(WebDriver driver, String data) {
		getCountry(driver).selectByVisibleText(data);
	}
	
	//Default language
	public static Select getDefaultLanguage(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(DEFAULTLANGUAGE_XPATH)));
	}
	public static void inputDefaultLanguage(WebDriver driver, String data) {
		getDefaultLanguage(driver).selectByVisibleText(data);
	}
	
	//Time Format
	public static Select getTimeFormat(WebDriver driver) {
		return new Select(driver.findElement(By.xpath(TIMEFORMAT_XPATH)));
	}
	public static void inputTimeFormat(WebDriver driver, String data) {
		getTimeFormat(driver).selectByVisibleText(data);
	}
	
	//Save Settings
	public static WebElement getSaveSettings(WebDriver driver) {
		return driver.findElement(By.xpath(SAVESETTINGS_XPATH));
		
	}
	public static void clickSaveSettings(WebDriver driver) {
		getSaveSettings(driver).click();
	}
	
}
