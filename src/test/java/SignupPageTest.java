import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import Pages.LoginPage;
import org.testng.annotations.Test;
public class SignupPageTest {
    WebDriver driver;
    LoginPage loginPageObject;

    @BeforeTest
    public void setDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.automationexercise.com/login");
    }
}
