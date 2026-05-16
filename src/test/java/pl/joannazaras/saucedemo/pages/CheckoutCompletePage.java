package pl.joannazaras.saucedemo.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class CheckoutCompletePage {
    public CheckoutCompletePage shouldShowCompleteMessage() {
        $(".title").shouldBe(visible).shouldHave(text("Checkout: Complete!"));
        $(".complete-header").shouldBe(visible).shouldHave(text("Thank you for your order!"));
        return this;
    }
}
