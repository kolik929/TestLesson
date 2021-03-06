package seleniumTests;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    WebDriver driver;
    protected String ggrUrl = "http://localhost:4445";

    @BeforeTest
    public void beforeT() {
        ChromeOptions options = new ChromeOptions();

        DesiredCapabilities dc = DesiredCapabilities.chrome();
        dc.setCapability(ChromeOptions.CAPABILITY, options);

        URL hub = null;
        try {
            hub = new URL(ggrUrl + "/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        driver = new RemoteWebDriver(hub, dc);

        System.out.println("Дейсивие перед тестом");
    }

    @AfterTest
    public void afterT() {
        driver.quit();
        if (driver != null) {
            driver.quit();
        }

        System.out.println("Действие после теста");

    }


    public WebDriver getDriver() {
        return driver;
    }

    /**
     * Метод снятия скриншота с драйвера.
     *
     * @return
     */
    @Attachment(value = "Page screenshot", type = "image/png")
    protected byte[] getScreenShot() {

        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

}
