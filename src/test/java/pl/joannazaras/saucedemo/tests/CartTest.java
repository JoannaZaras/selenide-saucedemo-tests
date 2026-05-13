package pl.joannazaras.saucedemo.tests;

import org.junit.jupiter.api.Test;
import pl.joannazaras.saucedemo.BaseTest;
import pl.joannazaras.saucedemo.pages.LoginPage;

class CartTest extends BaseTest {

    @Test
    void shouldAddProductToCart() {
        new LoginPage()
                .loginAsStandardUser()
                .shouldBeOpened()
                .addBackpackToCart()
                .shouldShowCartBadge("1")
                .openCart()
                .shouldBeOpened()
                .shouldContainProduct("Sauce Labs Backpack");
    }

    @Test
    void shouldRemoveProductFromCart() {
        new LoginPage()
                .loginAsStandardUser()
                .shouldBeOpened()
                .addBackpackToCart()
                .shouldShowCartBadge("1")
                .removeBackpackFromCart()
                .shouldNotShowCartBadge();
    }
}