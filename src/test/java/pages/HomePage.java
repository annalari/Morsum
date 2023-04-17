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
        page.click("#item_0_title_link");
    }

    public void addMoreThenOneItemToCart(String number){
        int i = Integer.parseInt(number);
        for( i=1; i<=3; i++){
            assert page != null;
            page.click("//div[@class='inventory_item']["+i+"]//button");
        }
    }


    public void clickCartIcon() {
        page.click("#shopping_cart_container");
    }
}
