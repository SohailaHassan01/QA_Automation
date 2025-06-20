package PageObjects;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;


import java.time.Duration;

public class CheckoutPage extends BasePage {
    public CheckoutPage(WebDriver driver) {

        super(driver);
    }

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    By Mail = By.id("customer-email");

    By FirstName = By.name("firstname");

    By LastName = By.name("lastname");

    By Address = By.name("street[0]");

    By City = By.name("city");

    By StateOrProvince = By.name("region_id");

    By PostalCode = By.name("postcode");

    By Country = By.name("country_id");

    By PhoneNumber = By.name("telephone");

    By NextButton = By.cssSelector("button.continue");

   // By PlaceOrder = By.xpath("//*[contains(text(), 'Place Order')]");

    By PlaceOrder = By.xpath("//button[@class='action primary checkout']");


    By ShippingMethod = By.name("ko_unique_3");

    public void enterMail(String mail) {
        driver.findElement(Mail).sendKeys(mail);
    }

    public void enterFirstName(String firstName) {
        driver.findElement(FirstName).sendKeys(firstName);
    }

    public void enterLastName(String lastName) {
        driver.findElement(LastName).sendKeys(lastName);
    }

    public void enterAddress(String address) {
        driver.findElement(Address).sendKeys(address);
    }

    public void enterCity(String city) {
        driver.findElement(City).sendKeys(city);
    }

    public void selectStateOrProvince(String stateOrProvince) {
        Select dropdown = new Select(driver.findElement(StateOrProvince));
        dropdown.selectByVisibleText(stateOrProvince);
    }

    public void enterPostalCode(String postalCode) {
        driver.findElement(PostalCode).sendKeys(postalCode);
    }

    public void selectCountry(String country) {
        Select dropdown = new Select(driver.findElement(Country));
        dropdown.selectByVisibleText(country);
    }

    public void enterPhoneNumber(String phoneNumber) {
        driver.findElement(PhoneNumber).sendKeys(phoneNumber);
    }

    public void clickNextButton() {
        driver.findElement(NextButton).click();
    }

    public void clickPlaceOrder() {
        WebElement placeOrderButton = driver.findElement(PlaceOrder);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", placeOrderButton);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", placeOrderButton);
    }

    public void clickShippingMethod() {
        WebElement radioBtn = driver.findElement(ShippingMethod);
        radioBtn.click();
    }

    public void waitEmailField() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(Mail));
    }

    public void selectShippingMethod(){
        driver.findElement(ShippingMethod).click();
    }

    public void waitNextButton() throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(NextButton));
    }

    public void waitPlaceOrder() throws InterruptedException {
        //Thread.sleep(500);
        wait.until(ExpectedConditions.elementToBeClickable(PlaceOrder));
    }

}
