package pl.joannazaras.saucedemo.pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class CheckoutPage {

    public CheckoutPage shouldShowCustomerInformationStep() {
        $(".title").shouldBe(visible).shouldHave(text("Checkout: Your Information"));
        return this;
    }

    @Step("Enter customer first name: {firstName}")
    public CheckoutPage enterFirstName(String firstName) {
        $("#first-name").shouldBe(visible).setValue(firstName);
        return this;
    }

    public CheckoutPage enterLastName(String lastName) {
        $("#last-name").shouldBe(visible).setValue(lastName);
        return this;
    }

    public CheckoutPage enterPostalCode(String postalCode) {
        $("#postal-code").shouldBe(visible).setValue(postalCode);
        return this;
    }

    public CheckoutPage clickContinue() {
        $("#continue").shouldBe(visible).click();
        return this;
    }

    public CheckoutPage shouldShowOverviewStep() {
        $(".title").shouldBe(visible).shouldHave(text("Checkout: Overview"));
        return this;
    }

    @Step("Finish checkout")
    public CheckoutPage clickFinish() {
        $("#finish").shouldBe(visible).click();
        return this;
    }

    public CheckoutPage shouldShowCompleteMessage() {
        $(".title").shouldBe(visible).shouldHave(text("Checkout: Complete!"));
        $(".complete-header").shouldBe(visible).shouldHave(text("Thank you for your order!"));
        return this;
    }
}