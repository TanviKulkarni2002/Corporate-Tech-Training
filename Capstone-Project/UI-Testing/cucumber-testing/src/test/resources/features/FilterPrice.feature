Feature: Kurti Module

  Scenario: Filter Price Range
    Given the user has chosen a browser and logged onto the website
    When the user clicks on the Kurti tab in the navigation bar
    Then the user should see a filter option and set price range to view kurtis
    And close the browser