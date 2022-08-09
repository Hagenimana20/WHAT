package pages;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	WebDriver driver;

	public WebDriver init() {

		System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;

		
	}
	public void takeScreenShoot(WebDriver driver) {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File srcfile= ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcfile, new File(System.getProperty("user.dir")+ "/Screenshot/"+ System.currentTimeMillis()+ ".png"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
