package pages;

import com.microsoft.playwright.Page;

public class HomePage {
    protected Page page;

    public HomePage(Page page) {
        this.page = page;
    }

    public void sortItemsHighLow() {
        page.selectOption("select.product_sort_container","hilo");
    }

    public void selectItem() {
        page.click("#item_4_title_link");
    }

    public void clickCartIcon() {
        page.click("#shopping_cart_container");
    }
}
