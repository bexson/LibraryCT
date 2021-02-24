package com.libraryAutomation.step_definitions;

import com.github.javafaker.Faker;
import com.libraryAutomation.pages.LoginPage;
import com.libraryAutomation.pages.UsersPage;
import com.libraryAutomation.utilities.ConfigurationReader;
import com.libraryAutomation.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LibrarianAddUser_Step_Definitions {

    UsersPage usersPage = new UsersPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
    Faker faker = new Faker();

    @Given("Librarian is on user management page")
    public void librarian_is_on_user_management_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("logIn_Url"));
        new LoginPage().loginAsLibrarian();
        new UsersPage().usersModule.click();
    }

    @When("Librarian clicks Add User button")
    public void librarianClicksAddUserButton() { usersPage.addUserButton.click(); }


    @And("Librarian enters {string} in fullname")
    public void librarianEntersInFullname(String arg0) { usersPage.inputFullName.sendKeys(arg0); }

    @And("Librarian enters {string} in password box")
    public void librarian_enters_in_password_box(String string) { usersPage.inputPassword.sendKeys(string); }


    @And("Librarian enters {string} in email box")
    public void librarian_enters_in_email_box(String string) {
//        usersPage.inputEmail.sendKeys(string);
        usersPage.addEmail();
    }


    @And("Librarian chooses {string} for usergroup option")
    public void librarianChoosesForUsergroupOption(String arg0) {
        Select userGroupSelection = new Select(usersPage.userGroupDropdown);
        if (arg0.equalsIgnoreCase("Librarian")) {
            userGroupSelection.selectByValue("2");
        } else if (arg0.equalsIgnoreCase("Students")) {
            userGroupSelection.selectByValue("3");
        } else {
            Assert.fail("Input must be Librarian or Students");
        }
    }

    @And("Librarian chooses {string} for status option")
    public void librarian_chooses_for_status_option(String string) {
        Select statusSelection = new Select(usersPage.statusDropdown);
        if (string.equalsIgnoreCase("ACTIVE")) {
            statusSelection.selectByValue("ACTIVE");
        } else if (string.equalsIgnoreCase("INACTIVE")) {
            statusSelection.selectByValue("INACTIVE");
        } else {
            Assert.fail("Input must be ACTIVE or INACTIVE");
        }
    }

    @And("Librarian enters {string} from Start Date box")
    public void librarian_enters_from_start_date_box(String string) {
        usersPage.inputStartDate.clear();
        usersPage.inputStartDate.sendKeys(string);
    }

    @And("Librarian enters {string} from End Date box")
    public void librarian_enters_from_end_date_box(String string) {
        usersPage.inputEndDate.clear();
        usersPage.inputEndDate.sendKeys(string);

    }

    @And("Librarian enters {string} for Adress box")
    public void librarian_enters_for_adress_box(String string) { usersPage.inputAdress.sendKeys(string); }


    @And("Librarian clicks save changes button")
    public void librarianClicksSaveChangesButton() { usersPage.saveChangesButton.click(); }


    @Then("Librarian can see {string} in user list")
    public void librarianCanSeeInUserList(String arg0) {
        System.out.println(arg0);
        wait.until(ExpectedConditions.textToBePresentInElement(usersPage.lastAddedUserName,arg0));
        Assert.assertEquals(arg0, usersPage.lastAddedUserName.getText());

    }


    @And("Librarian clicks close button")
    public void librarianClicksCloseButton() {
        wait.until(ExpectedConditions.elementToBeClickable(usersPage.addUserCloseButton));

        usersPage.addUserCloseButton.click();

    }

    @Then("Librarian sees Add User window is closed")
    public void librarianSeesAddUserWindowIsClosed() {
        wait.until(ExpectedConditions.invisibilityOf(usersPage.addUserForm));
//        wait.until(ExpectedConditions.not(ExpectedConditions.visibilityOf(usersPage.addUserForm)));
        Assert.assertFalse(usersPage.addUserForm.isDisplayed());
    }


    @When("Librarian clicks Edit User button")
    public void librarianClicksEditUserButton() {
        usersPage.editUserButton.click();
    }

    private String randomName;

    @And("Librarian changes fullname")
    public void librarianChangesFullname() {
        randomName = faker.name().fullName();
        usersPage.inputFullName.clear();
        usersPage.inputFullName.sendKeys(randomName);
    }

    @Then("Librarian should see name changed")
    public void librarianShouldSeeNameChanged() {
        wait.until(ExpectedConditions.textToBePresentInElement(usersPage.lastAddedUserName, randomName));

        String actualName = usersPage.lastAddedUserName.getText();
        Assert.assertEquals("Edited name does not match with the actual name on the list", randomName, actualName);
    }

    private String randomEmail;

    @And("Librarian changes email")
    public void librarianChangesEmail() {
        randomEmail = faker.internet().emailAddress();
        usersPage.inputEmail.clear();
        usersPage.inputEmail.sendKeys(randomEmail);

    }

    @Then("Librarian should see email changed")
    public void librarianShouldSeeEmailChanged() {
        wait.until(ExpectedConditions.textToBePresentInElement(usersPage.lastAddedUserEmail, randomEmail));

        String actualEmail = usersPage.lastAddedUserEmail.getText();
        Assert.assertEquals("Edited name does not match with the actual name on the list", randomEmail, actualEmail);
    }

    private String userGroupBefore;

    @And("Librarian changes user group")
    public void librarianChangesUserGroup() {
        userGroupBefore = usersPage.lastAddedUserGroup.getText();
        wait.until(ExpectedConditions.elementToBeClickable(usersPage.userGroupDropdown));
        usersPage.changeUserGroup();
    }

    @Then("Librarian should see user group changed")
    public void librarianShouldSeeUserGroupChanged() {
        Assert.assertNotEquals("User group did not change", userGroupBefore, usersPage.lastAddedUserGroup);
    }

    private String nameBeforeChangingStatus;

    @And("Librarian changes status")
    public void librarianChangesStatus() {
        nameBeforeChangingStatus = usersPage.lastAddedUserName.getText();
        wait.until(ExpectedConditions.elementToBeClickable(usersPage.statusDropdown));
        usersPage.changeUserStatus();

    }

    @Then("Librarian should see status changed")
    public void librarianShouldSeeStatusChanged() {
        Assert.assertNotEquals("Could not change the status", nameBeforeChangingStatus, usersPage.lastAddedUserName);
    }
}
