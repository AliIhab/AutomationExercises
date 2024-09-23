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
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    By blueTopDelete = By.xpath("//*[@id=\"product-1\"]/td[6]/a");
    By menTShirtDelete = By.xpath("//*[@id=\"product-2\"]/td[6]/a");
    By sleevelessDressDelete = By.xpath("//*[@id=\"product-3\"]/td[6]/a");
    By proceedToCheckOut = By.xpath("//*[@id=\"do_action\"]/div[1]/div/div/a");
    By placeOrder = By.xpath("//a[contains(text(),'Place Order')]");
    By nameOnCardField = By.xpath("//body/section[@id='cart_items']/div[1]/div[3]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]");
    By cardNumberField = By.xpath("//body/section[@id='cart_items']/div[1]/div[3]/div[1]/div[2]/form[1]/div[2]/div[1]/input[1]");
    By cvcField= By.xpath("//body/section[@id='cart_items']/div[1]/div[3]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]");
    By expirationMonthField = By.xpath("//body/section[@id='cart_items']/div[1]/div[3]/div[1]/div[2]/form[1]/div[3]/div[2]/input[1]");
    By expirationYearField = By.xpath("//body/section[@id='cart_items']/div[1]/div[3]/div[1]/div[2]/form[1]/div[3]/div[3]/input[1]");
    By payAndConfirmOrderButton = By.xpath("//button[@id='submit']");
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
    public void pressPlaceOrder(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(placeOrder)).click();
    }
    public void enterNameOnCard(String a){
        wait.until(ExpectedConditions.visibilityOfElementLocated(nameOnCardField)).sendKeys(a);
    }
    public void enterCardNumber(String a){
        wait.until(ExpectedConditions.visibilityOfElementLocated(cardNumberField)).sendKeys(a);
    }
    public void enterCVC(String a){
        wait.until(ExpectedConditions.visibilityOfElementLocated(cvcField)).sendKeys(a);
    }
    public void enterExpirationMonth(String a){
        wait.until(ExpectedConditions.visibilityOfElementLocated(expirationMonthField)).sendKeys(a);
    }
    public void enterExpirationYear(String a){
        wait.until(ExpectedConditions.visibilityOfElementLocated(expirationYearField)).sendKeys(a);
    }
    public void pressPayAndConfirm(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(payAndConfirmOrderButton)).click();
    }


}
