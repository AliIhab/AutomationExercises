import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
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
    @Test (priority = 2)
    public void ValidLogin(){
        By login = By.xpath("//body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[10]/a[1]");
        loginPageObject = new LoginPage(driver);
        loginPageObject.enterEmailLogin("Ali3@example.com");
        loginPageObject.enterPasswordLogin("password123");
        loginPageObject.pressLogin();
        //condition for valid login
        Assert.assertTrue(driver.findElement(login).isDisplayed());

    }
    @Test (priority = 4)
    public void SignoutTest(){
        loginPageObject = new LoginPage(driver);
        loginPageObject.pressSignout();
        loginPageObject.signoutConfirmation();
    }
    @Test (priority = 6)
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
