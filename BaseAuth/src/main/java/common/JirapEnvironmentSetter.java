package common;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class JirapEnvironmentSetter {
	public static WebDriver driver;

	@BeforeTest(alwaysRun = true)
	@Parameters({ "browser" })
	public void environmentSetter(String browser) {
		System.out.println("Driver Setting");
		if (browser.equals("firefox")) {
			driver = new FirefoxDriver();
		} else if (browser.equals("chrome")) {
			driver = new ChromeDriver();
		} else if (browser.equals("iexplorer")) {
			driver = new InternetExplorerDriver();
		}
	}

	@AfterTest(alwaysRun = true)
	public void shutdown() {
		driver.close();
	}
}
