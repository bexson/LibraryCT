Feature: Library search feature

  @user_story_8
  Scenario Outline: borrowing books table columns names
    Given User is on the homepage
    When User click Borrowing Books module
    Then User should see the following column names:
    Examples:
      | Action              |
      | Book Name           |
      | Borrowed Data       |
      | Planned Return Date |
      | Return Data         |
      | Is Returned         |