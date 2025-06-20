package PageObjects;

import Base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {

        super(driver);
    }

    By SearchBox = By.id("search");

    By message = By.cssSelector(".message.notice");

    public void searchForProduct(String keyword){
        driver.findElement(SearchBox).sendKeys(keyword);
        driver.findElement(SearchBox).sendKeys(Keys.ENTER);

    }

    public void InvalidSearchAssertion(){
        WebElement msg = driver.findElement(message);
        Assert.assertTrue(msg.getText().contains("Minimum Search query length is 3"), "Invalid search message not displayed");
    }
}
