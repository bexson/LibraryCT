Feature: As a librarian, I should be able to see book records on user page

  Background: Librarian is already logged in
    Given Librarian is on the landing page


  Scenario: Default record is 10 verification
    When Librarian is on the Users page
    Then User should see "10" by default in the records dropdown

  @records
  Scenario: All the options are same as options below
    When Librarian is on the Users page
    And Librarian clicks records dropdown
    Then User should see numbers below
      | 5   |
      | 10  |
      | 15  |
      | 50  |
      | 100 |
      | 200 |
      | 500 |