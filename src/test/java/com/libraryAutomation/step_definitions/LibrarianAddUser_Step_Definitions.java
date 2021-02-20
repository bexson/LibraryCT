package com.libraryAutomation.step_definitions;

import com.libraryAutomation.pages.LoginPage;
import com.libraryAutomation.utilities.ConfigurationReader;
import com.libraryAutomation.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LibrarianAddUser_Step_Definitions {



    @Given("Librarian is on user management page")
    public void librarian_is_on_user_management_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("logIn_Url"));
       new LoginPage().loginAsLibrarian();
    }

    @When("Librarian clicks Add User button")
    public void librarianClicksAddUserButton() {
        System.out.println("On it");
    }


    @And("Librarian enters <{string}> in fullname")
    public void librarianEntersInFullname(String arg0) {
        System.out.println("On it");
    }

    @And("Librarian enters <{string}> in password box")
    public void librarian_enters_in_password_box(String string) {
        System.out.println("On it");
    }

    @And("Librarian enters <{string}> in email box")
    public void librarian_enters_in_email_box(String string) {
        System.out.println("On it");
    }

    @And("Librarian chooses <{string}> for usergroup option")
    public void librarianChoosesForUsergroupOption(String arg0) {
        System.out.println("On it");
    }

    @And("Librarian chooses <{string}> for status option")
    public void librarian_chooses_for_status_option(String string) {
        System.out.println("On it");
    }
    @And("Librarian enters <{string}> from Start Date box")
    public void librarian_enters_from_start_date_box(String string) {
        System.out.println("On it");
    }
    @And("Librarian enters <{string}> from End Date box")
    public void librarian_enters_from_end_date_box(String string) {
        System.out.println("On it");
    }
    @And("Librarian enters <{string}> for Adress box")
    public void librarian_enters_for_adress_box(String string) {
        System.out.println("On it");
    }
}
