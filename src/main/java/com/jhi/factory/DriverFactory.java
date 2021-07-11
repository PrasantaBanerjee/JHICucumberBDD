package com.jhi.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.jhi.utils.PropertyFileReader;

public class DriverFactory {

	private static WebDriver driver;
	private static PropertyFileReader config = new PropertyFileReader();

	public static WebDriver init(String browser) {
		if (browser.equalsIgnoreCase("Chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\src\\main\\resources\\drivers\\chromedriver.exe");
			ChromeOptions opt = new ChromeOptions();
			if (config.getProperty("Headless").equalsIgnoreCase("true")) {
				opt.addArguments("--headless");
				System.out.println("Browser will be running in Headless mode.");
			}
			driver = new ChromeDriver(opt);
			System.out.println(browser + " Browser launched.");
		} else if (browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
			System.out.println(browser + " Browser launched.");
		} else if (browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
			System.out.println(browser + " Browser launched.");
		} else {
			System.err.println("No setup has been done for browser- " + browser);
		}
		return driver;
	}

	public static WebDriver getDriver() {
		if (driver == null) {
			return driver;
		} else {
			return driver;
		}
	}
}
