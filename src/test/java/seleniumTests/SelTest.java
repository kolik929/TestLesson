package seleniumTests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import pageObject.google.InitPageObject;
import pageObject.google.SearchResultPageObject;

public class SelTest extends BaseTest {

    @Test
    @Epic("Селениум")
    @Feature("Гугле тетс")
    @Story("Проверяем картинки")
    public void startTest() {

        getDriver().get("https://www.google.ru/");
        getDriver().manage().window().maximize();
        InitPageObject in = new InitPageObject(getDriver());
        SearchResultPageObject sea = new SearchResultPageObject(getDriver());

        in.setSearchText("Привет");
        in.clickSubmitSearch();
        sea.clickImagesTab();
        sea.assertImagesTabIsOpen();
        getScreenShot();


    }
}
