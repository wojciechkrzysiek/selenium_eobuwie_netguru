package tests;

import base_classes.BaseTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import page_objects.RegistrationPage;

public class RegisterAccountTest extends BaseTest {

    // Test Case #30 from Excel "Registration form"
    @Test
    @Parameters({"name", "lastname", "email", "password"})
    public void registerAccountTest(String name, String lastname, String email, String password) {
        RegistrationPage registrationPage = new RegistrationPage(getDriver());
        registrationPage.registerAccount(name, lastname, email, password);
    }
}
