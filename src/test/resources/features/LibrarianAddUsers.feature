Feature: As a librarian, I should be able to add users from users page.

  @librarianAddUser
  Scenario Template: Add users with all valid info
    Given Librarian is on user management page
    When Librarian clicks Add User button
    And Librarian enters <"fullname"> in fullname
    * Librarian enters <"password"> in password box
    * Librarian enters <"email"> in email box
    And Librarian chooses <"usergroup"> for usergroup option
    * Librarian chooses <"status"> for status option
    * Librarian enters <"startdate"> from Start Date box
    * Librarian enters <"enddate"> from End Date box
    * Librarian enters <"adress"> for Adress box

    Scenarios:
      | fullname | password | email |
      | fatih    | eren     | alan  |