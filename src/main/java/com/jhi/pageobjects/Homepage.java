package com.jhi.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.jhi.factory.DriverFactory;

public class Homepage extends DriverFactory {

	public WebElement twitterPageLink() {
		return getDriver().findElement(By.xpath("//div[text()='@JH_Investments']/ancestor::a"));
	}
	
	public WebElement facebookPageLink() {
		return getDriver().findElement(By.xpath("//div[text()='johnhancockinvestmentmgt']/ancestor::a"));
	}
	
	public WebElement linkedInPageLink() {
		return getDriver().findElement(By.xpath("//div[text()='john-hancock-investment-management']/ancestor::a"));
	}
	
	public WebElement youtubePageLink() {
		return getDriver().findElement(By.xpath("//div[text()='John Hancock Investment Management']/ancestor::a"));
	}
	
	public WebElement nonUSInvestorsLink() {
		return getDriver().findElement(By.xpath("(//a[contains(text(),'Non-U.S. investors')])[1]"));
	}	

	public String getUrl() {
		return getDriver().getCurrentUrl();
	}
	
}
