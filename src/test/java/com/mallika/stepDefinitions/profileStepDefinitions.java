package com.mallika.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import com.mallika.BaseLoader;
import com.mallika.pages.*;
import org.testng.Assert;

public class profileStepDefinitions extends BaseLoader {


    @When("user clicks on account")
    public void userClicksOnAccount() {
        ProfilePage profilePage = new ProfilePage(getDriver());
        profilePage.clickOnAccount();
        profilePage.clickOnInformation();
    }

    @Then("verify the name is updated with {string}")
    public void verifyTheNameIsUpdatedWith(String firstname) {

    }

    @And("updates the {string} by passing the current {string}")
    public void updatesTheByPassingTheCurrent(String name, String pwd) {
        ProfilePage profilePage = new ProfilePage(getDriver());
        profilePage.updateFirstName(name,pwd);
        profilePage.clickOnSave();
    }
}
