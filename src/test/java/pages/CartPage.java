package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import java.util.ArrayList;
import java.util.List;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class CartPage {

    protected Page page;

    public CartPage(Page page) {
        this.page = page;
    }

    public void assertItemsInCart() {
        assertThat(page.locator("div.cart_quantity")).hasText("1");
        assertThat(page.locator("#item_0_title_link")).hasText("Sauce Labs Bike Light");
    }

    public void assertMoreThanOneItemInCart(String number) {

        int i = Integer.parseInt(number);
        assertThat(page.locator("//div[@class='cart_list']//div[@class='cart_item']")).hasCount(i);

    }
}
