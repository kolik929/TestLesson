package firstTests;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//@Test(priority = 1)
public class FirstTest extends BaseTest {

    @Epic("ТестНГ")
    @Feature("Проверерка файла")
    @Story("Проверка на тест")
    @Test
    public void startTest() {
        System.out.println("Первый тест");
        String curDir = System.getProperty("user.dir");

        String filePath = curDir + "\\src\\main\\resources\\test";
        String line = null;
        c.logToReport("Читаем файл ");
        try {
            BufferedReader bf = new BufferedReader(new FileReader(filePath));
            line = bf.readLine();

        } catch (IOException e) {
            e.printStackTrace();
        }
        c.logToReport("Проверяем что в файле есть определенные слова ");
        System.out.println(line);
        Assertion a = new Assertion();
        a.assertTrue(line.contains("ивеыф"), "Текст содержит");

    }

    //@Test(priority = 2)
    public void startTestV2() {
        System.out.println("Второй тест");
    }

}
