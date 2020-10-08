package firstTests;

import constructors.FirstConstructor;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ThirdTest extends BaseTest {

    String firstParam = "Кто виноват?";
    String secondParam = "Nobody";

    @Parameters({"iDoNotKnow", "iKnow"})
    @Test
    public void startTest(final String firstParam, String secondParam) {
        System.out.println("Первый параметр=" + firstParam);
        System.out.println("Второй параметр=" + secondParam);
        System.out.println(" но на самом деле " + this.firstParam + " " + this.secondParam);
        this.firstParam = firstParam;
        this.secondParam = secondParam;

    }

    @Test(priority = 1)
    public void startTest() {
        System.out.println("Вторая жизнь параметров");
        System.out.println("Первый параметр=" + firstParam);
        System.out.println("Второй параметр=" + secondParam);

    }

    @Test(priority = 2)
    public void startTestV2() {
        FirstConstructor constr = new FirstConstructor();
        System.out.println("Параметры конструктора ");
        System.out.println("Первый параметр=" + constr.constParam1);
        System.out.println("Второй параметр=" + constr.constParam2);

    }


}
