Feature: Library search feature

  @user_story_8
  Scenario: borrowing books table columns names
    Given User is on the homepage
    When User click Borrowing Books module
    Then User should see the following column names:
      | Action              |
      | Book Name           |
      | Borrowed Date       |
      | Planned Return Date |
      | Return Date         |
      | Is Returned ?       |