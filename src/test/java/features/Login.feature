Feature: Login

@Login
Scenario Outline: Successful Login with Valid Credentials
  Given User open url "http://192.168.53.25/helpdesk_beta/login"
  When User enter the email "<email>"
  And User enter the password "<password>"
  Then Click on Login button

Examples:
  | email             | password    |
  | admin@cbiuae.com  | cbiuae      |
  | user1@example.com | cbiuae123   |
  | admin@cbiuae.com  | cbiuae123   |

@customer
Scenario: Successful Add a Customer details
    When I click on the customer
    Then I have to add the customer 
    And I have to text the customer name
    And I have to text the mobile number
    Then I have to click on apply button
    
@ticket   
Scenario: Successfull ticket created
    When I should click on ticket 
    Then I should click on Create ticket 
    Then I should text on mobile number 
    And I should click on search 
    And I should select the radio button
    When I should select the channel
    Then I should select the case type
    When I should select the complaint category
    Then I should select the complaint
    Then I should select the user
    Then I should create the ticket
    
@ticket 
    Scenario: Add filters Ticket
    When I click on the "Ticket" button
    And I click on "Filters" button
    When User selects the from date as "01-06-2023"
    And User selects the to date as "2023-06-19"
    Then I select the "Damas"
    And I select the department "Call center"
    And I select the Agent "sunil@damas.com"
    Then I select the Agent name "shruthi@damas.com"
    Then I click on Apply button
    
@Reports
   Scenario: Add Ticket Reports
   Given I have to click "Reports" button
   When I have to Click Reports "Ticket reports" button.
   When I had to click "filters" button
   Then I have to select the "This month" 
   Then I have to click "Apply"
   
    
@Reports
   Scenario: Add Audit Reports
   Given I have to click Reports button "Reports"
   When I had to click call Audit reports
   When I had the click filters button "filters"
   Then I had to select weak "This week"
   Then I had to click apply button
   
   
@Reports
   Scenario: Add Complaint Reports
   Given I go to click reports
   When I go to click complaint reports
   
@Reports
   Scenario: Add Agent work balance Reports
   Given I went to click reports
   When I went to click Agent work balance 
   
@Reports
   Scenario: Add Department work balance Reports
   Given I have to click dept "report" 
   When I have to click department work balance 
   
   
@KB
   Scenario: filters KB
   Given I have to click "KB" kb  
   When I have to click Knowledge base
   When I have to choose category 
   Then I have to select the category "Today offers" 
   Then I have to choose group
   Then I have to select group "Drama"
   
@KB
   Scenario: Add KB
   Given I have to click Knowledge "KB"  
   When I have to click create KB
   When I have to click KB create
   Then I have to text on title 
   And I have to select category1
   Then I have to select Today offers category 
   And I have to select group1 
   Then I have to select Drama group
   And I have to text the describe "This is KB"
   Then I have to click the button create
   
@Settings
   Scenario: Sittings master category
   Given I have to click on sitting master
   When I have to click the category 
   Then I have to click on create category KB
   When I have to give the category name
   Then I have to click on create 
   
@Settings
   Scenario: Sittings master group
   Given I had to click on sitting 
   When I had to click on group
   Then I had to click on create group
   And I had to select the group category
   When I had to gave the group name
   Then I had to click on add create button
   
@Settings
   Scenario: Add one role
   Given I should click the sittings
   Then I should select the role
   Then I should click on create role
   Then I should text on role name
   Then I should select the customer radio button
   Then I should select the ticket radio button
   Then I should click the create button
   
@Settings
   Scenario: Sittings master Facility
   Given I had to click sitting masters
   When I have to click on Facility 
   Then I have to create on facility 
   And I have to text on facility name "test"
   Then I have click on apply 
   
@Settings
   Scenario: Sittings master dep
   Given I have to click sittings
   When I have to click on department
   Then I have to click the create department
   Then I have to select the facitity 
   And I have to text on dep name "damas"
   And I have to text on dep label"test"
   Then I have to click the create button
   
@Settings
   Scenario: Sittings master call reason
   Given I have to click sit mast
   When I have to click on call reason
   Then I have to click on create call reason
   And I have to text call reason "Enquary"
   Then I have to click an create 
   
@Settings
   Scenario: Sittings master complaint
   Given I have to click sit master
   When I click on complaint button
   Then I have to click on new complaint button
   Then I have to select the category 
   Then I have to text the complaint name
   Then I have to text on complaint number
   And I have to select the priority
   And I have to select the facility
   And I have to select the department 
   Then I have to click the create btn
   
@Settings
   Scenario: Sittings master category
   Given I have to click sitting mast
   When I have to click an category button
   Then I have to click the create category complaint name 
   Then I have to text on category name 
   Then I have to click cat apply
