Feature: As a librarian, I should be able to add users from users page.


  Scenario Template: Add users with all valid info
    Given Librarian is on user management page
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
      | fullname | password    | email           | usergroup | status   | startdate  | enddate    | adress   |
      | fatih    | sweetpotato | adsad@gmail.com | librarian | active   | 2015-06-20 | 2021-03-20 | anywhere |
      | husnu    | pirasa      | gregd@gmail.com | librarian | inactive | 2021-02-20 | 2021-03-20 | anywhere |
      | hasan    | maydanoz    | cxvxc@gmail.com | students  | active   | 2021-02-20 | 2021-03-20 | anywhere |
      | ali      | brokoli     | qewqw@gmail.com | students  | inactive | 2021-02-20 | 2021-03-20 | anywhere |

    @US4
    Scenario: Librarian is able to close the add user window with "close" button
      Given Librarian is on user management page
      When Librarian clicks Add User button
      And Librarian clicks close button
      Then Librarian sees Add User window is closed



