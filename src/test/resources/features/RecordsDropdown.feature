Feature: As a librarian, I should be able to see book records on user page

  Background: Librarian is already logged in
    Given Librarian is on the landing page

  @records
  Scenario: Default record is 10 verification
    When Librarian is on the Users page
    Then User should see "10" by default in the records dropdown
