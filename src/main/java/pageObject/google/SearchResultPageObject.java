package pageObject.google;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.asserts.Assertion;
import pageObject.Base;

public class SearchResultPageObject extends Base {
    public SearchResultPageObject(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//div[@id='top_nav']//a[contains(.,'Картинки')]")
    private WebElement imagesTab;


    @FindBy(xpath = ".//span[@role='list']//div[contains(@role,'listitem')]")
    private WebElement listBarGroupLink;


    /**
     * Кликаем по вкладке Картинки.
     */
    @Step("Кликаем по вкладке Картинки.")
    public void clickImagesTab() {
        click(imagesTab);
    }


    /**
     * Проверяем, что открыта вкладка Картинки.
     */
    @Step("Проверяем, что открыта вкладка Картинки.")
    public void assertImagesTabIsOpen() {
        Assertion a = new Assertion();
        a.assertTrue(waitVisibilityOfElement(listBarGroupLink));
    }

}
