import Pages.CartPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CartPageTest {
    WebDriver driver;
    CartPage cartPage;
    @BeforeTest
    public void OpenURL()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.automationexercise.com/view_cart");
        cartPage = new CartPage(driver);
    }

    @Test (priority = 1)
    public void removeSleeveDress()
    {
        cartPage.removeSleevelessDressFromCart();
    }

    @Test (priority = 2)
    public void proceedToCheckout()
    {
        cartPage.goToCheckout();
    }






    @AfterTest
    public void closeURL()
    {
        driver.quit();
    }
}
