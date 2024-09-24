import Pages.HomePage;
import Pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomePageTest {

    WebDriver driver;
    HomePage homepageTest;
    LoginPage loginPageObject;
    @BeforeClass
    public void OpenURL ()
    {
        //WebDriverManager.chromedriver().setup();
        //driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver = SignupPageTest.getDriver();
        /*driver.get("https://www.automationexercise.com/login");
        By login = By.xpath("//body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[10]/a[1]");
        loginPageObject = new LoginPage(driver);
        loginPageObject.enterEmailLogin("Ali3@example.com");
        loginPageObject.enterPasswordLogin("password123");
        loginPageObject.pressLogin();
        //condition for valid login
        Assert.assertTrue(driver.findElement(login).isDisplayed());*/
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

/*
    @AfterTest
    public void CloseURL()
    {
        driver.quit();
    }
*/
}
