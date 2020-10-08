package firstTests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class SecondTest extends BaseTest {


    @DataProvider(name = "SetEnvironment", parallel = true)
    public Object[][] getData() {
        Object[][] browserProperty = new Object[][]{
                {"chrome", "70.0"},
                {"chrome", "71.0"}
        };

        return browserProperty;
    }

    @Test
    public void startTest() {
        System.out.println("Сам тест");
    }

    @Test(dataProvider = "SetEnvironment")
    public void startTestV2(String bro, String num) {
        System.out.println("Сам тест" + bro + "= " + num);
    }
}
