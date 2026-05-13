package pl.joannazaras.saucedemo.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class CartPage {

    public CartPage shouldBeOpened() {
        $(".title").shouldBe(visible).shouldHave(text("Your Cart"));
        return this;
    }

    public CartPage shouldContainProduct(String productName) {
        $(".inventory_item_name").shouldBe(visible).shouldHave(text(productName));
        return this;
    }

    public CheckoutPage clickCheckout() {
        $("#checkout").shouldBe(visible).click();
        return new CheckoutPage();
    }
}