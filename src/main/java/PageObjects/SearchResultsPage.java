package PageObjects;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultsPage extends BasePage {
    public SearchResultsPage(WebDriver driver) {

        super(driver);
    }

    By ProductLinks = By.cssSelector(".product-item-info a.product-item-link");

    By Product = By.className("product-image-photo");

    public void selectFirstProduct(){
        driver.findElement(ProductLinks).click();
    }

    public void selectProduct(){
        driver.findElement(Product).click();
    }
}
