package firstTests;

import org.testng.annotations.Test;
@Test(priority = 1)
public class FirstTest extends BaseTest {

   // @Test(priority = 1)
    public void startTest() {
        System.out.println("Первый тест");
    }

    //@Test(priority = 2)
    public void startTestV2() {
        System.out.println("Второй тест");
    }

}
