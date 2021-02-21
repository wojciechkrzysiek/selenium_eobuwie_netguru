package tests;

import base_classes.BaseTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import page_objects.LoginPage;

public class LoginUserTest extends BaseTest {

    // Test Case #10 from Excel "Login form"
    @Test
    @Parameters({"email", "password"})
    public void loginUserTest(String email, String password) {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.loginUser(email, password);
    }
}
