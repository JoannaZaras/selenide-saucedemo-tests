package pl.joannazaras.saucedemo.pages;

import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class CheckoutOverviewPage {

    public CheckoutOverviewPage shouldShowOverviewStep() {
        $(".title").shouldBe(visible).shouldHave(text("Checkout: Overview"));
        return this;
    }

    @Step("Finish checkout")
    public CheckoutCompletePage clickFinish() {
        $("#finish").shouldBe(visible).click();
        return new CheckoutCompletePage();
    }
}
