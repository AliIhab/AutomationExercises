package Pages;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    WebDriverWait wait;
    public  HomePage(WebDriver driver)
    {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
    }

    By addToCartProduct1 = By.xpath("/html/body/section[2]/div[1]/div/div[2]/div[1]/div[2]/div/div[1]/div[1]/a");
    By addToCartProduct2 = By.xpath("/html/body/section[2]/div[1]/div/div[2]/div[1]/div[3]/div/div[1]/div[1]/a");
    By addToCartProduct3 = By.xpath("/html/body/section[2]/div[1]/div/div[2]/div[1]/div[4]/div/div[1]/div[1]/a");
    By home = By.partialLinkText("Home");
    By womenFilter = By.linkText("WOMEN");
    By dressFilter = By.linkText("DRESS");
    By topsFilter = By.linkText("TOPS");
    By menFilter = By.linkText("MEN");
    By tshirtsFilter = By.linkText("TSHIRTS");
    By poloBrand = By.partialLinkText("POLO");
    By HandMBrand = By.partialLinkText("H&M");
    By madameBrand = By.xpath("/html/body/section/div/div[2]/div[1]/div[1]/div[2]/div[1]/ul/li[3]/a");
    By continueShopping = By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button");
    By viewCartAfterAddToCart = By.linkText("View Cart");
    By deleteAccount = By.linkText("Delete Account");
    public void addBlueTopToCart ()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(addToCartProduct1)).click();
    }
    public void addMenTShirtToCart ()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(addToCartProduct2)).click();
    }
    public void addSleevelessDressToCart ()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(addToCartProduct3)).click();
    }
    public void doDressFilter()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(womenFilter)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(dressFilter)).click();
    }
    public void doTopsFilter () throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOfElementLocated(womenFilter)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(topsFilter)).click();
    }
    public void doTShirtsFilter()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(menFilter)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(tshirtsFilter)).click();
    }
    public void getPolobrand()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(poloBrand)).click();
    }
    public void getHandMBrand ()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(HandMBrand)).click();
    }
    public void getMadameBrand ()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(madameBrand)).click();
    }
    public void continueShoppingAfterAddToCart()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(continueShopping)).click();
    }
    public void goToCartAfterAddToCart()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(viewCartAfterAddToCart)).click();
    }

    public void goToHome()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(home)).click();
    }
    public void deleteMyAccount ()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(deleteAccount)).click();
    }

}
