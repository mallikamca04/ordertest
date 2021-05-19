package org.orders.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.orders.BaseLoader;
import org.orders.pages.*;
import org.testng.Assert;

public class signStepDefinitions extends BaseLoader {

    @Given("the user is on sign in page")
    public void place_order_payload_with() {
        HomePage homePage = new HomePage(getDriver());
        homePage.clickLogin();
    }

    @When("user provides {string} and {string} and clicks on Sign in button")
    public void userProvidesAnd(String email, String pwd) {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.enterUsername(email);
        loginPage.enterPassword(pwd);
        loginPage.clickLogin();
    }

    @Then("user gets logged in to Orders page")
    public void userGetsLoggedInToOrdersPage() {
        System.out.println("User Logged In Successfully");
    }
    @When("user clicks on t-shirts")
    public void userClicksOnTShirts(){
        MainPage mainPage = new MainPage(getDriver());
        mainPage.clickTshirts();
    }
    @When("Adds item to cart")
    public void adds_item_to_cart() throws InterruptedException {
        TShirtPage tpage = new TShirtPage(getDriver());
        tpage.clickOnItem(TShirtPage.ITEM);
        tpage.clickOnItem(TShirtPage.CART);
        Thread.sleep(2000);
        tpage.clickOnItem(TShirtPage.CHECKOUT_1);
        Thread.sleep(2000);
        tpage.clickOnItem(TShirtPage.CHECKOUT_2);
        Thread.sleep(2000);
        tpage.clickOnItem(TShirtPage.CONFIRM_ADDRESS);

        ShippingPage shippingPage = new ShippingPage(getDriver());
        shippingPage.clickCheckBox();
        shippingPage.clickCheckoutButton();

        PaymentPage paymentPage = new PaymentPage(getDriver());
        paymentPage.clickPayOption(false);
        paymentPage.clickConfirmOrderButton();
        //String orderRef = paymentPage.getOrderRefNumber();
        paymentPage.clickBackToOrders();


    }
    @Then("verify order placed in order History")
    public void verifyOrderPlacedInOrderHistory(){
        OrdersPage ordersPage = new OrdersPage(getDriver());
        boolean ofderPlaced = ordersPage.verifyOrder();
        Assert.assertTrue(ofderPlaced);
    }

}
