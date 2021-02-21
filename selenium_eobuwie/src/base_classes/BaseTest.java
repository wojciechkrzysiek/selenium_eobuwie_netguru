package base_classes;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {

    private WebDriver driver;

    @BeforeSuite
    public void beforeSuite(){
        System.setProperty("headless", "false");
        String headless = System.getProperty("headless");

        WebDriverManager.chromedriver().browserVersion("88.0.4324.96").setup();
        if("true".equals(headless)){
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--headless");
            driver = new ChromeDriver(chromeOptions);
        } else{
            driver = new ChromeDriver();
        }
    }

    @AfterSuite
    public void afterSuite(){
        if(null != driver){
            driver.close();
            driver.quit();
        }
    }

    public WebDriver getDriver(){
        return driver;
    }
}
