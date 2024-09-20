import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class LoginPageTest {
    WebDriver driver;
    LoginPage loginPageObject;

    @BeforeTest
    public void setDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.automationexercise.com/login");
    }
    @Test (priority = 8)
    public void ValidLogin(){
        loginPageObject = new LoginPage(driver);
        loginPageObject.enterEmailLogin("Ali3@example.com");
        loginPageObject.enterPasswordLogin("password123");
        loginPageObject.pressLogin();
    }
    @Test
    public void InvalidLogin(){
        loginPageObject = new LoginPage(driver);
        loginPageObject.enterEmailLogin("Ali3@example.com");
        loginPageObject.enterPasswordLogin("wrongpassword");
        loginPageObject.pressLogin();
    }


    @AfterTest
    public void quit()  {
        if (driver != null) {
            driver.quit();
        }
    }

}
