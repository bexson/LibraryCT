@categoriesDD
Feature: Search books with different categories.
  7. As a student, I should be able to search books with different categories.

  Background: Student is already logged in
    Given Student is on the landing page
  Scenario: Default option is "All" by default

    When Student clicks categories dropdown

    Then Student should see all the List below

      | ALL                     |
      | Action and Adventure    |
      | Anthology               |
      | Classic                 |
      | Comic and Graphic Novel |
      | Crime and Detective     |
      | Drama                   |
      | Fable                   |
      | Fairy Tale              |
      | Fan-Fiction             |
      | Fantasy                 |
      | Historical Fiction      |
      | Horror                  |
      | Science Fiction         |
      | Biography/Autobiography |
      | Humor                   |
      | Romance                 |
      | Short Story             |
      | Essay                   |
      | Memoir                  |
      | Poetry                  |
