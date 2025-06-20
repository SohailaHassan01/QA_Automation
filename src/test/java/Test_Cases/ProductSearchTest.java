package Test_Cases;

import BaseTest.Base_Test;
import org.testng.annotations.Test;

public class ProductSearchTest extends Base_Test {

    @Test (priority = 2)
    public void searchForProduct(){
        //homePage.searchForProduct("Adrienne Trek Jacket");
        homePage.searchForProduct("WJ08"); //search by SKU
    }
}
