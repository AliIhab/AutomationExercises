package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    public  HomePage(WebDriver driver)
    {
        this.driver = driver;
    }
    By addToCartProduct1 = By.xpath("/html/body/section[2]/div[1]/div/div[2]/div[1]/div[2]/div/div[1]/div[1]/a");
    By addToCartProduct2 = By.id("2");
    By addToCartProduct3 = By.id("3");
    By womenFilter = By.linkText("WOMEN");
    By dressFilter = By.linkText("DRESS");
    By topsFilter = By.linkText("TOPS");
    By menFilter = By.linkText("MEN");
    By tshirtsFilter = By.linkText("TSHIRTS");
    By poloBrand = By.linkText("POLO");
    By HandMBrand = By.linkText("H&M");
    By madameBrand = By.linkText("MADAME");
    By continueShopping = By.xpath("//*[@id=\"cartModal\"]/div/div/div[3]/button");
    By viewCartAfterAddToCart = By.linkText("View Cart");
    By deleteAccount = By.linkText("Delete Account");
    public void addBlueTopToCart ()
    {
        driver.findElement(addToCartProduct1).click();
    }
    public void addMenTShirtToCart ()
    {
        driver.findElement(addToCartProduct2).click();
    }
    public void addSleevelessDressToCart ()
    {
        driver.findElement(addToCartProduct3).click();
    }
    public void doDressFilter()
    {
        driver.findElement(womenFilter).click();
        driver.findElement(dressFilter).click();
    }
    public void doTopsFilter ()
    {
        driver.findElement(womenFilter).click();
        driver.findElement(topsFilter).click();
    }
    public void doTShirtsFilter()
    {
        driver.findElement(menFilter).click();
        driver.findElement(tshirtsFilter).click();
    }
    public void getPolobrand()
    {
       driver.findElement(poloBrand).click();
    }
    public void getHandMBrand (){driver.findElement(HandMBrand).click();}
    public void getMadameBrand (){driver.findElement(madameBrand).click();}
    public void continueShoppingAfterAddToCart() {driver.findElement(continueShopping).click();}
    public void goToCartAfterAddToCart()
    {
        driver.findElement(viewCartAfterAddToCart).click();
    }
    public void deleteMyAccount ()
    {
        driver.findElement(deleteAccount).click();
    }

}
