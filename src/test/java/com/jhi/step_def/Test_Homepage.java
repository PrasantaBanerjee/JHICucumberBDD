package com.jhi.step_def;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import com.jhi.pageobjects.Homepage;
import com.jhi.utils.CommonFunctions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Test_Homepage extends Homepage {

	private String twitterLink;
	private String facebookLink;
	private String linkedInLink;
	private String youtubeLink;
	private CommonFunctions cf = new CommonFunctions();
	
	@Given("User is on the homepage")
	public void user_is_on_the_homepage() {
		if(!getUrl().equalsIgnoreCase("https://www.jhinvestments.com/")) {
			getDriver().navigate().to("https://www.jhinvestments.com/");
		}
	}

	@When("User clicks on the Log In button")
	public void user_clicks_on_the_log_in_button() {
		System.out.println("On Login page");
	}

	@When("Enters Valid E-Mail Address and Password")
	public void enters_valid_e_mail_address_and_password() {
		System.out.println("Enter userid and password");
	}

	@When("Clicks on Login button")
	public void clicks_on_login_button() {
		System.out.println("Clicks login btn");
	}

	@Then("User Login should be successful")
	public void user_login_should_be_successful() {
		System.out.println("Login done");
	}

	@When("User clicks on Non-US Investors Link")
	public void user_clicks_on_non_us_investors_link() {
		System.out.println("Clicked Non US");
	}

	@Then("User should be navigated to Manulife Investment Management Link {string}")
	public void user_should_be_navigated_to_manulife_investment_management_link(String string) {
		System.out.println("navigated to " + string);
	}

	@When("User scrolls down to From Twitter section")
	public void user_scrolls_down_to_from_twitter_section() {
		System.out.println("Scrolling down to \"From Twitter\" section.");
	}

	@When("Clicks on the Links")
	public void clicks_on_the_links() {
		System.out.println("Clicked on the tweet link.");
	}

	@Then("User should be navigated to Twitter status page")
	public void user_should_be_navigated_to_twitter_status_page() {
		System.out.println("Navigated to twitter status");
	}

	@When("Clicks on the More Tweets Link on right-side")
	public void clicks_on_the_more_tweets_link_on_right_side() {
		System.out.println("Clicked on the link");
	}	

	@When("Clicks on the Twitter Link")
	public void clicks_on_the_twitter_link() {
		cf.sleepWait(3000);
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].scrollIntoView(true);", twitterPageLink());
		cf.sleepWait(3000);

		String newTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
		twitterPageLink().sendKeys(newTab);
		System.out.println("Clicked on the Twitter page link.");
		System.out.println("Opening link in tab.");

		ArrayList<String> alltabs = new ArrayList<>(getDriver().getWindowHandles());
		getDriver().switchTo().window(alltabs.get(1));
		System.out.println("Switched to new tab.");
		twitterLink = getUrl();
		System.out.println("URL: " + twitterLink);
	}

	@Then("User should be navigated to JHI Twitter page {string}")
	public void user_should_be_navigated_to_jhi_twitter_page(String string) {
		org.junit.Assert.assertEquals(string, twitterLink);
		getDriver().close();
		System.out.println("Closed new tab.");

		ArrayList<String> alltabs = new ArrayList<>(getDriver().getWindowHandles());
		getDriver().switchTo().window(alltabs.get(0));
		System.out.println("Switched back to parent tab.");
		cf.sleepWait(3000);
	}

	@When("Clicks on the Facebook Link")
	public void clicks_on_the_facebook_link() {
		cf.sleepWait(3000);
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].scrollIntoView(true);", facebookPageLink());
		cf.sleepWait(3000);

		String newTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
		facebookPageLink().sendKeys(newTab);
		System.out.println("Clicked on the Facebook page link.");
		System.out.println("Opening link in tab.");

		ArrayList<String> alltabs = new ArrayList<>(getDriver().getWindowHandles());
		getDriver().switchTo().window(alltabs.get(1));
		System.out.println("Switched to new tab.");
		facebookLink = getUrl();
		System.out.println("URL: " + facebookLink);
	}

	@Then("User should be navigated to JHI Facebook page {string}")
	public void user_should_be_navigated_to_jhi_facebook_page(String string) {
		org.junit.Assert.assertEquals(string, facebookLink);
		getDriver().close();
		System.out.println("Closed new tab.");

		ArrayList<String> alltabs = new ArrayList<>(getDriver().getWindowHandles());
		getDriver().switchTo().window(alltabs.get(0));
		System.out.println("Switched back to parent tab.");
		cf.sleepWait(3000);
	}

	@When("Clicks on the LinkedIn Link")
	public void clicks_on_the_linked_in_link() {
		cf.sleepWait(3000);
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].scrollIntoView(true);", linkedInPageLink());
		cf.sleepWait(3000);

		String newTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
		linkedInPageLink().sendKeys(newTab);
		System.out.println("Clicked on the LinkedIn page link.");
		System.out.println("Opening link in tab.");

		ArrayList<String> alltabs = new ArrayList<>(getDriver().getWindowHandles());
		getDriver().switchTo().window(alltabs.get(1));
		System.out.println("Switched to new tab.");
		linkedInLink = getUrl();
		System.out.println("URL: " + linkedInLink);
	}

	@Then("User should be navigated to JHI LinkedIn page {string}")
	public void user_should_be_navigated_to_jhi_linked_in_page(String string) {
		org.junit.Assert.assertEquals(string, linkedInLink);
		getDriver().close();
		System.out.println("Closed new tab.");

		ArrayList<String> alltabs = new ArrayList<>(getDriver().getWindowHandles());
		getDriver().switchTo().window(alltabs.get(0));
		System.out.println("Switched back to parent tab.");
		cf.sleepWait(3000);
	}

	@When("Clicks on the Youtube Link")
	public void clicks_on_the_youtube_link() {
		cf.sleepWait(3000);
		JavascriptExecutor jse = (JavascriptExecutor) getDriver();
		jse.executeScript("arguments[0].scrollIntoView(true);", youtubePageLink());
		cf.sleepWait(3000);

		String newTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
		youtubePageLink().sendKeys(newTab);
		System.out.println("Clicked on the YouTube page link.");
		System.out.println("Opening link in tab.");

		ArrayList<String> alltabs = new ArrayList<>(getDriver().getWindowHandles());
		getDriver().switchTo().window(alltabs.get(1));
		System.out.println("Switched to new tab.");
		youtubeLink = getUrl();
		System.out.println("URL: " + youtubeLink);
	}

	@Then("User should be navigated to JHI Youtube page {string}")
	public void user_should_be_navigated_to_jhi_youtube_page(String string) {
		org.junit.Assert.assertEquals(string, youtubeLink);
		getDriver().close();
		System.out.println("Closed new tab.");

		ArrayList<String> alltabs = new ArrayList<>(getDriver().getWindowHandles());
		getDriver().switchTo().window(alltabs.get(0));
		System.out.println("Switched back to parent tab.");
		cf.sleepWait(3000);
	}

}
