Feature: Office

  @CreateOffice
  Scenario: As admin I can create office
    Given I am on the login pages
    When I enter Email "admin2@gmail.com"
    And I enter Password "admin2"
    And I click Login button
    And I am on the dashboard page
    And I click sidebar on office name
    And I click button create office
    And I add office name "kakanda tech"
    And I add address "Bogor"
    And I add office description "Lorem ipsun"
    And I add price "199000"
    And I add capacity "12"
    And I add open "08:00:01"
    And I add close "22:00:00"
    And I click projector button
    Then I click create office button
    And I am on the office information page

    @EditOffice
    Scenario: As admin I can edit office
      Given I am on the login pages
      When I enter Email "admin2@gmail.com"
      When I enter Password "admin2"
      And I click Login button
      And I am on the dashboard page
      And I click sidebar on office name
      And I click button edit office
      And I edit description office "Lorem Ipsun"
      And I edit price "140000"
      Then I click update office button
      And I click yes button of edit office
      And I can see notif successfully edit

  @EditOffice
  Scenario: As admin I can cancel edit office
    Given I am on the login pages
    When I enter Email "admin2@gmail.com"
    When I enter Password "admin2"
    And I click Login button
    And I am on the dashboard page
    And I click sidebar on office name
    And I click button edit office
    And I edit description office "Lorem Ipsun"
    And I edit price "140000"
#    And I edit price "150000" to "140000"
    Then I click update office button
    And I click back button of edit office
    And I am on the office information page

    @DeleteOffice
    Scenario: As admin I can delete office
      Given I am on the login pages
      When I enter Email "admin2@gmail.com"
      When I enter Password "admin2"
      And I click Login button
      And I am on the dashboard page
      And I click sidebar on office name
      And I click button delete office
      And I click yes of delete office
      Then I can see notif successfully delete office

      Scenario: As admin I cancel delete office
        Given I am on the login pages
        When I enter Email "admin2@gmail.com"
        When I enter Password "admin2"
        And I click Login button
        And I am on the dashboard page
        And I click sidebar on office name
        And I click button delete office
        And I click back of delete office
        Then I am on the office information page