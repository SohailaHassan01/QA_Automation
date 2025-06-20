package PageObjects;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {

        super(driver);
    }

    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    By SizeSwatches = By.cssSelector(".swatch-attribute.size .swatch-option");

    By ColorSwatches = By.cssSelector(".swatch-attribute.color .swatch-option");

    By AddToCartButton = By.id("product-addtocart-button");

    By confirmationMessage = By.xpath("//*[contains(text(),'You added')]");

    public void selectSize(String sizeLabel){
       List<WebElement> sizes = driver.findElements(SizeSwatches);
       sizes.get(Integer.parseInt(sizeLabel)).click();

    }

    public void selectColor(String colorLabel){
        List<WebElement> colors = driver.findElements(ColorSwatches);
        colors.get(Integer.parseInt(colorLabel)).click();
    }

    public void clickAddToCart(){

        driver.findElement(AddToCartButton).click();
    }

    public void confirmationMessage(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(confirmationMessage));
    }

    public void ClickToAddCartWait() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(AddToCartButton));
    }


}
