package pl.joannazaras.saucedemo.pages;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class InventoryPage {

    public InventoryPage shouldBeOpened() {
        $(".title").shouldBe(visible).shouldHave(text("Products"));
        return this;
    }

    public InventoryPage addBackpackToCart() {
        $("[data-test='add-to-cart-sauce-labs-backpack']").shouldBe(visible).click();
        return this;
    }

    public InventoryPage removeBackpackFromCart() {
        $("#remove-sauce-labs-backpack").shouldBe(visible).click();
        return this;
    }

    public InventoryPage shouldShowCartBadge(String expectedCount) {
        $(".shopping_cart_badge").shouldBe(visible).shouldHave(text(expectedCount));
        return this;
    }

    public InventoryPage shouldNotShowCartBadge() {
        $(".shopping_cart_badge").shouldNotBe(visible);
        return this;
    }

    public CartPage openCart() {
        $(".shopping_cart_link").shouldBe(visible).click();
        return new CartPage();
    }
}