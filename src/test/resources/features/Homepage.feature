Feature: Validate all components of JHI Homepage

  Background: 
    Given User is on the homepage

  @Smoke
  Scenario: Validate if User can login to JHI
    When User clicks on the Log In button
    And Enters Valid E-Mail Address and Password
    And Clicks on Login button
    Then User Login should be successful

  @Smoke
  Scenario: Validate Non-US Investors Link
    When User clicks on Non-US Investors Link
    Then User should be navigated to Manulife Investment Management Link "https://www.manulifeim.com/institutional/ao/en.html"

  Scenario: Validate Twitter Links
    When User scrolls down to From Twitter section
    And Clicks on the Links
    Then User should be navigated to Twitter status page

  Scenario: Validate More Tweets Link
    When User scrolls down to From Twitter section
    And Clicks on the More Tweets Link on right-side
    Then User should be navigated to JHI Twitter page "https://twitter.com/JH_Investments"

  @Sanity
  Scenario: Validate JHI Twitter page
    When User scrolls down to From Twitter section
    And Clicks on the Twitter Link
    Then User should be navigated to JHI Twitter page "https://twitter.com/JH_Investments"

  @Sanity
  Scenario: Validate JHI Facebook page
    When User scrolls down to From Twitter section
    And Clicks on the Facebook Link
    Then User should be navigated to JHI Facebook page "https://www.facebook.com/johnhancockinvestmentmanagement/"

  @Sanity
  Scenario: Validate JHI LinkedIn page
    When User scrolls down to From Twitter section
    And Clicks on the LinkedIn Link
    Then User should be navigated to JHI LinkedIn page "https://www.linkedin.com/company/john-hancock-investment-management/"

  @Sanity
  Scenario: Validate JHI Youtube page
    When User scrolls down to From Twitter section
    And Clicks on the Youtube Link
    Then User should be navigated to JHI Youtube page "https://www.youtube.com/channel/UCtE0Y9ZhERlS8JAXPlymk2Q"
