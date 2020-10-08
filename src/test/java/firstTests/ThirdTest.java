package firstTests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ThirdTest extends BaseTest {

    String firstParam = "Кто виноват?";
    String secondParam = "Nobody";

    @Parameters({"iDoNotKnow", "iKnow"})
    @Test
    public void startTest(final String firstPram, String secondParam) {
        System.out.println("Первый параметр=" + firstPram);
        System.out.println("Второй параметр=" + secondParam);
        System.out.println(" но на самом деле " + this.firstParam + " " + this.secondParam);


    }
}
