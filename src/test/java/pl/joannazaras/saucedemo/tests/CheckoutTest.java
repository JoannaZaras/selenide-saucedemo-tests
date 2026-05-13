package pl.joannazaras.saucedemo.tests;

import org.junit.jupiter.api.Test;
import pl.joannazaras.saucedemo.BaseTest;
import pl.joannazaras.saucedemo.pages.LoginPage;

class CheckoutTest extends BaseTest {

    @Test
    void shouldCompleteCheckout() {
        new LoginPage()
                .loginAsStandardUser()
                .shouldBeOpened()
                .addBackpackToCart()
                .openCart()
                .shouldBeOpened()
                .shouldContainProduct("Sauce Labs Backpack")
                .clickCheckout()
                .shouldShowCustomerInformationStep()
                .enterFirstName("Joanna")
                .enterLastName("Zaras")
                .enterPostalCode("90-001")
                .clickContinue()
                .shouldShowOverviewStep()
                .clickFinish()
                .shouldShowCompleteMessage();
    }
}