package Pages;
//import org.junit.Assert.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static java.util.Objects.equals;

public class SignupPage {
    private WebDriver driver;
    WebDriverWait wait;
    public SignupPage(WebDriver driver){
        this.driver = driver;
        wait = new WebDriverWait(driver,Duration.ofSeconds(10));
    }

    By genderMale = By.id("id_gender1");
    By genderFemale = By.id("id_gender2");
    By password = By.id("password");
    By DayOfBirth = By.id("days");
    By MonthOfBirth = By.id("months");
    By YearOfBirth = By.id("years");
    By firstName = By.id("first_name");
    By lastName =By.id("last_name");
    By address1 = By.id("address1");
    By address2 = By.id("address2");
    By country = By.id("country");
    By city = By.id("city");
    By state = By.id("state");
    By zipcode =By.id("zipcode");
    By mobileNumber = By.id("mobile_number");
    By createAccountButton = By.xpath("/html[1]/body[1]/section[1]/div[1]/div[1]/div[1]/div[1]/form[1]/button[1]");
    By Continue = By.linkText("Continue");
    By DeleteAccount = By.partialLinkText("Delete Accou");
    By DeleteAccConf = By.xpath("//b[contains(text(),'Account Deleted!')]");
    public void chooseGender(String a){
        boolean c = a.equals("male");
        if (c){
            wait.until(ExpectedConditions.visibilityOfElementLocated(genderMale)).click();
        }else{ wait.until(ExpectedConditions.visibilityOfElementLocated(genderFemale)).click();}

    }
    public void enterPassword(String a){
        wait.until(ExpectedConditions.visibilityOfElementLocated(password)).sendKeys(a);
    }

    public void enterDateOfBirth(String d, String m,String y){
        Select days = new Select(driver.findElement(DayOfBirth));
        Select months = new Select(driver.findElement(MonthOfBirth));
        Select years = new Select(driver.findElement(YearOfBirth));
        days.selectByValue(d);    // Select day
        months.selectByValue(m);  // Select month
        years.selectByValue(y);
    }
    public void enterFirstName(String a){
        wait.until(ExpectedConditions.visibilityOfElementLocated(firstName)).sendKeys(a);
    }
    public void enterLastName(String a){
        wait.until(ExpectedConditions.visibilityOfElementLocated(lastName)).sendKeys(a);
    }
    public void enterAddress(String a){
        wait.until(ExpectedConditions.visibilityOfElementLocated(address1)).sendKeys(a);
    }
    public void enterAddress2(String a){
        wait.until(ExpectedConditions.visibilityOfElementLocated(address2)).sendKeys(a);
    }
    public void enterCity(String a){
        wait.until(ExpectedConditions.visibilityOfElementLocated(city)).sendKeys(a);
    }
    public void enterCountry(String a){
        Select Country = new Select(driver.findElement(country));
        Country.selectByVisibleText(a);
    }
    public void enterState(String a){
        wait.until(ExpectedConditions.visibilityOfElementLocated(state)).sendKeys(a);
    }
    public void enterZipCode(String a){
        wait.until(ExpectedConditions.visibilityOfElementLocated(zipcode)).sendKeys(a);
    }
    public void enterMobileNumber(String a){
        wait.until(ExpectedConditions.visibilityOfElementLocated(mobileNumber)).sendKeys(a);
    }

    public void pressCreateAccount(){
        wait.until(ExpectedConditions.elementToBeClickable(createAccountButton)).click();
    }
    public void pressContinue(){
        wait.until(ExpectedConditions.elementToBeClickable(Continue)).click();
    }
    public void pressDeleteAcc(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(DeleteAccount)).click();

    }
    public void deleteAccConfirmation(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(DeleteAccConf));
    }



}
