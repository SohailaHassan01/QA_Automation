package Test_Cases;

import BaseTest.Base_Test;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddToCartTest extends Base_Test {

    @Test (priority = 3)
    public void addToCart(){
        homePage.searchForProduct("WJ08");
        searchResultsPage.selectFirstProduct();
        productPage.selectSize("1");
        productPage.selectColor("2");
        productPage.clickAddToCart();
    }
}
