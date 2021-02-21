Feature: As a librarian, I should be able to see book records on user page

  Background: Librarian is already logged in
    Given Librarian is on the landing page

  @records
  Scenario: Default record is 10 verification
    When Librarian is on the Users page
    Then User should see "10" by default in the records dropdown


  Scenario: Options for records dropdown verification
    When Librarian is on the Users page
    And Librarian clicks to dropdown
    Then Librarian should see options below
      | 5   |
      | 10  |
      | 15  |
      | 50  |
      | 100 |
      | 200 |
      | 500 |
