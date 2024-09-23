import Pages.CartPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CartPageTest {
    WebDriver driver;
    CartPage cartPage;
    @BeforeClass
    public void OpenURL()
    {
        WebDriverManager.chromedriver().setup();
        //driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver = SignupPageTest.getDriver();
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
    @Test (priority = 3)
    public void placeOrder(){
        cartPage.pressPlaceOrder();
    }
    @Test (priority = 4)
    public void payAndConfirm(){
        cartPage.enterNameOnCard("Mohamed Ali");
        cartPage.enterCardNumber("1234567891234567");
        cartPage.enterCVC("123");
        cartPage.enterExpirationMonth("03");
        cartPage.enterExpirationYear("2026");
        cartPage.pressPayAndConfirm();
        Assert.assertTrue(driver.findElement(By.xpath("//b[contains(text(),'Order Placed!')]")).isDisplayed());

    }





/*
    @AfterTest
    public void closeURL()
    {
        driver.quit();
    }*/
}
