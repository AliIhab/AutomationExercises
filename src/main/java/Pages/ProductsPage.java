package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
public class ProductsPage {
    public WebDriver driver;
    WebDriverWait wait;
    public ProductsPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    }
    By searchField = By.id("search_product");
    By searchButton = By.id("submit_search");
    By womenCategory = By.xpath("//div[@class='left-sidebar']//a[contains(text(),'Women')]");
    By menCategory = By.xpath("//div[@class='left-sidebar']//a[contains(text(),'Men')]");
    By kidsCategory = By.xpath("//div[@class='left-sidebar']//a[contains(text(),'Kids')]");
    By womenTops = By.xpath("//div[@class='left-sidebar']//a[contains(text(),'Tops') and contains(@href,'women-tops')]");
    By womenDresses = By.xpath("//div[@class='left-sidebar']//a[contains(text(),'Dresses') and contains(@href,'women-dresses')]");
    By womenSaree = By.xpath("//div[@class='left-sidebar']//a[contains(text(),'Saree') and contains(@href,'women-saree')]");

    // Define By variables for Men category and subcategory filters
    By menTshirts = By.xpath("//div[@class='left-sidebar']//a[contains(text(),'Tshirts') and contains(@href,'men-tshirts')]");By menJeans = By.xpath("//div[@class='left-sidebar']//a[contains(text(),'Jeans') and contains(@href,'men-jeans')]");

    // Define By variables for Kids category and subcategory filters
    By kidsDress = By.xpath("//div[@class='left-sidebar']//a[contains(text(),'Dress') and contains(@href,'kids-dress')]");
    By kidsTopsShirts = By.xpath("//div[@class='left-sidebar']//a[contains(text(),'Tops & Shirts') and contains(@href,'kids-tops-shirts')]");

    // Define By variables for brand filters
    By poloBrand = By.xpath("//div[@class='brands-name']//a[contains(text(),'Polo')]");
    By hmBrand = By.xpath("//div[@class='brands-name']//a[contains(text(),'H&M')]");
    By madameBrand = By.xpath("//div[@class='brands-name']//a[contains(text(),'Madame')]");
    By mastHarbourBrand = By.xpath("//div[@class='brands-name']//a[contains(text(),'Mast & Harbour')]");
    By babyhugBrand = By.xpath("//div[@class='brands-name']//a[contains(text(),'Babyhug')]");
    By allenSollyJuniorBrand = By.xpath("//div[@class='brands-name']//a[contains(text(),'Allen Solly Junior')]");
    By kookieKidsBrand = By.xpath("//div[@class='brands-name']//a[contains(text(),'Kookie Kids')]");
    By bibaBrand = By.xpath("//div[@class='brands-name']//a[contains(text(),'Biba')]");
    public void pressWomenCategory() {
        wait.until(ExpectedConditions.elementToBeClickable(womenCategory)).click();
    }

    // Function to press Men category
    public void pressMenCategory() {
        wait.until(ExpectedConditions.elementToBeClickable(menCategory)).click();
    }

    // Function to press Kids category
    public void pressKidsCategory() {
        wait.until(ExpectedConditions.elementToBeClickable(kidsCategory)).click();
    }
    public void pressWomenTops() {
        wait.until(ExpectedConditions.elementToBeClickable(womenTops)).click();
    }

    // Function to press Women Dresses filter
    public void pressWomenDresses() {
        wait.until(ExpectedConditions.elementToBeClickable(womenDresses)).click();
    }

    // Function to press Women Saree filter
    public void pressWomenSaree() {
        wait.until(ExpectedConditions.elementToBeClickable(womenSaree)).click();
    }

    // Function to press Men Tshirts filter
    public void pressMenTshirts() {
        wait.until(ExpectedConditions.elementToBeClickable(menTshirts)).click();
    }

    // Function to press Men Jeans filter
    public void pressMenJeans() {
        wait.until(ExpectedConditions.elementToBeClickable(menJeans)).click();
    }

    // Function to press Kids Dress filter
    public void pressKidsDress() {
        wait.until(ExpectedConditions.elementToBeClickable(kidsDress)).click();
    }

    // Function to press Kids Tops & Shirts filter
    public void pressKidsTopsShirts() {
        wait.until(ExpectedConditions.elementToBeClickable(kidsTopsShirts)).click();
    }

    // Function to press Polo brand filter
    public void pressPoloBrand() {
        wait.until(ExpectedConditions.elementToBeClickable(poloBrand)).click();
    }

    // Function to press H&M brand filter
    public void pressHMBrand() {
        wait.until(ExpectedConditions.elementToBeClickable(hmBrand)).click();
    }

    // Function to press Madame brand filter
    public void pressMadameBrand() {
        wait.until(ExpectedConditions.elementToBeClickable(madameBrand)).click();
    }

    // Function to press Mast & Harbour brand filter
    public void pressMastHarbourBrand() {
        wait.until(ExpectedConditions.elementToBeClickable(mastHarbourBrand)).click();
    }

    // Function to press Babyhug brand filter
    public void pressBabyhugBrand() {
        wait.until(ExpectedConditions.elementToBeClickable(babyhugBrand)).click();
    }

    // Function to press Allen Solly Junior brand filter
    public void pressAllenSollyJuniorBrand() {
        wait.until(ExpectedConditions.elementToBeClickable(allenSollyJuniorBrand)).click();
    }

    // Function to press Kookie Kids brand filter
    public void pressKookieKidsBrand() {
        wait.until(ExpectedConditions.elementToBeClickable(kookieKidsBrand)).click();
    }

    // Function to press Biba brand filter
    public void pressBibaBrand() {
        wait.until(ExpectedConditions.elementToBeClickable(bibaBrand)).click();
    }
    public void pressSearchButton() {
        wait.until(ExpectedConditions.elementToBeClickable(searchButton)).click();
    }
    public void enterSearchItem(String a)
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(searchField)).sendKeys(a);
    }





}



