package com.bookstore.step_defs;

import com.bookstore.services.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class BookStoreFlow_StepDefs {

    GetAllBooks getAllBooks=new GetAllBooks();
    AddNewUser addNewUser=new AddNewUser();
    GenerateToken generateToken=new GenerateToken();
    AuthorizeUser authorizeUser=new AuthorizeUser();
    AddNewBook addNewBook=new AddNewBook();
    GetUserInfo getUserInfo=new GetUserInfo();
    UpdateBook updateBook=new UpdateBook();
    @Given("Get all books")
    public void get_all_books() {
        getAllBooks.getAllBooks();
      }



    @Then("Validate that the books are listed")
    public void validate_that_the_books_are_listed() {
        getAllBooks.validateThatAllBooksAreListed();
       }
    @Given("Add new user")
    public void add_new_user() {
        addNewUser.addNewUser();
        }

    @Then("Validate that the user is created")
    public void validate_that_the_user_is_created() {
        addNewUser.validateThatUserIsAdded();
        }

    @Given("Generate Token")
    public void generate_Token() {
        generateToken.generateToken();

        }

    @Then("Validate that the token is generated")
    public void validate_that_the_token_is_generated() {
        generateToken.validateThatTheTokenIsGenerated();
       }

    @Given("Authorize User")
    public void authorize_User() {
        authorizeUser.authorizeUser();
         }

    @Then("Validate that the user is authorized")
    public void validate_that_the_user_is_authorized() {
        authorizeUser.valideThatAuthorized();
    }


    @Given("Add new book to the user")
    public void addNewBookToTheUser() {
        addNewBook.addNewBook();


    }

    @Then("Validate that the book is assigned to the user")
    public void validateThatTheBookIsAssignedToTheUser() {
        addNewBook.validateThatTheBookIsAssignedToTheUser();

    }

    @Given("Get User Information")
    public void getUserInformation() {
        getUserInfo.getUserInformation();
    }

    @Then("Validate That The user information is correct")
    public void validateThatTheUserInformationIsCorrect() {
        getUserInfo.validateThatUserInformationIsCorrect();
    }

    @Given("Update first book with the second one")
    public void updateFirstBookWithTheSecondOne() {
        updateBook.updateBookNumber();


    }

    @Then("Validate that the book is updated")
    public void validateThatTheBookIsUpdated() {
        updateBook.validateThatTheBookIsUpdated();
    }
}
