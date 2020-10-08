package firstTests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    @BeforeTest
    public void profileSetup() {
        System.out.println("Дейсивие перед тестом");
    }

    @AfterTest
    public void reportReady() {
        System.out.println("Действие после теста");
    }


    @BeforeMethod
    public void checkLogin() {
        System.out.println("Действие перед методом");
    }


    @AfterMethod
    public void screenShot() {
        System.out.println("Действие после метода");
    }
}
