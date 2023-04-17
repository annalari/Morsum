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

    public void selectSecondItem() {
        page.click("//div[@class=\"inventory_item\"][2]//a/div");
    }

    public void clickCartIcon() {
        page.click("#shopping_cart_container");
    }
}
