package pages;
import com.microsoft.playwright.Page;
import org.junit.Assert;

public class LoginPage {

    protected Page page;

    public LoginPage(Page page) {
        this.page = page;
    }

    public void login(String username,String passwordField) {

        page.fill("[data-test=\"username\"]", username);
        page.fill("[data-test=\"password\"]", passwordField);
        page.click("[data-test=\"login-button\"]");
    }

}

