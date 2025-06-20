package Test_Cases;

import BaseTest.Base_Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidSearchTest extends Base_Test {

    @Test (priority = 1)
    public void searchForProductTest(){
        homePage.searchForProduct("J");
        homePage.InvalidSearchAssertion();
    }
}
