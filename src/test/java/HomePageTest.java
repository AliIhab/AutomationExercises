import Pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest {

    WebDriver driver;
    HomePage homepageTest;
    @BeforeTest
    public void OpenURL ()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.automationexercise.com/");
    }
    @Test (enabled = false)
    public void testAddBlueTopToCart() throws InterruptedException {
        homepageTest = new HomePage(driver);
        homepageTest.addBlueTopToCart();
        Thread.sleep(1000);
        homepageTest.continueShoppingAfterAddToCart();
    }
    @Test
    public void topsFilter()
    {
        homepageTest = new HomePage(driver);
        homepageTest.doTopsFilter();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.automationexercise.com/category_products/2");

    }




    @AfterTest
    public void CloseURL()
    {
        driver.quit();
    }

}
