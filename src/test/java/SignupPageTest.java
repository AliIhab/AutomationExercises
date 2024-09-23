import Pages.SignupPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.time.Duration;
import Pages.LoginPage;

public class SignupPageTest {
    private static WebDriver driver;
    LoginPage loginPageObject;
    SignupPage SignupPageObject;

    public static WebDriver getDriver(){
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        return driver;
    }
    @BeforeSuite

    public void setDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.automationexercise.com/login");

    }
    @Test (priority = 1)
    public void validSignup(){
        loginPageObject = new LoginPage(driver);
        SignupPageObject = new SignupPage(driver);

        loginPageObject.enterEmailSignup("Ali33@example.com");
        loginPageObject.enterUsername("Ali Ihab");
        loginPageObject.pressSignup();
        SignupPageObject.chooseGender("male");
        SignupPageObject.enterPassword("password123");
        SignupPageObject.enterDateOfBirth("3","3","1998");
        SignupPageObject.enterFirstName("Ali");
        SignupPageObject.enterLastName("ihab");
        SignupPageObject.enterAddress("123 Test Street");
        SignupPageObject.enterCountry("United States");
        SignupPageObject.enterCity("Hollywoo");
        SignupPageObject.enterState("new york");
        SignupPageObject.enterZipCode("33333");
        SignupPageObject.enterMobileNumber("00201118675533");
        SignupPageObject.pressCreateAccount();
        SignupPageObject.pressContinue();


    }


    @Test (priority = 9)
    public void DeleteAcc(){
        SignupPageObject = new SignupPage(driver);
        SignupPageObject.pressDeleteAcc();
        SignupPageObject.deleteAccConfirmation();

    }

/*
    @AfterSuite
    public void quit()  {
        if (driver != null) {
            driver.quit();
        }
    }*/
}
