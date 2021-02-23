@studentsAbleSearchBook
Feature: As a student, I should be able to search books with different categories.

  Background: Student is already logged in
    Given Student is on the homepage
  Scenario: Pipeline with list of book categories

    When Student click on ALL window under Book Categories
    Then Student should see the list of book categories
