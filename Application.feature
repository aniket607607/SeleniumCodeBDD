Feature: Test CRM

  Scenario Outline: Test CRM website
    Given I open CRM homepage
    When I enter valid "<username>" and "<password>"
    And click on login
    And landing page is displayed
    And title of homepage is retrived
    Then export is explored
    
    

    Examples: 
      | username        | password   |
      | groupautomation | Test@12345 |
      | groupautomation7832 | Test@12345jkfnmd |
      