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
        driver.manage().window().maximize();
        driver.get("https://www.automationexercise.com/");
        homepageTest = new HomePage(driver);
    }
    @Test (priority = 1)
    public void testAddBlueTopToCart() throws InterruptedException {
        homepageTest.addBlueTopToCart();
        homepageTest.continueShoppingAfterAddToCart();
    }
    @Test (priority = 1)
    public void testAddMenShirtToCart()
    {
        homepageTest.addMenTShirtToCart();
        homepageTest.continueShoppingAfterAddToCart();
    }
    @Test (priority = 4)
    public void testAddSleevelessDressToCart()
    {
        homepageTest.addSleevelessDressToCart();
        homepageTest.goToCartAfterAddToCart();
    }
    @Test (priority = 2)
    public void dressFilter() throws InterruptedException {
        homepageTest.doDressFilter();
        Thread.sleep(100);
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.automationexercise.com/category_products/1");
    }


    @Test (priority = 2)
    public void topsFilter() throws InterruptedException {
        homepageTest.doTopsFilter();
        Thread.sleep(100);
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.automationexercise.com/category_products/2");
    }

    @Test (priority = 2)
    public void TShirtFilter ()
    {
        homepageTest.doTShirtsFilter();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.automationexercise.com/category_products/3");
    }

    @Test (priority = 2)
    public void poloBrand ()
    {
        homepageTest.getPolobrand();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.automationexercise.com/brand_products/Polo");
    }

    @Test (priority = 2)
    public void HandMBrand()
    {
        homepageTest.getHandMBrand();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.automationexercise.com/brand_products/H&M");
    }

    @Test (priority = 3)
    public void madameBrand() throws InterruptedException {
        homepageTest.getMadameBrand();
        Assert.assertEquals(driver.getCurrentUrl(),"https://www.automationexercise.com/brand_products/Madame");
        homepageTest.goToHome();
    }


    @AfterTest
    public void CloseURL()
    {
        driver.quit();
    }

}
