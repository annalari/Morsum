package stepDefinitions;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CartPage;
import pages.HomePage;
import pages.ItemPage;
import pages.LoginPage;

public class AddProductToCartStep {
    Playwright playwright = Playwright.create();
    BrowserType chromium = playwright.chromium();
    Browser browser = chromium.launch(new BrowserType.LaunchOptions().setHeadless(false).setChannel("chrome"));
    Page page = browser.newPage();
    LoginPage loginPage = new LoginPage(page);;
    HomePage homePage = new HomePage(page);
    ItemPage itemPage = new ItemPage(page);
    CartPage cartPage = new CartPage(page);

    @Given("User logged in the app using username {string} and password {string}")
    public void user_logged_in_the_app_using_username_and_password(String username, String password) {
        page.navigate("https://www.saucedemo.com/");
        loginPage.login(username, password);
    }

    @When("user sorts by prices high to low")
    public void user_sorts_by_prices_high_to_low() {
        homePage.sortItemsHighLow();
    }

    @And("user selects sauce labs bike light")
    public void user_selects_sauce_labs_bike_light() {
        homePage.selectItem();
    }


    @And("user add this element to cart")
    public void user_add_this_element_to_cart() {
        itemPage.clickAddToCart();
    }

    @And("user goes to cart")
    public void user_goes_to_cart() {
        homePage.clickCartIcon();
    }

    @Then("user validate that all products selected are in the cart")
    public void user_validate_that_all_products_selected_are_in_the_cart() {
        cartPage.assertItemsInCart();
    }


    @When("user add to cart the first {string} elements")
    public void user_add_to_cart_the_first_elements(String number) {
        homePage.addMoreThenOneItemToCart(number);
    }


}
