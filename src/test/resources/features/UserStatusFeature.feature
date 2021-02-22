Feature: As a User I should be able to see options under Status dropdown

  @userStory10_1
  Scenario: verify user status

    Given the user (Librarian) on the homepage
    When the user clicks users module link
    And the user click Status dropdown
    Then the user should see the following options:

      | ACTIVE   |
      | INACTIVE |
