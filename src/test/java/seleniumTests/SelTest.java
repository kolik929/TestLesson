package seleniumTests;

import org.testng.annotations.Test;
import pageObject.google.InitPageObject;
import pageObject.google.SearchResultPageObject;

public class SelTest extends BaseTest {

    @Test
    public void startTest() {

        getDriver().get("https://www.google.ru/");
        getDriver().manage().window().maximize();
        InitPageObject in = new InitPageObject(getDriver());
        SearchResultPageObject sea = new SearchResultPageObject(getDriver());

        in.setSearchText("Привет");
        in.clickSubmitSearch();
        sea.clickImagesTab();
        sea.assertImagesTabIsOpen();


    }
}
