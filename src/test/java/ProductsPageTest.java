import Pages.LoginPage;
import Pages.ProductsPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ProductsPageTest {
    WebDriver driver;
    LoginPage loginPageObject;
    ProductsPage productPageObject;


    @BeforeTest
    public void setDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.automationexercise.com/products");
    }
    /*
    @Test
    public void addToCart(){
        productPageObject.clickAddToCart(2);
        Assert.assertTrue(driver.findElement(By.xpath("//p[contains(text(),'Your product has been added to cart.')]")).isDisplayed());
    }*/



    @AfterTest
    public void quit()  {
        if (driver != null) {
            driver.quit();
        }
    }
}
