@wip
Feature: BookStore Circle
  @getAllBooks
  Scenario: Scenario-1
    Given Get all books
    Then Validate that the books are listed

  @addNewUser
  Scenario: Scenario-2
    Given Add new user
    Then Validate that the user is created


    @generate
    Scenario: Scenario-3
      Given Generate Token
      Then Validate that the token is generated

      Scenario: Scenario-4
        Given Authorize User
        Then Validate that the user is authorized

        Scenario: Scenario -5
          Given Add new book to the user
          Then Validate that the book is assigned to the user

          Scenario: Scenario-6
            Given Get User Information
            Then Validate That The user information is correct

            Scenario: Scenario -7
              Given Update first book with the second one
              Then Validate that the book is updated
