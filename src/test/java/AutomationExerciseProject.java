import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;




public class AutomationExerciseProject {
    private WebDriver driver;
    private WebDriverWait wait;
    String mail = "Ali3@testexample.com";
    @BeforeTest
    public void openBrowser() throws InterruptedException {
        // Use WebDriverManager to handle WebDriver binaries automatically
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Initialize WebDriverWait with a timeout of 10 seconds
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test(priority = 2)
    public void SignupAuto() {
        driver.get("https://www.automationexercise.com");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Step 1: Navigate to the Sign Up form
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]"))).click();

        // Step 2: Fill out the first form (email and name)
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/section[@id='form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[3]"))).sendKeys(mail);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/section[@id='form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[2]"))).sendKeys("Test User");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[3]/div[1]/form[1]/button[1]"))).click();

        // Step 3: Wait for the additional information page (e.g., Gender, Password, Date of Birth, Address, etc.)
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("id_gender1"))).click();  // Select gender
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password"))).sendKeys("password123");

        // Fill out Date of Birth
        Select days = new Select(driver.findElement(By.id("days")));
        Select months = new Select(driver.findElement(By.id("months")));
        Select years = new Select(driver.findElement(By.id("years")));
        days.selectByValue("3");    // Select day
        months.selectByValue("3");  // Select month
        years.selectByValue("1998"); // Select year

        // Step 4: Address information
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("first_name"))).sendKeys("Test");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("last_name"))).sendKeys("User");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("address1"))).sendKeys("123 Test Street");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("city"))).sendKeys("Test City");

        // Select country, state, and postal code
        Select country = new Select(driver.findElement(By.id("country")));
        country.selectByVisibleText("United States");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("state"))).sendKeys("new york");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='zipcode']"))).sendKeys("33333");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='mobile_number']"))).sendKeys("00201118675533");

        // Step 5: Submit the form
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/button[1]"))).click();

        // Step 6: Verify that the account is created (e.g., check for success message)
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[text()='Account Created!']")));
        //Assert.assertTrue(driver.findElement(By.xpath("//h2[text()='Account Created!']")).isDisplayed());
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("Continue"))).click();

    }

    @Test (priority = 6)
    public void addItemToCart() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //driver.get("https://www.automationexercise.com");
        // Step 1: Add product to the cart
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[2]/a[1]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/section[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/ul[1]/li[1]/a[1]"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/section[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/a[1]"))).click();

        // Step 2: View the cart
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//u[contains(text(),'View Cart')]"))).click();
    }
    //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tr[contains(@class, 'cart_product')]")));
    @Test (priority = 7)
    public void checkout(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        // Step 3: Proceed to checkout
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Proceed To Checkout')]"))).click();

        // Step 4: Enter Shipping Details (assuming you're already logged in)

        // Step 5: Proceed with Payment and Place Order
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Place Order')]"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/section[@id='cart_items']/div[1]/div[3]/div[1]/div[2]/form[1]/div[1]/div[1]/input[1]"))).sendKeys("Test User");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/section[@id='cart_items']/div[1]/div[3]/div[1]/div[2]/form[1]/div[2]/div[1]/input[1]"))).sendKeys("1234567891234567");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/section[@id='cart_items']/div[1]/div[3]/div[1]/div[2]/form[1]/div[3]/div[1]/input[1]"))).sendKeys("123");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/section[@id='cart_items']/div[1]/div[3]/div[1]/div[2]/form[1]/div[3]/div[2]/input[1]"))).sendKeys("03");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/section[@id='cart_items']/div[1]/div[3]/div[1]/div[2]/form[1]/div[3]/div[3]/input[1]"))).sendKeys("2026");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='submit']"))).click();
        // Step 6: Verify order confirmation
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[contains(text(),'Order Placed!')]")));
        Assert.assertTrue(driver.findElement(By.xpath("//b[contains(text(),'Order Placed!')]")).isDisplayed(), "Order confirmation not displayed!");
    }






    @Test (priority = 8)
    public void Signout(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Logo"))).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Signup / Log"))).isDisplayed();

    }
    @Test (priority = 9)
    public void SigninAuto() {
        driver.get("https://www.automationexercise.com");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Step 1: Navigate to the Sign in
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//header/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[4]/a[1]"))).click();

        // Step 2: Fill out the first form (email and name)
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/input[2]"))).sendKeys(mail);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/input[3]"))).sendKeys("password123");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'Login')]"))).click();
        // make sure account is logged in
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[10]/a[1]")));
        Assert.assertTrue(driver.findElement(By.xpath("//body[1]/header[1]/div[1]/div[1]/div[1]/div[2]/div[1]/ul[1]/li[10]/a[1]")).isDisplayed());

    }
    @Test (priority = 10)
    public void DeleteAcc(){


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Delete Accou"))).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//b[contains(text(),'Account Deleted!')]")));
        Assert.assertTrue(driver.findElement(By.xpath("//b[contains(text(),'Account Deleted!')]")).isDisplayed());
    }

    @AfterTest
    public void quit()  {
        if (driver != null) {
            driver.quit();
        }
    }
}
