package page_objects;

import base_classes.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class RegistrationPage extends BasePage {

    @FindBy(id = "firstname")
    WebElement nameInput;

    @FindBy(id = "lastname")
    WebElement lastnameInput;

    @FindBy(id = "email_address")
    WebElement emailInput;

    @FindBy(id = "password")
    WebElement passwordInput;

    @FindBy(id = "confirmation")
    WebElement passwordConfirmationInput;

    @FindBy(css = ".checkbox-wrapper:nth-child(11) svg")
    WebElement statement;

    @FindBy(id = "create-account")
    WebElement submitButton;

    @FindBy(xpath = "//button[contains(.,'Akceptuję')]")
    WebElement confirmation;

    @FindBy(xpath = "//span[contains(.,'Dziękujemy za rejestrację w www.eobuwie.com.pl.')]")
    WebElement welcomeText;

    public RegistrationPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void registerAccount(String name, String lastname, String email, String password) {
        driver.get("https://www.eobuwie.com.pl/customer/account/create/");

        waitForElementToAppear(confirmation);
        confirmation.click();

        waitForElementToAppear(submitButton);
        nameInput.sendKeys(name);
        lastnameInput.sendKeys(lastname);
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);
        passwordConfirmationInput.sendKeys(password);
        statement.click();
        submitButton.click();

        Assert.assertEquals(welcomeText.isDisplayed(), true);
    }
}
