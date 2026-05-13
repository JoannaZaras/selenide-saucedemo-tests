package pl.joannazaras.saucedemo.tests;

import org.junit.jupiter.api.Test;
import pl.joannazaras.saucedemo.BaseTest;
import pl.joannazaras.saucedemo.config.ConfigReader;
import pl.joannazaras.saucedemo.pages.LoginPage;

class LoginTest extends BaseTest {

    @Test
    void shouldLoginWithValidCredentials() {
        new LoginPage()
                .loginAsStandardUser()
                .shouldBeOpened();
    }

    @Test
    void shouldShowErrorForInvalidPassword() {
        new LoginPage()
                .loginWithInvalidPassword(
                        ConfigReader.getProperty("standard.username"),
                        "wrong_password")
                .shouldShowErrorMessage("Username and password do not match");
    }
}