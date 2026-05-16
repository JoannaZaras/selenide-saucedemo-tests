package pl.joannazaras.saucedemo.pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class CheckoutInformationPage {
    public CheckoutInformationPage shouldShowCustomerInformationStep() {
        $(".title").shouldBe(visible).shouldHave(text("Checkout: Your Information"));
        return this;
    }

    @Step("Enter customer first name: {firstName}")
    public CheckoutInformationPage enterFirstName(String firstName) {
        $("#first-name").shouldBe(visible).setValue(firstName);
        return this;
    }

    public CheckoutInformationPage enterLastName(String lastName) {
        $("#last-name").shouldBe(visible).setValue(lastName);
        return this;
    }

    public CheckoutInformationPage enterPostalCode(String postalCode) {
        $("#postal-code").shouldBe(visible).setValue(postalCode);
        return this;
    }

    public CheckoutOverviewPage clickContinue() {
        $("#continue").shouldBe(visible).click();
        return new CheckoutOverviewPage();
    }

}
