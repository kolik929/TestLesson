package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

    private WebDriver driver;

    protected final int driverWaitTime = 20;

    public Base(final WebDriver driver) {
        PageFactory.initElements(driver, this);

        this.driver = driver;
    }



    public WebDriver getDriver() {
        return driver;
    }


    /**
     * Метод ждет пока элемент появится на странице.
     * Затем кликает по этому элементу.
     *
     * @param webElement
     */
    protected void click(final WebElement webElement) {

        waitVisibilityOfElement(webElement);

        webElement.click();

    }

    /**
     * Вводит текст в поле webElement.
     *
     * @param webElement
     * @param string
     */
    protected void setText(final WebElement webElement, final String string) {
        waitVisibilityOfElement(webElement);

        webElement.sendKeys(string);

    }


    /**
     * Метод ждет появления элемента на странице.
     * Затем забирает текст элемента.
     *
     * @param webElement
     * @return
     */
    protected String getText(final WebElement webElement) {
        waitVisibilityOfElement(webElement);

        return webElement.getText();
    }

    /**
     * Ждем пока элемент отобразится на странице.
     * Метод возвращает Boolean.
     *
     * @param element
     * @return
     */
    protected Boolean waitVisibilityOfElement(final WebElement element) {
        //   switchToFrame();
        WebDriverWait wait = new WebDriverWait(driver, driverWaitTime);
        try {
            wait.until(ExpectedConditions.visibilityOf(element));
            //          switchToDefaultFrame();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        //      switchToDefaultFrame();
        return false;
    }

}
