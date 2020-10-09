package mainPak;

import java.util.ArrayList;
import java.util.HashMap;

public class JavaLessClass {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        String str = "Строка";

        int count = 3;

        boolean go = true;

        if (count == 3) {
            count = 4;
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("Прогону номер " + i + 1);
        }

        while (go) {

            count++;

            if (count == 8) {
                System.out.println("Мы выходим из Цикла");
                break;
            }

        }

        ArrayList<String> listWords = new ArrayList<>();

        listWords.add("первый");
        listWords.add("Второй");
        listWords.add("Третий");


        HashMap<String, Integer> hashMap = new HashMap<>();

        hashMap.put("Первый", 1);
        hashMap.put("Второй", 2);
        hashMap.put("Третий", 3);

        for (String x : hashMap.keySet()) {

            for (String y : listWords) {
                if (x.equalsIgnoreCase(y)) {
                    System.out.println(hashMap.get(x) + "=" + y);
                }
            }

        }

        try {
            listWords.get(4);
        } catch (IndexOutOfBoundsException ex) {
            ex.printStackTrace();
        }
        System.out.println("Программа завершилась успешно");

    }


}

