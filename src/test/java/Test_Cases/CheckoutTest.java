package Test_Cases;

import BaseTest.Base_Test;
import PageObjects.CartPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CheckoutTest extends Base_Test {

    @Test (priority = 4)
    public void checkoutTest() throws InterruptedException {

        homePage.searchForProduct("WJ08");
        searchResultsPage.selectProduct();
        productPage.selectSize("1");
        productPage.selectColor("2");
        productPage.clickAddToCart();
        productPage.confirmationMessage();
        cartPage.cartButtonWait();
        cartPage.clickCartButton();
        cartPage.proceedToCheckoutWait();
        cartPage.proceedToCheckout();
        checkoutPage.waitEmailField();
        checkoutPage.enterMail("sohaila.hassan@gmail.com");
        checkoutPage.enterFirstName("Sohaila");
        checkoutPage.enterLastName("Hassan");
        checkoutPage.enterAddress("6th of October city");
        checkoutPage.enterCity("October");
        checkoutPage.selectStateOrProvince("Alabama");
        checkoutPage.enterPostalCode("111111");
        checkoutPage.selectCountry("Egypt");
        checkoutPage.enterPhoneNumber("0120259909");
        checkoutPage.selectShippingMethod();
        checkoutPage.waitNextButton();
        checkoutPage.clickNextButton();
        checkoutPage.waitPlaceOrder();
        checkoutPage.clickPlaceOrder();

    }
}
