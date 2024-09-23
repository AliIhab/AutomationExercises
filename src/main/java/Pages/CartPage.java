package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {
    private WebDriver driver;
    WebDriverWait wait;
    public CartPage(WebDriver driver)
    {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
    }
    By blueTopDelete = By.xpath("//*[@id=\"product-1\"]/td[6]/a");
    By menTShirtDelete = By.xpath("//*[@id=\"product-2\"]/td[6]/a");
    By sleevelessDressDelete = By.xpath("//*[@id=\"product-3\"]/td[6]/a");
    By proceedToCheckOut = By.xpath("//*[@id=\"do_action\"]/div[1]/div/div/a");

    public void removeBlueTopFromCart ()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(blueTopDelete)).click();
    }
    public void removeMenTShirtFromCart()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(menTShirtDelete)).click();
    }
    public void removeSleevelessDressFromCart()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(sleevelessDressDelete)).click();
    }
    public void goToCheckout()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(proceedToCheckOut)).click();
    }


}
