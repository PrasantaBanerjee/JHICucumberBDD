package com.jhi.utils;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonFunctions {

	public void sleepWait(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public String openLinkInNewTabAndSwitch(WebDriver driver, WebElement link, String linkUrl) {
		sleepWait(3000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView(true);", link);
		sleepWait(3000);

		String newTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
		link.sendKeys(newTab);
		System.out.println("Opening link in tab.");

		ArrayList<String> alltabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(alltabs.get(1));
		System.out.println("Switched to new tab.");
		linkUrl = driver.getCurrentUrl();
		return linkUrl;
	}
	
	public void validateSocialMediaLink(WebDriver driver, String expectedLink, String actualLink) {
		System.out.println("Expected: "+expectedLink);
		System.out.println("Actual: "+actualLink);
		org.junit.Assert.assertEquals(expectedLink, actualLink);
		driver.close();
		System.out.println("Closed new tab.");

		ArrayList<String> alltabs = new ArrayList<>(driver.getWindowHandles());
		driver.switchTo().window(alltabs.get(0));
		System.out.println("Switched back to parent tab.");
		sleepWait(3000);
	}
}
