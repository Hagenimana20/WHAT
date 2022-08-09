package testsD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.BrowserFactory;
import pages.DataBasePage;
import pages.LoginPage;

public class TestDefinition extends BrowserFactory {
	WebDriver driver;
	LoginPage loginPage;
	DataBasePage db;

	@Before
	public void object() {
		driver = init();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		db = new DataBasePage();
	}

	@Given("^User launch techfios website$")
	public void user_launch_techfios_website() {
		driver.get("https://techfios.com/billing/?ng=login/");
	}

	@When("^User inserts username\"([^\"]*)\"$")
	public void user_inserts_username(String username) {
		loginPage.userEnterUsername(username);
	}

	@When("^User inserts \"([^\\\"]*)\" from data base$")
	public void user_inserts_from_data_base(String userdata) {		

		if (userdata.equalsIgnoreCase("username")) {
			loginPage.userEnterUsername(db.getDataFromDb("username"));
		System.out.println("username from DB :" + db.getDataFromDb("username"));
		
		} else if (userdata.equalsIgnoreCase("password")) {
			loginPage.userEnterPassword(db.getDataFromDb("password"));
			System.out.println("Password from DB :" + db.getDataFromDb("password"));
		} else {
			System.out.println("data not available");
		}

	}

	@When("^User inserts password\"([^\"]*)\"$")
	public void user_inserts_password(String password) {
		loginPage.userEnterPassword(password);
		takeScreenShoot(driver);
	}

	@When("^User clicks on login button$")
	public void user_clicks_on_login_button() {
		loginPage.userClickOnLoginButton();
	}

	@Then("^User should land on Dashboard Page$")
	public void user_should_land_on_Dashboard_Page() {
		loginPage.userShouldLandOnDashboardPage("Dashboard");
	}

	@After
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
