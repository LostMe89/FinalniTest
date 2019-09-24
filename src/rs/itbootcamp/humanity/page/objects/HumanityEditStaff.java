package rs.itbootcamp.humanity.page.objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HumanityEditStaff {

	public static final String EDITDETAILS_XPATH = "//a[contains(text(),'Edit Details')]";
	public static final String UPLOADPICTURE_XPATH = "//input[@id='fileupload']";
	public static final String NICKNAME_XPATH = "//input[@id='nick_name']";
	public static final String SAVEEMPLOYEE_XPATH = "//button[@id='act_primary']";
	public static final String IMG_PATH = "MACOSX/Users/milos/Downloads/Spark.jpeg";

	// edit profile
	public static WebElement getEditDetails(WebDriver driver) {
		return driver.findElement(By.xpath(EDITDETAILS_XPATH));
	}

	public static void clickEditDetails(WebDriver driver) {
		getEditDetails(driver).click();
	}

	// Upload Picture
	public static WebElement getUploadPicture(WebDriver driver) {
		return driver.findElement(By.xpath(UPLOADPICTURE_XPATH));
	}

	public static void clickUploadPicture(WebDriver driver) {
		getUploadPicture(driver).click();
	}

	public static void imageUpload(WebDriver driver) {
		getUploadPicture(driver).sendKeys(IMG_PATH);
	}

	// NickName
	public static WebElement getNickName(WebDriver driver) {
		return driver.findElement(By.xpath(NICKNAME_XPATH));
	}

	public static void clickNickName(WebDriver driver) {
		getNickName(driver).click();
	}

	public static void inputNickName(WebDriver driver, String data) {
		getNickName(driver).sendKeys(data);
	}
	// Save Employee

	public static WebElement getSaveEmployee(WebDriver driver) {
		return driver.findElement(By.xpath(SAVEEMPLOYEE_XPATH));
	}

	public static void clickSaveEmployees(WebDriver driver) {
		getSaveEmployee(driver).click();
	}

}
