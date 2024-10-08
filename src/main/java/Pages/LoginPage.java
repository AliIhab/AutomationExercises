package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {

    private WebDriver driver;
    WebDriverWait wait;
    public LoginPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    }
    By EmailAddressLogin = By.xpath("//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/input[2]");
    By password = By.xpath("//body/section[@id='form']/div[1]/div[1]/div[1]/div[1]/form[1]/input[3]");
    By LoginButton = By.xpath("//button[contains(text(),'Login')]");

    By userName = By.xpath("//body/section[@id='form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[2]");
    By EmailAddressSignup = By.xpath("//body/section[@id='form']/div[1]/div[1]/div[3]/div[1]/form[1]/input[3]");
    By SignupButton = By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[3]/div[1]/form[1]/button[1]");

    By Signout = By.partialLinkText("Logo");
    By SignoutConf = By.partialLinkText("Signup / Log");

    public void enterEmailLogin(String a){
            wait.until(ExpectedConditions.visibilityOfElementLocated(EmailAddressLogin)).sendKeys(a);
    }
    public void enterPasswordLogin(String a){
        wait.until(ExpectedConditions.visibilityOfElementLocated(password)).sendKeys(a);
    }
    public void enterEmailSignup(String a){
        wait.until(ExpectedConditions.visibilityOfElementLocated(EmailAddressSignup)).sendKeys(a);
    }
    public void enterUsername(String a){
        wait.until(ExpectedConditions.visibilityOfElementLocated(userName)).sendKeys(a);
    }
    public void pressLogin()
    {
        wait.until(ExpectedConditions.elementToBeClickable(LoginButton)).click();
    }
    public void pressSignup(){
        wait.until(ExpectedConditions.elementToBeClickable(SignupButton)).click();
    }
    public void pressSignout(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(Signout)).click();
    }
    public void signoutConfirmation(){
        wait.until(ExpectedConditions.elementToBeClickable(SignoutConf)).isDisplayed();
    }
    public void signinConfirmation(){

    }
    public void clearEmailAddressLogin()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(EmailAddressLogin)).clear();
    }
    public void clearPassword ()
    {
        wait.until(ExpectedConditions.visibilityOfElementLocated(password)).clear();
    }

}
