package pages;

import com.microsoft.playwright.Page;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class CartPage {

    protected Page page;

    public CartPage(Page page) {
        this.page = page;
    }

    public void assertItemsInCart() {
        assertThat(page.locator("div.cart_quantity")).hasText("1");
        assertThat(page.locator("#item_4_title_link")).hasText("Sauce Labs Backpack");
    }
}
