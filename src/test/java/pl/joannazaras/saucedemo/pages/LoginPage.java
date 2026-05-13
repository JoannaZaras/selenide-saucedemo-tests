package pl.joannazaras.saucedemo.pages;

import io.qameta.allure.Step;
import pl.joannazaras.saucedemo.config.ConfigReader;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public LoginPage enterUsername(String username) {
        $("#user-name").shouldBe(visible).setValue(username);
        return this;
    }

    public LoginPage enterPassword(String password) {
        $("#password").shouldBe(visible).setValue(password);
        return this;
    }

    public InventoryPage clickLoginButton() {
        $("[data-test='login-button']").shouldBe(visible).click();
        return new InventoryPage();
    }
    @Step("Login with ivalid password")
    public LoginPage loginWithInvalidPassword(String username, String password) {
        enterUsername(username);
        enterPassword(password);
        $("#login-button").click();
        return this;
    }

    public LoginPage shouldShowErrorMessage(String expectedMessage) {
        $("[data-test='error']").shouldBe(visible).shouldHave(com.codeborne.selenide.Condition.text(expectedMessage));
        return this;
    }

    @Step("Login as standard user")
    public InventoryPage loginAsStandardUser() {
        enterUsername(ConfigReader.getProperty("standard.username"));
        enterPassword(ConfigReader.getProperty("standard.password"));
        return clickLoginButton();
    }
}