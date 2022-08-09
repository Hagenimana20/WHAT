package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import junit.framework.Assert;

public class LoginPage {
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	WebDriver driver;
	@FindBy(how = How.XPATH, using = "//input[@id='username']")
	WebElement USERNAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement PASSWORD_ELEMENT;
	@FindBy(how = How.XPATH, using = "//button[@name='login']")
	WebElement LOGIN_BUTTON_ELEMENT;
	@FindBy(how = How.XPATH, using = "//h2[contains(text(),' Dashboard ')]")
	WebElement DASHBOARD_ELEMENT;

	public void userEnterUsername(String username) {
		USERNAME_ELEMENT.sendKeys(username);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void userEnterPassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void userClickOnLoginButton() {
		LOGIN_BUTTON_ELEMENT.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void userShouldLandOnDashboardPage(String dashboard) {
		Assert.assertEquals("WRONG PAGE", dashboard, DASHBOARD_ELEMENT.getText());		
	}
	
}
