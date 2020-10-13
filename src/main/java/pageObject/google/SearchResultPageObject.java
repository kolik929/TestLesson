package pageObject.google;

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


    public void clickImagesTab() {
        click(imagesTab);
    }


    /**
     * Проверяем, что открыта вкладка Картинки.
     */
    public void assertImagesTabIsOpen() {
        Assertion a = new Assertion();
        a.assertTrue(waitVisibilityOfElement(listBarGroupLink));
    }

}
