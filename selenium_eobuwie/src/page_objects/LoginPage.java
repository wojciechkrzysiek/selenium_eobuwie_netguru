package page_objects;

import base_classes.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class LoginPage extends BasePage {

    @FindBy(id = "login[username]")
    WebElement emailInput;

    @FindBy(id = "login[password]")
    WebElement passwordInput;

    @FindBy(name = "send")
    WebElement submitButton;

    @FindBy(xpath = "//button[contains(.,'Akceptuję')]")
    WebElement confirmation;

    @FindBy(xpath = "//h2[contains(.,'Dane konta')]")
    WebElement accountHeader;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void loginUser(String email, String password) {
        driver.get("https://www.eobuwie.com.pl/customer/account/login/");

        waitForElementToAppear(confirmation);
        confirmation.click();

        waitForElementToAppear(submitButton);
        emailInput.sendKeys(email);
        passwordInput.sendKeys(password);

        submitButton.click();

        Assert.assertEquals(accountHeader.isDisplayed(), true);
    }
}
