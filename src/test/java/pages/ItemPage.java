package pages;

import com.microsoft.playwright.Page;

public class ItemPage {

    protected Page page;
    public ItemPage(Page page) {
        this.page = page;
    }

    public void clickAddToCart() {
        page.locator("#add-to-cart-sauce-labs-backpack").click();
    }
}
