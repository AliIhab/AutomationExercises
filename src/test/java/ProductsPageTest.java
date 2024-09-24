import Pages.LoginPage;
import Pages.ProductsPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class ProductsPageTest {
    WebDriver driver;
    ProductsPage productPageObject;


    @BeforeClass
    public void setDriver(){
        //WebDriverManager.chromedriver().setup();
        //driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver = SignupPageTest.getDriver();
        driver.get("https://www.automationexercise.com/products");
    }

    @Test
    public void searchProduct()
    {
        productPageObject = new ProductsPage(driver);
        productPageObject.enterSearchItem("Stylish Dress");
        productPageObject.pressSearchButton();
        Assert.assertTrue(driver.findElement(By.xpath("//h2[contains(text(),'Searched Products')]")).isDisplayed());
    }

/*
    @AfterClass
    public void quit()  {
        if (driver != null) {
            driver.quit();
        }
    }*/
}
