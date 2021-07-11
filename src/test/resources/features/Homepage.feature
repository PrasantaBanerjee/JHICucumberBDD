Feature: Validate all components of JHI Homepage

  Background: 
    Given User is on the homepage

  @Smoke @Regression
  Scenario: Validate Non-US Investors Link
    When User clicks on Non-US Investors Link
    Then User should be navigated to Manulife Investment Management Link "https://www.manulifeim.com/institutional/ao/en.html"

  @Sanity @Regression
  Scenario: Validate JHI Twitter page
    When User scrolls down to From Twitter section
    And Clicks on the Twitter Link
    Then User should be navigated to JHI Twitter page "https://twitter.com/JH_Investments"

  @Sanity @Regression
  Scenario: Validate JHI Facebook page
    When User scrolls down to From Twitter section
    And Clicks on the Facebook Link
    Then User should be navigated to JHI Facebook page "https://www.facebook.com/johnhancockinvestmentmanagement/"

  @Sanity @Regression
  Scenario: Validate JHI LinkedIn page
    When User scrolls down to From Twitter section
    And Clicks on the LinkedIn Link
    Then User should be navigated to JHI LinkedIn page "https://www.linkedin.com/company/john-hancock-investment-management/"

  @Sanity @Regression
  Scenario: Validate JHI Youtube page
    When User scrolls down to From Twitter section
    And Clicks on the Youtube Link
    Then User should be navigated to JHI Youtube page "https://www.youtube.com/channel/UCtE0Y9ZhERlS8JAXPlymk2Q"
