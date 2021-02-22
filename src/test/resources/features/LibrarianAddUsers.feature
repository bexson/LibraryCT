Feature: As a librarian, I should be able to add users from users page.

  Background: User is on Users Module
    Given Librarian is on user management page

  @US4
  Scenario Template: Add users with all valid info
    When Librarian clicks Add User button
    And Librarian enters "<fullname>" in fullname
    * Librarian enters "<password>" in password box
    * Librarian enters "<email>" in email box
    * Librarian chooses "<usergroup>" for usergroup option
    * Librarian chooses "<status>" for status option
    * Librarian enters "<startdate>" from Start Date box
    * Librarian enters "<enddate>" from End Date box
    * Librarian enters "<adress>" for Adress box
    And Librarian clicks save changes button
    Then Librarian can see "<fullname>" in user list

    Examples:
      | fullname | password    | email           | usergroup | status | startdate  | enddate    | adress   |
      | fatih    | sweetpotato | adas@gmail.com  | librarian | active | 2015-06-20 | 2021-03-20 | anywhere |
      | husnu    | pirasa      | afas@gmail.com  | librarian | active | 2021-02-20 | 2021-03-20 | anywhere |
      | hasan    | maydanoz    | agas@gmail.com  | students  | active | 2021-02-20 | 2021-03-20 | anywhere |
      | ali      | brokoli     | afsad@gmail.com | students  | active | 2021-02-20 | 2021-03-20 | anywhere |

      #The bug is there is no way to create a user with inactive status but the option belongs to the form


  Scenario: Librarian is able to close the add user window with "close" button
    When Librarian clicks Add User button
    And Librarian clicks close button
    Then Librarian sees Add User window is closed


  Scenario: Librarian is able to edit fullname
    When Librarian clicks Edit User button
    And Librarian changes fullname
    And Librarian clicks save changes button
    Then Librarian should see name changed


  Scenario: Librarian is able to edit email
    When Librarian clicks Edit User button
    And Librarian changes email
    And Librarian clicks save changes button
    Then Librarian should see email changed


  Scenario: Librarian is able to change user group
    When Librarian clicks Edit User button
    And Librarian changes user group
    And Librarian clicks save changes button
    Then Librarian should see user group changed


  Scenario: Librarian is able to change user group
    When Librarian clicks Edit User button
    And Librarian changes status
    And Librarian clicks save changes button
    Then Librarian should see status changed




