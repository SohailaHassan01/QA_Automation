package PageObjects;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage extends BasePage {
    public CartPage(WebDriver driver) {

        super(driver);
    }

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    By CartIcon = By.xpath("//*[contains(@class, 'showcart')]");

    By ProceedToCheckoutButton = By.xpath("//button[contains(text(),'Proceed to Checkout')]");

    public void clickCartButton(){
        driver.findElement(CartIcon).click();
    }

    public void proceedToCheckout(){
        driver.findElement(ProceedToCheckoutButton).click();
    }

    public void cartButtonWait() throws  InterruptedException {
        Thread.sleep(2000);
        wait.until(ExpectedConditions.elementToBeClickable((CartIcon)));
    }

    public void proceedToCheckoutWait() {
        wait.until(ExpectedConditions.elementToBeClickable(ProceedToCheckoutButton));
    }
}
